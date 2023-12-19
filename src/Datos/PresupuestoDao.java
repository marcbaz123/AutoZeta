/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Presupuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class PresupuestoDao implements IDAO {

    Connection con = null;
    ArrayList PresupuestoList = new ArrayList();
    Presupuesto presupuestoObj = null;
    PreparedStatement ps = null;

    public PresupuestoDao() {
        con = (Connection) new Conexion().Conectar();

    }

    @Override
    public ArrayList listar(String condicion) {
    /*try {
     
       String SSQL =  " SELECT id_pres , marca, modelo, "
                    + " matricula, ano_fab, n_chasis, tipo_motor, tipo_caja, modelo"
                    + " AS cliente, c.idcli, c.nom "
                    + " FROM ficha f ,cliente c "
                    + " WHERE f.idcli = c.idcli " + condicion;
       
            ps = con.prepareStatement(SSQL);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                /*presupuestoObj = new Presupuesto(
                        rs.getInt("id_ficha"),
                        rs.getString("marca"),
                        rs.getString("modelo"), 
                        rs.getString("matricula"),
                        rs.getString("ano_fab"),
                        rs.getString("n_chasis"),
                        rs.getString("tipo_motor"),
                        rs.getString("tipo_caja"),
                        rs.getString("nom"),
                        rs.getInt("idcli")
                );
                PresupuestoList.add(presupuestoObj);  
    }
    return presupuestoObj;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }*/
        return null;
    }

    @Override
    public void insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
