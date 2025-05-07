
package com.vg.dao;

import com.vg.model.Capacitacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CapacitacionDao extends Dao{
    
    public void agregarCap(Capacitacion cap) throws Exception{
        this.Conexion();
        try {
            String sql = "INSERT INTO CAPACITACIONES (COD_CAP, TITLE_CAP, FCH_INI, EST_CAP, TIPO_CAP) VALUES (?,?,?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, cap.getCod_cap());
            ps.setString(2, cap.getTitle_cap());
            ps.setDate(3, cap.getFch_ini());
            ps.setDate(4, cap.getFch_fin());
            ps.setString(5, cap.getEst_cap());
            ps.setString(6, cap.getTipo_cap());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }
    }
    
    public List<Capacitacion> listarCapacitacion() throws Exception{
        List<Capacitacion> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM CAPACITACIONES";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Capacitacion cap;
            while(rs.next()){
                cap = new Capacitacion();
                cap.setCod_cap(rs.getString("COD_CAP"));
                cap.setTitle_cap(rs.getString("TITLE_CAP"));
                cap.setFch_ini(rs.getDate("FCH_INI"));
                cap.setFch_ini(rs.getDate("FCH_FIN"));
                cap.setEst_cap(rs.getString("EST_CAP"));
                cap.setEst_cap(rs.getString("TIPO_CAP"));
                lista.add(cap);
            }
            
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
}
