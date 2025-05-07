package com.vg.controller;

import com.vg.dao.EmpresaDao;
import com.vg.model.Empresas;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;

@Named(value = "empresaController")
@SessionScoped
public class EmpresaController implements Serializable {

    Empresas emp = new Empresas();
    EmpresaDao dao;
    private List<Empresas> lstActivo;
    private List<Empresas> lstInactivo;
    private Empresas selectedActivo;
    private Empresas selectedInactivo;
    
    @PostConstruct
    public void inicio(){
        dao = new EmpresaDao();
        try {
            listarEmpresasActivo();
            listarEmpresasInActivo();
            countEmpresaActiva();
        } catch (Exception ex) {
            Logger.getLogger(EmpresaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void countEmpresaActiva(){
        try {
            dao.countEmpresasactivas(emp);
        } catch (Exception e) {
        }
    
    }
    
    public void listarEmpresasActivo() throws Exception{
        try {
            lstActivo = dao.lstEmpresasActivo();
        } catch (Exception e) {
            throw e;
        }
    }  
    public void listarEmpresasInActivo() throws Exception{
        try {
            lstInactivo = dao.lstEmpresasInActivo();
        } catch (Exception e) {
            throw e;
        }
    }   
    public void agregar() throws Exception{
        try {
            dao.agregarEmp(emp);
            listarEmpresasActivo();
            listarEmpresasInActivo();
            countEmpresaActiva();
        } catch (Exception e) {
            throw e;
        }
    }  
    public void inhabilitarEmp() throws Exception{
        try {
            dao.inhabilitarEmp(selectedActivo);
            listarEmpresasActivo();
            listarEmpresasInActivo();
            countEmpresaActiva();
        } catch (SQLException e) {
            throw e;
        }
    
    }
    public void habilitarEmp() throws Exception{
        try {
            dao.habilitarEmp(selectedInactivo);
            listarEmpresasActivo();
            listarEmpresasInActivo();
            countEmpresaActiva();
        } catch (SQLException e) {
            throw e;
        }
    
    }

    public Empresas getEmp() {
        return emp;
    }

    public void setEmp(Empresas emp) {
        this.emp = emp;
    }

    public EmpresaDao getDao() {
        return dao;
    }

    public void setDao(EmpresaDao dao) {
        this.dao = dao;
    }

    public List<Empresas> getLstActivo() {
        return lstActivo;
    }

    public void setLstActivo(List<Empresas> lstActivo) {
        this.lstActivo = lstActivo;
    }

    public List<Empresas> getLstInactivo() {
        return lstInactivo;
    }

    public void setLstInactivo(List<Empresas> lstInactivo) {
        this.lstInactivo = lstInactivo;
    }

    public Empresas getSelectedActivo() {
        return selectedActivo;
    }

    public void setSelectedActivo(Empresas selectedActivo) {
        this.selectedActivo = selectedActivo;
    }

    public Empresas getSelectedInactivo() {
        return selectedInactivo;
    }

    public void setSelectedInactivo(Empresas selectedInactivo) {
        this.selectedInactivo = selectedInactivo;
    }
    
    
    

    
  
}
