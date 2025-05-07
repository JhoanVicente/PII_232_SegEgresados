package com.vg.controller;

import com.vg.dao.UserDao;
import com.vg.model.User;
import com.vg.services.Funciones;
import com.vg.services.SessionUtils;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "userController")
@SessionScoped
public class UserController implements Serializable {

    User user = new User();
    private List<User> item;
    private User selected;
    

    public void iniciarSesion() throws Exception {
        UserDao dao;
        try {
            dao = new UserDao();
            String clave = Funciones.encriptar(user.getPass_user());
            user = dao.validar(user.getNom_user(), clave);
            if (user == null) {     //si no existe...
                user = new User();
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "Usuario/Contraseña incorrecto"));
            }
            else {
                HttpSession session = SessionUtils.getSession();
                session.setAttribute("username", user);
                listarExpUser();
                letraPerfil();
                switch (user.getTipo_user()) {
                    case 1:
                        FacesContext.getCurrentInstance().getExternalContext().redirect("/SEGE/faces/view/admin/dashboard.xhtml");
                        break;
                    case 2:
                        FacesContext.getCurrentInstance().getExternalContext().redirect("/SEGE/faces/view/content/experienceuser.xhtml");
                        break;
                    case 3:
                        FacesContext.getCurrentInstance().getExternalContext().redirect("/SEGE/faces/view/content/experienceuser.xhtml");
                        break;
                    default:    //Si no tiene privilegios niega el acceso
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "Usuario denegado"));
                        break;
                }
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public void listarExpUser() throws Exception {
        UserDao dao = new UserDao();
        try {
            item = dao.lstExperienciaUser(user);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void letraPerfil() throws Exception{
        UserDao dao = new UserDao();
        try {
            dao.letraPerfil(user);
        } catch (Exception e) {
            throw e;
        }
    }

    public void logout() throws Exception {
        try {
            HttpSession session = SessionUtils.getSession();
            session.invalidate();
            FacesContext.getCurrentInstance().getExternalContext().redirect("/SEGE");
        } catch (IOException e) {
            throw e;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getItem() {
        return item;
    }

    public void setItem(List<User> item) {
        this.item = item;
    }

    public User getSelected() {
        return selected;
    }

    public void setSelected(User selected) {
        this.selected = selected;
    }
}
