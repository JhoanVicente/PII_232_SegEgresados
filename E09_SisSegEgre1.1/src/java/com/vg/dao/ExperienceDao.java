package com.vg.dao;

import com.vg.model.Experience;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExperienceDao extends Dao {

    public List<Experience> lstExperiencia() throws Exception{
        this.Conexion();
        List<Experience> lista;
        ResultSet rs;
        try {
            String sql = "SELECT * FROM VW_EXPERIENCIA_ADMIN";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Experience exp;
            while(rs.next()){
                exp = new Experience();
                exp.setNom_alum(rs.getString("NOM_PER"));
                exp.setApe_alum(rs.getString("APE_PER"));
                exp.setNom_emp(rs.getString("NOM_EMP"));
                exp.setRuc_emp(rs.getString("RUC_EMP"));
                exp.setCargo_emp(rs.getString("CARGO_EMP"));
                exp.setFch_ini(rs.getDate("FCH_INI"));
                exp.setFch_fin(rs.getDate("FCH_FIN"));
                lista.add(exp);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    
}
