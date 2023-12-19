/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Datos.LoginCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo adrian
 */
public class Login extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
   

    /**
     * Creates new form Interfaz
     */
    public Login() {
        initComponents();
    this.setLocationRelativeTo(null);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtPasword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, -1));

        jButton1.setFont(new java.awt.Font("Yu Mincho Light", 2, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Salir");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 70, 30));

        txtPasword.setBackground(new java.awt.Color(51, 51, 51));
        txtPasword.setForeground(new java.awt.Color(255, 255, 255));
        txtPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaswordActionPerformed(evt);
            }
        });
        txtPasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 210, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 30));

        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Iniciar sesion");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 120, -1));

        jLabel1.setText("Hecho por Zeta³");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo posible 2.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 510));

        jToggleButton1.setText("jToggleButton1");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 51));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Administrador");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaswordActionPerformed
 

        String usuario = txtUsuario.getText();
        String password=txtPasword.getText();
        
       int  idusuario;
    
        
        if((password.isEmpty() && usuario.isEmpty() ))

        {

        }

        else

        {

            LoginCon conectar = new LoginCon();

            Statement st = conectar.Conectar();

        }

        LoginCon conectar = new LoginCon();

        Statement st = conectar.Conectar();

       
        try


        {

            ResultSet rs = st.executeQuery("SELECT * FROM usuario Where nick='"+usuario+"'and password='"+password+"'");

            rs.last();

            int encontrado = rs.getRow();        
            if (encontrado == 1)

            {
                 if("Eve22".equals(usuario)){
                     
             idusuario=1;
            }
                      else{
             idusuario=2;
                                         }
                if(idusuario==1){
                            
                

                Cliente pl = new  Cliente();

                pl.setVisible(true);

                hide();
                 //JOptionPane.showMessageDialog(null,"Ingreso Como Administrador ","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                 
                Cliente_usu pl = new  Cliente_usu();

                pl.setVisible(true);
                 // JOptionPane.showMessageDialog(null,"Ingreso Como Usuario ","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                }
            }

            else

            {


                txtPasword.setText("");

                txtPasword.setText("");

                JOptionPane.showMessageDialog(null, "Error","Usuario o contrasena Incorrecta",JOptionPane.ERROR_MESSAGE);

            }

        }

        catch (SQLException ex)

        {

            JOptionPane.showMessageDialog(null, ex);

        }
  
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaswordActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    @SuppressWarnings("deprecation")
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 

        String usuario = txtUsuario.getText();
        String password=txtPasword.getText();
        
       int  idusuario;
    
        
        if((password.isEmpty() && usuario.isEmpty() ))

        {

        }

        else

        {

            LoginCon conectar = new LoginCon();

            Statement st = conectar.Conectar();

        }

        LoginCon conectar = new LoginCon();

        Statement st = conectar.Conectar();

       
        try


        {

            ResultSet rs = st.executeQuery("SELECT * FROM usuario Where nick='"+usuario+"'and password='"+password+"'");

            rs.last();

            int encontrado = rs.getRow();        
            if (encontrado == 1)

            {
                 if("Eve22".equals(usuario)){
                     
             idusuario=1;
            }
                      else{
             idusuario=2;
                                         }
                if(idusuario==1){
                            
                

                Cliente pl = new  Cliente();

                pl.setVisible(true);

                hide();
                 JOptionPane.showMessageDialog(null,"Ingreso Como Administrador ","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                 
                Cliente_usu pl = new  Cliente_usu();

                pl.setVisible(true);
                  JOptionPane.showMessageDialog(null,"Ingreso Como Usuario ","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                }
            }

            else

            {


                txtPasword.setText("");

                txtPasword.setText("");

                JOptionPane.showMessageDialog(null, "Error","Usuario o contrasena Incorrecta",JOptionPane.ERROR_MESSAGE);

            }

        }

        catch (SQLException ex)

        {

            JOptionPane.showMessageDialog(null, ex);

        }
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtPaswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaswordKeyPressed
        
    }//GEN-LAST:event_txtPaswordKeyPressed

    private void txtPaswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaswordKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaswordKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField txtPasword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
