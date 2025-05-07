package com.vg.controller;

import com.vg.dao.EgresadosDao;
import com.vg.model.Egresados;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;

@Named(value = "egresadosController")
@SessionScoped
public class EgresadosController implements Serializable {
    
    Egresados es = new Egresados();
    EgresadosDao dao;
    private List<Egresados> eg;
    private List<Egresados> al;
    private Egresados egs;
    private Egresados alm;
    
    @PostConstruct
    public void inicio() {
        dao = new EgresadosDao();
        try {
            listarEgresados();
            listarAlumnos();
            countEgresadosActiva();
        } catch (Exception e) { 
                Logger.getLogger(EgresadosController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void countEgresadosActiva(){
        try {
            dao.countEgresadosActivos(es);
        } catch (Exception e) {
        }
    
    }
    
    public void egresarAlumno() throws Exception{
        try {
            dao.egresarAlumno(alm);
            listarAlumnos();
            listarEgresados();
            countEgresadosActiva();
        } catch (SQLException e) {
        }
    
    }
    
    public void listarEgresados() throws Exception{
        try {
            eg = dao.lstEgresados();
        } catch (Exception e) {
            throw e;
        }
    
    }
    public void listarAlumnos() throws Exception{
        try {
            al = dao.lstAlumnos();
        } catch (Exception e) {
            throw e;
        }
    
    }

    public Egresados getEs() {
        return es;
    }

    public void setEs(Egresados es) {
        this.es = es;
    }
    
    
        
    public EgresadosDao getDao() {
        return dao;
    }
    public void setDao(EgresadosDao dao) {
        this.dao = dao;
    }
    public List<Egresados> getEg() {
        return eg;
    }
    public void setEg(List<Egresados> eg) {
        this.eg = eg;
    }
    public List<Egresados> getAl() {
        return al;
    }
    public void setAl(List<Egresados> al) {
        this.al = al;
    }
    public Egresados getEgs() {
        return egs;
    }
    public void setEgs(Egresados egs) {
        this.egs = egs;
    }
    public Egresados getAlm() {
        return alm;
    }
    public void setAlm(Egresados alm) {
        this.alm = alm;
    }
}
