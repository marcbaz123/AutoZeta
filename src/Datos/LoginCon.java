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
public class LoginCon {
    

    private String db = "autoZeta";
    private String user = "postgres";
    private String pass = "2820";
    private String driver = "org.postgresql.Driver";    
    private String url = "jdbc:postgresql://localhost:5432/"+db;
    
     
  public Connection con = null;
  public Statement st = null;
        
  public Statement Conectar() 
        {
              
        try
       {
       
        Connection con = DriverManager.getConnection(url,user,pass);
       
        st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
       
       } catch (SQLException i)
       {
           JOptionPane.showMessageDialog(null, i);
       } 
        return st;
        
       }
  
    
}