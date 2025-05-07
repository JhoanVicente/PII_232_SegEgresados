package com.vg.model;

import java.sql.Date;

public class Capacitacion {

    private String cod_cap;
    private String title_cap;
    private Date fch_ini;
    private Date fch_fin;
    private String tipo_cap;
    private String est_cap;

    public String getCod_cap() {
        return cod_cap;
    }

    public void setCod_cap(String cod_cap) {
        this.cod_cap = cod_cap;
    }

    public String getTitle_cap() {
        return title_cap;
    }

    public void setTitle_cap(String title_cap) {
        this.title_cap = title_cap;
    }

    public Date getFch_ini() {
        return fch_ini;
    }

    public void setFch_ini(Date fch_ini) {
        this.fch_ini = fch_ini;
    }

    public Date getFch_fin() {
        return fch_fin;
    }

    public void setFch_fin(Date fch_fin) {
        this.fch_fin = fch_fin;
    }

    public String getTipo_cap() {
        return tipo_cap;
    }

    public void setTipo_cap(String tipo_cap) {
        this.tipo_cap = tipo_cap;
    }

    public String getEst_cap() {
        return est_cap;
    }

    public void setEst_cap(String est_cap) {
        this.est_cap = est_cap;
    }
    
}
