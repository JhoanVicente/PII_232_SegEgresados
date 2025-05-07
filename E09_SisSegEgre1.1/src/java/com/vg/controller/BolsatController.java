package com.vg.controller;

import com.vg.dao.BolsatDao;
import com.vg.model.Bolsat;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;

@Named(value = "bolsatController")
@SessionScoped
public class BolsatController implements Serializable {

    Bolsat bol = new Bolsat();
    BolsatDao dao;
    private List<Bolsat> item;
    private Bolsat selected;
    
    @PostConstruct
    public void inicio(){
        dao = new BolsatDao();
        try {
            lstBolsaTrabajo();
        } catch (Exception ex) {
            Logger.getLogger(BolsatController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void lstBolsaTrabajo() throws Exception{
        try {
            item = dao.lstBolsaTrabajo();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void agregarBol() throws Exception{
        try {
            dao.agregarBol(bol);
            lstBolsaTrabajo();
        } catch (Exception e) {
            throw e;
        }
    }

    public Bolsat getBol() {
        return bol;
    }

    public void setBol(Bolsat bol) {
        this.bol = bol;
    }

    public List<Bolsat> getItem() {
        return item;
    }

    public void setItem(List<Bolsat> item) {
        this.item = item;
    }

    public Bolsat getSelected() {
        return selected;
    }

    public void setSelected(Bolsat selected) {
        this.selected = selected;
    }
    
}
