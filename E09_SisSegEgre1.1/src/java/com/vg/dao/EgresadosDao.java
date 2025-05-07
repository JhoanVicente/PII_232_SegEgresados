package com.vg.dao;

import com.vg.model.Egresados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EgresadosDao extends Dao{
    public void countEgresadosActivos(Egresados es){
    ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT COUNT(COD_PER) AS COUNTPER FROM PERSONAS WHERE EST_PER = 'E'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            rs.next();
            es.setCOUNT_PER(rs.getString("COUNTPER"));
        } catch (SQLException e) {
        }
    }
    
    public List<Egresados> lstEgresados() throws Exception{
        List<Egresados> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM PERSONAS WHERE EST_PER  = 'E'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Egresados emp;
            while(rs.next()){
                emp = new Egresados();
                emp.setCOD_PER(rs.getInt("COD_PER"));
                emp.setNOM_PER(rs.getString("NOM_PER"));
                emp.setAPE_PER(rs.getString("APE_PER"));
                emp.setDNI_PER(rs.getString("DNI_PER"));
                emp.setCORREO_PER(rs.getString("CORREO_PER"));
                emp.setCEL_PER(rs.getString("CEL_PER"));
                emp.setTELF_PER(rs.getString("TELF_PER"));
                emp.setEST_PER(rs.getString("EST_PER"));
                emp.setFCH_NAC_PER(rs.getDate("FCH_NAC_PER"));
                lista.add(emp);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    
    public List<Egresados> lstAlumnos() throws Exception{
        List<Egresados> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM PERSONAS WHERE EST_PER  = 'A'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Egresados emp;
            while(rs.next()){
                emp = new Egresados();
                emp.setCOD_PER(rs.getInt("COD_PER"));
                emp.setNOM_PER(rs.getString("NOM_PER"));
                emp.setAPE_PER(rs.getString("APE_PER"));
                emp.setDNI_PER(rs.getString("DNI_PER"));
                emp.setCORREO_PER(rs.getString("CORREO_PER"));
                emp.setCEL_PER(rs.getString("CEL_PER"));
                emp.setTELF_PER(rs.getString("TELF_PER"));
                emp.setEST_PER(rs.getString("EST_PER"));
                emp.setFCH_NAC_PER(rs.getDate("FCH_NAC_PER"));
                lista.add(emp);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    
    public void egresarAlumno(Egresados eg) throws SQLException {
        this.Conexion();
        try {
            String sql = "UPDATE PERSONAS SET EST_PER = ? WHERE COD_PER = ?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, "E");
            ps.setInt(2, eg.getCOD_PER());
            ps.executeUpdate();
        } catch (SQLException e) {
        }

    }
    
    
}
