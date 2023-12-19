/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Ficha;
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
public class FichaDao implements IDAO {
    Connection con = null;
    ArrayList FichaList = new ArrayList();
    Ficha fichaObj = null;
    PreparedStatement ps = null;
   
    public FichaDao() {
       con = (Connection) new Conexion().Conectar();
    
    }

    @Override
    @SuppressWarnings("unchecked")
 
    public ArrayList listar(String condicion) {
    try {
     
       String SSQL =  " SELECT id_ficha, marca, modelo, "
                    + " matricula, ano_fab, n_chasis, tipo_motor, tipo_caja, modelo"
                    + " AS cliente, c.idcli, c.nom "
                    + " FROM ficha f ,cliente c "
                    + " WHERE f.idcli = c.idcli " + condicion;
       
            ps = con.prepareStatement(SSQL);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                fichaObj = new Ficha(
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
                FichaList.add(fichaObj);  
    }
    return FichaList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }    

    @Override
    public void insertar(Object obj) {
              try {
            fichaObj = (Ficha) obj;
            String SSQL = "INSERT INTO ficha (marca, modelo, matricula, ano_fab, n_chasis, tipo_motor, tipo_caja, idcli)"
                         +" VALUES ( ?, ?, ?, ?, ?, ?, ?, ? );";
            ps = con.prepareStatement(SSQL);
            ps.setString(1, fichaObj.getMarca());
            ps.setString(2, fichaObj.getModelo());
            ps.setString(3, fichaObj.getMatricula());
            ps.setString(4, fichaObj.getAnoFab());
            ps.setString(5, fichaObj.getNChasis());
            ps.setString(6, fichaObj.getTipoMotor());
            ps.setString(7, fichaObj.getTipoCaja());
            ps.setInt(8, fichaObj.getIdcli());
        
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } }

    @Override
    public void modificar(Object obj) {
    
          try {
           fichaObj = (Ficha) obj;
            String SSQL = "UPDATE ficha SET "
                   + " marca=?, modelo=?, matricula=?, ano_fab=?, n_chasis=?, tipo_motor=?, tipo_caja=?, idcli=? WHERE id_ficha=?";
            ps = con.prepareStatement(SSQL);
            ps.setString(1, fichaObj.getMarca());
            ps.setString(2, fichaObj.getModelo());
            ps.setString(3, fichaObj.getMatricula());
            ps.setString(4, fichaObj.getAnoFab());
            ps.setString(5, fichaObj.getNChasis());
            ps.setString(6, fichaObj.getTipoMotor());
            ps.setString(7, fichaObj.getTipoCaja());
            ps.setInt(8, fichaObj.getIdcli());
            ps.setInt(9,fichaObj.getIdFicha());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void eliminar(Object obj) {
          try {
            fichaObj = (Ficha) obj;
            String SSQL = "DELETE FROM ficha WHERE id_ficha=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, fichaObj.getIdFicha());
            ps.executeUpdate();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
