/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Control.ClientesControl;
import Modelo.Clientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author marcelo adrian
 */
public class Cliente_usu extends javax.swing.JFrame {

  TableRowSorter<DefaultTableModel> sorter;
    private static final long serialVersionUID = 1L;

ClientesControl clientesControl =new ClientesControl();
Clientes clientesObj = null;
ArrayList clientesList = new ArrayList();
    /**
     * Creates new form Cliente
     */
    public Cliente_usu() {
      
        initComponents();
    this.setLocationRelativeTo(null);
    this.refresh();
    }
     private void refresh() {
     
     DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("idcli");
        modelo.addColumn("cedula");
        modelo.addColumn("nom"); 
        modelo.addColumn("tel");
       
        

        clientesList = clientesControl.listar("");
        Object[] fila = new Object[4];
    
    
     for (int i = 0; i < clientesList.size(); i++) {
            clientesObj = (Clientes) clientesList.get(i);
            fila[0] = clientesObj.getIdcli();
            fila[1] = clientesObj.getCedula();
            fila[2] = clientesObj.getNom();
            fila[3] = clientesObj.getTel();
            modelo.addRow(fila);
        } 
     
        tblClientes.setModel(modelo);
           tblClientes.setAutoCreateRowSorter(true);
           sorter= new TableRowSorter<>(modelo);
           tblClientes.setRowSorter(sorter);
              
        lblidCli.setText("");
        txtCi.setText("");
        txtNombres.setText("");
        txtTelefono.setText("");
        btnCargar.setText("Cargar Datos Del Cliente");
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtCi = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        btn_ficha = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblidCli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombres1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula de Identidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        txtNombres.setBackground(new java.awt.Color(51, 51, 51));
        txtNombres.setForeground(new java.awt.Color(204, 204, 204));
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, -1));

        txtCi.setBackground(new java.awt.Color(51, 51, 51));
        txtCi.setForeground(new java.awt.Color(204, 204, 204));
        txtCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiActionPerformed(evt);
            }
        });
        getContentPane().add(txtCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, -1));

        txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, -1));

        btnCargar.setBackground(new java.awt.Color(51, 51, 51));
        btnCargar.setForeground(new java.awt.Color(204, 204, 204));
        btnCargar.setText("Cargar Datos Del Cliente");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        btn_ficha.setText("Ficha Tecnica del Vehiculo");
        btn_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fichaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 200, 170, -1));

        lblidCli.setText("Iid");
        lblidCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblidCliActionPerformed(evt);
            }
        });
        getContentPane().add(lblidCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, -1, -1));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Numero de Cedula", "Nombre Completo", "Telefono"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1300, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo principal 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1300, 610));

        txtNombres1.setBackground(new java.awt.Color(51, 51, 51));
        txtNombres1.setForeground(new java.awt.Color(204, 204, 204));
        txtNombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombres1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Login pl = new  Login();

        pl.setVisible(true);

        hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        Integer idcli = null;
        String idcliStr = lblidCli.getText();
        String cedulaStr = txtCi.getText();
        String nom = txtNombres.getText();
        String tel = txtTelefono.getText();

        Integer cedula = null;
        String mensaje = null;

        try {

            if (!idcliStr.equals("")) {
                idcli = Integer.parseInt(idcliStr);
            }

            cedula = Integer.parseInt(cedulaStr);

            clientesObj = new Clientes(idcli, cedula, nom, tel);

            if (clientesObj.getIdcli() == null) {
                clientesControl.insertar(clientesObj);
                mensaje = "Insertado";
            } else {
                clientesControl.modificar(clientesObj);
                mensaje = "Modificado";
            }
            this.refresh();
            JOptionPane.showMessageDialog(null, mensaje+" con exito.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "El documento de identidad deber ser valor numerico");
        }

    }//GEN-LAST:event_btnCargarActionPerformed

    private void btn_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fichaActionPerformed
        // TODO add your handling code here:
       /* Integer filaNum = tblClientes.getSelectedRow();
        if (filaNum < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        } else {

            JOptionPane.showMessageDialog(null,"Ficha tecnica del Vehiculo del Cliente de la fila :\t"+ filaNum);

            Ficha pl = new  Ficha();

            pl.setVisible(true);

            hide();

        }*/
        /*  Integer idcli=null;
             String idcliStr = lblidCli.getText();
              String Nom = txtNombres1.getText();
            if (!idcliStr.equals("")) {
                idcli = Integer.parseInt(idcliStr);*/
                 JOptionPane.showMessageDialog(null,"Accediendo Ficha Tecnica De Vehiculos \t");
                   frmFicha_usu pl = new  frmFicha_usu();

                pl.setVisible(true);

                hide();
         /*   }
            else{
                  JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
            }*/
    }//GEN-LAST:event_btn_fichaActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        try{

            sorter.setRowFilter(RowFilter.regexFilter(txtBuscar.getText()));
            tblClientes.setRowSorter(sorter);
        }

        catch(Exception e){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lblidCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblidCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblidCliActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
 int seleccion= tblClientes.getSelectedRow();
    clientesObj = (Clientes) clientesList.get(seleccion);
            lblidCli.setText(clientesObj.getIdcli().toString());
              txtNombres1.setText(clientesObj.getNom()); 
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientesMouseClicked

    private void txtNombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombres1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente_usu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_usu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_usu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_usu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_usu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btn_ficha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblidCli;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombres1;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
