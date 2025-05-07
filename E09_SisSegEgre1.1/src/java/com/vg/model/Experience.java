package com.vg.model;

import java.sql.Date;

public class Experience {

    private int cod_exp;
    private String cargo_emp;
    private Date fch_ini;
    private Date fch_fin;
    private String time_exp;
    private int cod_alum;
    private String nom_alum;
    private String ape_alum;
    private String dni_alum;
    private int cod_emp;
    private String nom_emp;
    private String ruc_emp;

    public int getCod_exp() {
        return cod_exp;
    }

    public void setCod_exp(int cod_exp) {
        this.cod_exp = cod_exp;
    }

    public String getCargo_emp() {
        return cargo_emp;
    }

    public void setCargo_emp(String cargo_emp) {
        this.cargo_emp = cargo_emp;
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

    public String getTime_exp() {
        return time_exp;
    }

    public void setTime_exp(String time_exp) {
        this.time_exp = time_exp;
    }

    public int getCod_alum() {
        return cod_alum;
    }

    public void setCod_alum(int cod_alum) {
        this.cod_alum = cod_alum;
    }

    public String getNom_alum() {
        return nom_alum;
    }

    public void setNom_alum(String nom_alum) {
        this.nom_alum = nom_alum;
    }

    public String getApe_alum() {
        return ape_alum;
    }

    public void setApe_alum(String ape_alum) {
        this.ape_alum = ape_alum;
    }

    public String getDni_alum() {
        return dni_alum;
    }

    public void setDni_alum(String dni_alum) {
        this.dni_alum = dni_alum;
    }

    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public String getRuc_emp() {
        return ruc_emp;
    }

    public void setRuc_emp(String ruc_emp) {
        this.ruc_emp = ruc_emp;
    }
}
