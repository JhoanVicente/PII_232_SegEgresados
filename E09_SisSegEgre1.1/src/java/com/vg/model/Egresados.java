package com.vg.model;

import java.sql.Date;

public class Egresados {
    
    private int 
            COD_PER;
    private String 
            COUNT_PER,
            NOM_PER,
            APE_PER,
            DNI_PER,
            CORREO_PER,
            CEL_PER,
            TELF_PER,
            EST_PER;
    private Date 
            FCH_NAC_PER;

    public String getCOUNT_PER() {
        return COUNT_PER;
    }

    public void setCOUNT_PER(String COUNT_PER) {
        this.COUNT_PER = COUNT_PER;
    }
    
    

    public int getCOD_PER() {
        return COD_PER;
    }

    public void setCOD_PER(int COD_PER) {
        this.COD_PER = COD_PER;
    }

    public String getNOM_PER() {
        return NOM_PER;
    }

    public void setNOM_PER(String NOM_PER) {
        this.NOM_PER = NOM_PER;
    }

    public String getAPE_PER() {
        return APE_PER;
    }

    public void setAPE_PER(String APE_PER) {
        this.APE_PER = APE_PER;
    }

    public String getDNI_PER() {
        return DNI_PER;
    }

    public void setDNI_PER(String DNI_PER) {
        this.DNI_PER = DNI_PER;
    }

    public String getCORREO_PER() {
        return CORREO_PER;
    }

    public void setCORREO_PER(String CORREO_PER) {
        this.CORREO_PER = CORREO_PER;
    }

    public String getCEL_PER() {
        return CEL_PER;
    }

    public void setCEL_PER(String CEL_PER) {
        this.CEL_PER = CEL_PER;
    }

    public String getTELF_PER() {
        return TELF_PER;
    }

    public void setTELF_PER(String TELF_PER) {
        this.TELF_PER = TELF_PER;
    }

    public String getEST_PER() {
        return EST_PER;
    }

    public void setEST_PER(String EST_PER) {
        this.EST_PER = EST_PER;
    }

    public Date getFCH_NAC_PER() {
        return FCH_NAC_PER;
    }

    public void setFCH_NAC_PER(Date FCH_NAC_PER) {
        this.FCH_NAC_PER = FCH_NAC_PER;
    }
    
    
}
