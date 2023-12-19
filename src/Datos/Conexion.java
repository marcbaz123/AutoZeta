/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
/**
 *
 * @author marcelo adrian
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
     
    private String db = "autoZeta";
    private String user = "postgres";
    private String pass = "2820";
    private String driver = "org.postgresql.Driver";    
    private String url = "jdbc:postgresql://localhost:5432/"+db;
    
     
  public Connection con = null;
  public Statement st = null;
        
  public Connection Conectar() 
        {
              
       try {
            Connection link = null;
            Class.forName( driver );
            link = (Connection) DriverManager.getConnection( url, user, pass );
            Connection con = DriverManager.getConnection(url,user,pass);
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            return link;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        return (Connection) st;
        
    }

}