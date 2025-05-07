package com.vg.dao;

import com.vg.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends Dao {

    public User validar(String user, String pass) throws Exception {
        this.Conexion();
        ResultSet rs;
        User usu;
        try {
            String sql = "SELECT * FROM PERSONAS WHERE NOM_USER like ? AND PASS_USER like ?";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                usu = new User();
                usu.setCod_per(rs.getInt("COD_PER"));
                usu.setNom_per(rs.getString("NOM_PER"));
                usu.setApe_per(rs.getString("APE_PER"));
                usu.setDni_per(rs.getString("DNI_PER"));
                usu.setCorreo_per(rs.getString("CORREO_PER"));
                usu.setNom_user(rs.getString("NOM_USER"));
                usu.setPass_user(rs.getString("PASS_USER"));
                usu.setTipo_user(rs.getInt("TIPO_USER"));
//                switch (usu.getTipo_user()) {
//                    case 1:
//                        usu.setTemplate("TemplateAdmin.xhtml");
//                        break;
//                    case 2:
//                        usu.setTemplate("TemplateProfe.xhtml");
//                        break;
//                    case 3:
//                        usu.setTemplate("TemplateUser.xhtml");
//                        break;
//                }
            } else {
                usu = null;
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return usu;
    }

    public List<User> lstExperienciaUser(User us) throws Exception {
        List<User> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT ROUND(MONTHS_BETWEEN(TO_DATE(FCH_FIN), TO_DATE(FCH_INI)),0)as Meses, PERSONAS.NOM_PER, PERSONAS.APE_PER,  EMPRESAS.NOM_EMP, EMPRESAS.RUC_EMP, EXPERIENCIA.CARGO_EMP, EXPERIENCIA.FCH_INI, EXPERIENCIA.FCH_FIN\n"
                    + "    FROM EXPERIENCIA INNER JOIN PERSONAS ON EXPERIENCIA.COD_ALUM = PERSONAS.COD_PER\n"
                    + "    INNER JOIN EMPRESAS ON EXPERIENCIA.COD_EMP = EMPRESAS.COD_EMP\n"
                    + "    WHERE PERSONAS.COD_PER = ? ORDER BY EXPERIENCIA.FCH_INI desc";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, us.getCod_per());
            rs = ps.executeQuery();
            lista = new ArrayList();
            User user;
            while (rs.next()) {
                user = new User();
                user.setNom_emp(rs.getString("NOM_EMP"));
                user.setRuc_emp(rs.getString("RUC_EMP"));
                user.setCargo_emp(rs.getString("CARGO_EMP"));
                user.setFch_ini(rs.getDate("FCH_INI"));
                user.setFch_fin(rs.getDate("FCH_FIN"));
                user.setTime_exp(rs.getString("MESES"));
                lista.add(user);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    
    public void letraPerfil(User us) throws Exception{
        this.Conexion();
        ResultSet rs;
        try {
            String sql = "SELECT UPPER(SUBSTR(NOM_PER,0,1)) AS LETRA FROM PERSONAS WHERE COD_PER = ?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, us.getCod_per());
            rs = ps.executeQuery();
            rs.next();
            us.setLetraPerfil(rs.getString("LETRA"));
        } catch (SQLException e) {
            throw e;
        }
    }

}
