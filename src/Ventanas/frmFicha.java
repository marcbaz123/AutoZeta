/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Control.ClientesControl;
import Control.FichaControl;
import Datos.ClientesDao;
import Datos.FichaDao;
import Modelo.Clientes;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import Modelo.Ficha;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo adrian
 */
public class frmFicha extends javax.swing.JFrame {

    ClientesControl clientesControl = new ClientesControl();
    Clientes clientesObj = null;
    FichaControl fichaControl = new FichaControl();
    Ficha fichaObj = null;
    ArrayList<Clientes> clienteList = new ArrayList<>();
    ArrayList<Ficha> FichaList = new ArrayList<>();

    /**
     * Creates new form Cliente
     */
    public frmFicha() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.refrescar();
    }

    public void refrescar() {
        DefaultTableModel ficha = new DefaultTableModel();
        ficha.addColumn("ID");
        ficha.addColumn("Propietario");
        ficha.addColumn("Marca");
        ficha.addColumn("Modelo");
        ficha.addColumn("Matricula");
        ficha.addColumn("Año De Fabricacion");
        ficha.addColumn("Numero De Chasis");
        ficha.addColumn("Tipo De Motor");
        ficha.addColumn("Tipo De Caja");

        FichaList = fichaControl.listar("");
        Object[] fila = new Object[9];

        for (int i = 0; i < FichaList.size(); i++) {
            fichaObj = FichaList.get(i);

            fila[0] = fichaObj.getIdFicha();
            fila[1] = fichaObj.getNom();
            fila[2] = fichaObj.getMarca();
            fila[3] = fichaObj.getModelo();
            fila[4] = fichaObj.getMatricula();
            fila[5] = fichaObj.getAnoFab();
            fila[6] = fichaObj.getNChasis();
            fila[7] = fichaObj.getTipoMotor();
            fila[8] = fichaObj.getTipoCaja();

            ficha.addRow(fila);
        }

        tblficha.setModel(ficha);

        DefaultComboBoxModel nomCB = new DefaultComboBoxModel();

        clienteList = clientesControl.listar("");
        nomCB.addElement("** Seleccione");
        for (int i = 0; i < clienteList.size(); i++) {
            clientesObj = clienteList.get(i);

            nomCB.addElement(clientesObj.getNom());
        }
        cbxFicha.setModel(nomCB);

        txtMarca.setText("");
        txtModelo.setText("");
        txtMatricula.setText("");
        txtTipo_caja.setText("");
        txtAnoFab.setText("");
        txtIdficha.setText("");
        txtNchasis.setText("");
        txtTipo_Motor.setText("");
        btnCargar.setText("Grabar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAnoFab = new javax.swing.JTextField();
        txtNchasis = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblficha = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtTipo_caja = new javax.swing.JTextField();
        txtTipo_Motor = new javax.swing.JTextField();
        txtIdficha = new javax.swing.JTextField();
        cbxFicha = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtidcli = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año De Fabricacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nro. De Chasis");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        txtMarca.setBackground(new java.awt.Color(51, 51, 51));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, -1));

        txtModelo.setBackground(new java.awt.Color(51, 51, 51));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 250, -1));

        txtAnoFab.setBackground(new java.awt.Color(51, 51, 51));
        txtAnoFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoFabActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnoFab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, -1));

        txtNchasis.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtNchasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, -1));

        btnCargar.setForeground(new java.awt.Color(0, 0, 0));
        btnCargar.setText("Cargar Datos Del Vehiculo");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 190, -1));

        tblficha.setAutoCreateRowSorter(true);
        tblficha.setBackground(new java.awt.Color(51, 51, 51));
        tblficha.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblficha.setForeground(new java.awt.Color(204, 204, 204));
        tblficha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Propietario", "Matricula", "Marca", "Modelo", "Año De Fabricacion", "Nro. Chasis", "TIpo De Motor", "Tipo De Caja"
            }
        ));
        tblficha.setToolTipText("");
        tblficha.setGridColor(new java.awt.Color(102, 102, 102));
        tblficha.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblfichaMouseClicked(evt);
            }
        });
        tblficha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblfichaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblficha);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 241, 1280, 230));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Matricula");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Ir a Presupuesto Del Servicio");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 210, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo De Motor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Propietario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        txtMatricula.setBackground(new java.awt.Color(51, 51, 51));
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 180, -1));

        txtTipo_caja.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtTipo_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 190, -1));

        txtTipo_Motor.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtTipo_Motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 180, -1));

        txtIdficha.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtIdficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, -1));

        cbxFicha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFichaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 200, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo De Caja");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo principal 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1290, 613));

        txtidcli.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtidcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Cliente pl = new Cliente();

        pl.setVisible(true);

        hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtAnoFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoFabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoFabActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String matricula = txtMatricula.getText();
        String anoFab = txtAnoFab.getText();
        String nChasis = txtNchasis.getText();
        String tipoMotor = txtTipo_Motor.getText();
        String tipoCaja = txtTipo_caja.getText();
        Integer opc = cbxFicha.getSelectedIndex();
        if (opc != 0) {

            Integer idFicha = null;
            if (txtIdficha.getText() != null && !"".equals(txtIdficha.getText())) {
                idFicha = Integer.parseInt(txtIdficha.getText());
            }

            //String matricula = txtMatricula.getText();
            opc -= 1;
            clientesObj = clienteList.get(opc);
            
            fichaObj = new Ficha(idFicha, marca, modelo, anoFab, nChasis, tipoMotor, tipoCaja ,matricula, clientesObj.getNom(), clientesObj.getIdcli());
            
            if (fichaObj.getIdFicha() == null) {
                fichaControl.insertar(fichaObj);
                JOptionPane.showMessageDialog(null, "Registro creado con exito.");
            } else {
                fichaControl.modificar(fichaObj);
                /*Integer filaNum = tblficha.getSelectedRow();
                if (filaNum < 0) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar algun registro");
                } else {

                    DefaultTableModel ficha = (DefaultTableModel) tblficha.getModel();
                    Integer id_ficha = (Integer) ficha.getValueAt(filaNum, 0);
                    String whereTmp = " AND o.id_ficha='" + id_ficha + "' ";
                    FichaList = fichaControl.listar(whereTmp);
                    fichaObj = FichaList.get(0);

                    cbxFicha.setSelectedItem(ficha.getValueAt(filaNum, 3));

                    txtIdficha.setText(fichaObj.getIdFicha().toString());
                    txtMarca.setText(fichaObj.getMarca());
                    txtAnoFab.setText(fichaObj.getAnoFab());
                    txtNchasis.setText(fichaObj.getNChasis());
                    txtTipo_Motor.setText(fichaObj.getTipoMotor());
                    txtTipo_caja.setText(fichaObj.getTipoCaja());

                    btnCargar.setText("Modificar");
                    JOptionPane.showMessageDialog(null, "Modificado con exito.");
                }*/

                this.refrescar();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione Propietario");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void cbxFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFichaActionPerformed

    private void tblfichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblfichaMouseClicked
        int seleccion = tblficha.getSelectedRow();
        DefaultTableModel ficha = (DefaultTableModel) tblficha.getModel();
        fichaObj = (Ficha) FichaList.get(seleccion);
        txtIdficha.setText(fichaObj.getIdFicha().toString());
        cbxFicha.setSelectedItem(ficha.getValueAt(seleccion, 2));

        txtMarca.setText(fichaObj.getMarca());
        txtAnoFab.setText(fichaObj.getAnoFab());
        txtNchasis.setText(fichaObj.getNChasis());
        txtModelo.setText(fichaObj.getModelo());
        txtMatricula.setText(fichaObj.getMatricula());
        txtTipo_Motor.setText(fichaObj.getTipoMotor());
        txtTipo_caja.setText(fichaObj.getTipoCaja());

        btnCargar.setText("Actualizar Datos");

        // TODO add your handling code here:
    }//GEN-LAST:event_tblfichaMouseClicked

    private void tblfichaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblfichaKeyPressed
        int seleccion = tblficha.getSelectedRow();
        DefaultTableModel ficha = (DefaultTableModel) tblficha.getModel();
        fichaObj = (Ficha) FichaList.get(seleccion);
        txtIdficha.setText(fichaObj.getIdFicha().toString());
        cbxFicha.setSelectedItem(ficha.getValueAt(seleccion, 2));

        txtMarca.setText(fichaObj.getMarca());
        txtAnoFab.setText(fichaObj.getAnoFab());
        txtNchasis.setText(fichaObj.getNChasis());
        txtModelo.setText(fichaObj.getModelo());
         txtMatricula.setText(fichaObj.getMatricula());
        txtTipo_Motor.setText(fichaObj.getTipoMotor());
        txtTipo_caja.setText(fichaObj.getTipoCaja());

        btnCargar.setText("Actualizar Datos");

        // TODO add your handling code here:
    }//GEN-LAST:event_tblfichaKeyPressed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
Integer filaNum = tblficha.getSelectedRow();
        if( filaNum<0 ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        } else {
            DefaultTableModel ficha = (DefaultTableModel) tblficha.getModel();
            Integer idFicha  = (Integer) ficha.getValueAt(filaNum, 0);
             fichaObj = new Ficha();
             fichaObj.setIdFicha(idFicha);
             fichaControl.eliminar( fichaObj );
        this.refrescar();
            JOptionPane.showMessageDialog(null, "Eliminado con exito!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFicha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<String> cbxFicha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblficha;
    private javax.swing.JTextField txtAnoFab;
    private javax.swing.JTextField txtIdficha;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNchasis;
    private javax.swing.JTextField txtTipo_Motor;
    private javax.swing.JTextField txtTipo_caja;
    private javax.swing.JTextField txtidcli;
    // End of variables declaration//GEN-END:variables
}
