/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Seguridad.Acceso;
import Seguridad.ManejoUsuarios;
import Seguridad.Usuario;
import javax.swing.ImageIcon;
/**
 *
 * @author USUARIO
 */
public class Usuarios extends javax.swing.JFrame {
    private ManejoUsuarios manejador = new ManejoUsuarios();
    DefaultTableModel modeloTabla;
    ArrayList<Usuario> usuarios;
    ArrayList<Acceso> accesos;
    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
        usuarios = manejador.getUsuarios();
        modeloTabla =  (DefaultTableModel) jTable1.getModel();
        for (Iterator<Usuario> iterator = usuarios.iterator(); iterator.hasNext();) {
            Usuario next = iterator.next();
            modeloTabla.addRow(new String[]{next.getUserId()+"", next.getUsername(), next.getNivelAcceso()==1?"Administrador":"usuario"});
        } 
        accesos = manejador.getAcceso();
        for (Acceso acceso : accesos) {
            jComboBox1.addItem(acceso.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar = new javax.swing.JButton();
        jPasswordFieldContrase = new javax.swing.JPasswordField();
        jLabelContrase = new javax.swing.JLabel();
        jLabelAcceso = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscar.setBackground(new java.awt.Color(255, 153, 102));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/search_1.png"))); // NOI18N
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 30));

        jPasswordFieldContrase.setBackground(new java.awt.Color(255, 153, 102));
        jPasswordFieldContrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldContrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, -1));

        jLabelContrase.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelContrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContrase.setText("Constraseña :");
        getContentPane().add(jLabelContrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));

        jLabelAcceso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAcceso.setText("Acceso :");
        getContentPane().add(jLabelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 153, 102));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(255, 153, 102));
        jTextFieldNombre.setEnabled(false);
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, -1));

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre :");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, -1));

        jTextField_ID.setBackground(new java.awt.Color(255, 153, 102));
        jTextField_ID.setEnabled(false);
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 50, -1));

        jButtonGuardar.setBackground(new java.awt.Color(255, 153, 102));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Save.png"))); // NOI18N
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 30, 30));

        jTable1.setBackground(new java.awt.Color(255, 153, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Acceso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 530, 320));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informacion Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 190, -1));

        jButtonMenu.setBackground(new java.awt.Color(255, 153, 102));
        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Login2.png"))); // NOI18N
        jButtonMenu.setBorderPainted(false);
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 40, 40));

        jCheckBox1.setBackground(new java.awt.Color(255, 153, 102));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox1.setText("Cambio de Contraseña");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, 20));

        jPasswordField1.setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 130, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Repetir Contraseña :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, -1));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jPasswordFieldContraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraseActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        menu otro = new menu();
        this.setVisible(false);
        otro.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            int fila =jTable1.getSelectedRow();
            Usuario user = usuarios.get(fila);
            jTextField_ID.setText(user.getUserId()+"");
            jTextFieldNombre.setText(user.getUsername());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (jTable1.getSelectedRow() != -1){
            int fila =jTable1.getSelectedRow();
            if (jCheckBox1.isSelected()){
                if(jPasswordField1.getText().equals(jPasswordField2.getText())){
                    boolean resutl = manejador.changePass(usuarios.get(fila), jPasswordFieldContrase.getText(), jPasswordField2.getText());
                    if (!resutl){
                        JOptionPane.showMessageDialog(this, "Error no se pudo actualizar contraseñas,  ¿Ingreso una contraseña antigua valida?","ERROR",JOptionPane.ERROR_MESSAGE);//se informa que el usuario no existe
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Las conraseñas no coinciden","ERROR",JOptionPane.ERROR_MESSAGE);//se informa que el usuario no existe
                }
            }
            int combo = jComboBox1.getSelectedIndex();
            boolean acc =manejador.chageAccess(usuarios.get(fila), accesos.get(combo).getId());
            if (!acc) {
                JOptionPane.showMessageDialog(this, "Error no se pudo actualizar acceso","ERROR",JOptionPane.ERROR_MESSAGE);//se informa que el usuario no existe
            }
            JOptionPane.showMessageDialog(this, "Informacion Actualizada","INFORMACION",JOptionPane.INFORMATION_MESSAGE);//se informa que el usuario no existe
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEnabled(true);
            jPasswordField2.setEnabled(true);
        }else{
            jPasswordField1.setEnabled(false);
            jPasswordField2.setEnabled(false);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAcceso;
    private javax.swing.JLabel jLabelContrase;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordFieldContrase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}
