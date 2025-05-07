package com.vg.controller;

import com.vg.dao.ExperienceDao;
import com.vg.model.Experience;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;

@Named(value = "experienceController")
@SessionScoped
public class ExperienceController implements Serializable {

    Experience exp = new Experience();
    ExperienceDao dao;
    private List<Experience> item;
    private Experience selected;
    
    @PostConstruct
    public void inicio(){
        dao = new ExperienceDao();
        try {
            listarExperienciaAdmin();
        } catch (Exception ex) {
            Logger.getLogger(ExperienceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarExperienciaAdmin() throws Exception{
        try {
            item = dao.lstExperiencia();
        } catch (Exception e) {
            throw e;
        }
    }

    public Experience getExp() {
        return exp;
    }

    public void setExp(Experience exp) {
        this.exp = exp;
    }

    public List<Experience> getItem() {
        return item;
    }

    public void setItem(List<Experience> item) {
        this.item = item;
    }

    public Experience getSelected() {
        return selected;
    }

    public void setSelected(Experience selected) {
        this.selected = selected;
    }
    
}
