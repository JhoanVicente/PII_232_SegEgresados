package com.vg.controller;

import com.vg.dao.CapacitacionDao;
import com.vg.model.Capacitacion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "capacitacionController")
@SessionScoped
public class CapacitacionController implements Serializable {

    Capacitacion cap = new Capacitacion();

    public void agregarCap() throws Exception{
        CapacitacionDao dao;
        try {
            dao = new CapacitacionDao();
            dao.agregarCap(cap);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Capacitacion getCap() {
        return cap;
    }

    public void setCap(Capacitacion cap) {
        this.cap = cap;
    }
    
}
