package com.vg.model;

import java.sql.Date;

public class User {

    private int cod_per;
    private String nom_per;
    private String ape_per;
    private String dni_per;
    private String correo_per;
    private String est_per;
    private String nom_user;
    private String pass_user;
    private int tipo_user;
    
    private String nom_emp;
    private String ruc_emp;
    private String cargo_emp;
    private Date fch_ini;
    private Date fch_fin;
    private String time_exp;
    
    private String letraPerfil;
    private String template = "Template.xhtml";

    public String getLetraPerfil() {
        return letraPerfil;
    }

    public void setLetraPerfil(String letraPerfil) {
        this.letraPerfil = letraPerfil;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
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

    public int getCod_per() {
        return cod_per;
    }

    public void setCod_per(int cod_per) {
        this.cod_per = cod_per;
    }

    public String getNom_per() {
        return nom_per;
    }

    public void setNom_per(String nom_per) {
        this.nom_per = nom_per;
    }

    public String getApe_per() {
        return ape_per;
    }

    public void setApe_per(String ape_per) {
        this.ape_per = ape_per;
    }

    public String getDni_per() {
        return dni_per;
    }

    public void setDni_per(String dni_per) {
        this.dni_per = dni_per;
    }

    public String getCorreo_per() {
        return correo_per;
    }

    public void setCorreo_per(String correo_per) {
        this.correo_per = correo_per;
    }

    public String getEst_per() {
        return est_per;
    }

    public void setEst_per(String est_per) {
        this.est_per = est_per;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPass_user() {
        return pass_user;
    }

    public void setPass_user(String pass_user) {
        this.pass_user = pass_user;
    }

    public int getTipo_user() {
        return tipo_user;
    }

    public void setTipo_user(int tipo_user) {
        this.tipo_user = tipo_user;
    }

}
