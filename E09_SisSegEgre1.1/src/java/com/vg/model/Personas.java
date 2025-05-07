package com.vg.model;

public class Personas {

    private int cod_per;
    private String dni_per;
    private String nom_user;
    private String pass_user;
    private int tipo_user;

    public int getCod_per() {
        return cod_per;
    }

    public void setCod_per(int cod_per) {
        this.cod_per = cod_per;
    }

    public String getDni_per() {
        return dni_per;
    }

    public void setDni_per(String dni_per) {
        this.dni_per = dni_per;
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
