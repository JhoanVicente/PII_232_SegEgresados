package com.vg.dao;

import com.vg.model.Empresas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDao extends Dao{
    
    public void countEmpresasactivas(Empresas emp){
    ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT COUNT(COD_EMP) AS COUNTEMP FROM EMPRESAS WHERE EST_EMP = 'A'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            rs.next();
            emp.setCount_emp(rs.getString("COUNTEMP"));
        } catch (SQLException e) {
        }
    }
    
    public List<Empresas> lstEmpresasActivo() throws Exception{
        List<Empresas> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM EMPRESAS WHERE EST_EMP = 'A'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            //ps.setString(1, est);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Empresas emp;
            while(rs.next()){
                emp = new Empresas();
                emp.setCod_emp(rs.getInt("COD_EMP"));
                emp.setNom_emp(rs.getString("NOM_EMP"));
                emp.setEnc_emp(rs.getString("ENC_EMP"));
                emp.setRuc_emp(rs.getString("RUC_EMP"));
                emp.setDir_emp(rs.getString("DIR_EMP"));
                emp.setTel1_emp(rs.getString("TELF1_EMP"));
                emp.setTel2_emp(rs.getString("TELF2_EMP"));
                emp.setRef_emp(rs.getString("REF_EMP"));
                emp.setEst_emp(rs.getString("EST_EMP"));
                emp.setUbigeo(rs.getString("UBIGEO"));
                lista.add(emp);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    public List<Empresas> lstEmpresasInActivo() throws Exception{
        List<Empresas> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM EMPRESAS WHERE EST_EMP = 'I'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            //ps.setString(1, est);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Empresas emp;
            while(rs.next()){
                emp = new Empresas();
                emp.setCod_emp(rs.getInt("COD_EMP"));
                emp.setNom_emp(rs.getString("NOM_EMP"));
                emp.setEnc_emp(rs.getString("ENC_EMP"));
                emp.setRuc_emp(rs.getString("RUC_EMP"));
                emp.setDir_emp(rs.getString("DIR_EMP"));
                emp.setTel1_emp(rs.getString("TELF1_EMP"));
                emp.setTel2_emp(rs.getString("TELF2_EMP"));
                emp.setRef_emp(rs.getString("REF_EMP"));
                emp.setEst_emp(rs.getString("EST_EMP"));
                emp.setUbigeo(rs.getString("UBIGEO"));
                lista.add(emp);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    public void agregarEmp(Empresas emp) throws Exception{
        this.Conexion();
        try {
            String sql = "INSERT INTO EMPRESAS(NOM_EMP, ENC_EMP,RUC_EMP,DIR_EMP,TELF1_EMP,REF_EMP,EST_EMP) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, emp.getNom_emp());
            ps.setString(2, emp.getEnc_emp());
            ps.setString(3, emp.getRuc_emp());
            ps.setString(4, emp.getDir_emp());
            ps.setString(5, emp.getTel1_emp());
            ps.setString(6, emp.getRef_emp());
            ps.setString(7, "A");
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }
    }
    public void inhabilitarEmp(Empresas emp) throws SQLException {
        this.Conexion();
        try {
            String sql = "UPDATE EMPRESAS SET EST_EMP = ? WHERE COD_EMP = ?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, "I");
            ps.setInt(2, emp.getCod_emp());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }

    }
    public void habilitarEmp(Empresas emp) throws SQLException {
        this.Conexion();
        try {
            String sql = "UPDATE EMPRESAS SET EST_EMP = ? WHERE COD_EMP = ?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, "A");
            ps.setInt(2, emp.getCod_emp());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }

    }
    
}
