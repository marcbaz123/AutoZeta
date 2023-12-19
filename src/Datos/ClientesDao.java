/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo adrian
 */
public class ClientesDao implements IDAO {
    
    Connection con = null;
    ArrayList clientesList = new ArrayList();
    Clientes clientesObj = null;
    PreparedStatement ps = null;

    public ClientesDao() {
        con = (Connection) new Conexion().Conectar();
    }

    @Override
    @SuppressWarnings("unchecked")
    public ArrayList listar(String condicion) {
        try {
            String SSQL = "SELECT * FROM cliente " + condicion;
            ps = con.prepareStatement(SSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clientesObj = new Clientes(
                        rs.getInt("idcli"),
                        rs.getInt("cedula"),
                        rs.getString("nom"),
                        rs.getString("tel")
                        
                );
                clientesList.add(clientesObj);
            }
            return clientesList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

    @Override
    public void insertar(Object obj) {
        try {
            clientesObj = (Clientes) obj;
            String SSQL = "INSERT INTO cliente (cedula, nom, tel) "
                    + " VALUES ( ?, ?, ? );";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, clientesObj.getCedula());
            ps.setString(2, clientesObj.getNom());
            ps.setString(3, clientesObj.getTel());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void modificar(Object obj) {
        try {
            clientesObj = (Clientes) obj;
            String SSQL = "UPDATE cliente SET "
                   + " cedula=?, nom=?, tel=? WHERE idcli=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, clientesObj.getCedula());
            ps.setString(2, clientesObj.getNom());
            ps.setString(3, clientesObj.getTel());
            ps.setInt(4, clientesObj.getIdcli());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void eliminar(Object obj) {
        try {
            clientesObj = (Clientes) obj;
            String SSQL = "DELETE FROM cliente WHERE idcli=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, clientesObj.getIdcli());
            ps.executeUpdate();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
