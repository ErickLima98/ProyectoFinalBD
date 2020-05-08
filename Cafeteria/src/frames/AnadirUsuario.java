/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Seguridad.Acceso;
import Seguridad.Login;
import Seguridad.ManejoUsuarios;
import Seguridad.Usuario;


/**
 *
 * @author USUARIO
 */
public class AnadirUsuario extends javax.swing.JFrame {
private menu menu;
private Login login;
private Usuario user;

    ArrayList<Acceso> accesos;
    private ManejoUsuarios manejador = new ManejoUsuarios();
    /**
     * Creates new form AnadirUsuario
     */
    public AnadirUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
        login=new Login();
        accesos = manejador.getAcceso();
        for (Acceso acceso : accesos) {
            jComboBox.addItem(acceso.toString());
        }
    }
        private void limpiar(){
        jPasswordFieldConstraseña.setText("");
        jPasswordFieldRepetirContra.setText("");
        jTextFieldNombreUsuario.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordFieldConstraseña = new javax.swing.JPasswordField();
        jLabelRepetirContra = new javax.swing.JLabel();
        jPasswordFieldRepetirContra = new javax.swing.JPasswordField();
        jComboBox = new javax.swing.JComboBox<>();
        jLabelImagenUsuario = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Añadir Usuario");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre de Usuario:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, -1));

        jTextFieldNombreUsuario.setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().add(jTextFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, -1));

        jLabelContraseña.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContraseña.setText("Contraseña:");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jPasswordFieldConstraseña.setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().add(jPasswordFieldConstraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, -1));

        jLabelRepetirContra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelRepetirContra.setText("Repetir Contraseña:");
        getContentPane().add(jLabelRepetirContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jPasswordFieldRepetirContra.setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().add(jPasswordFieldRepetirContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, -1));

        jComboBox.setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, -1));

        jLabelImagenUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Agregar-Usuario-Grande.png"))); // NOI18N
        getContentPane().add(jLabelImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 120));

        jButtonMenu.setBackground(new java.awt.Color(255, 153, 102));
        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Login2.png"))); // NOI18N
        jButtonMenu.setBorderPainted(false);
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 40, 40));

        jToggleButton1.setBackground(new java.awt.Color(255, 153, 102));
        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleButton1.setText("Crear");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 70, -1));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        menu otro =new menu();
        this.setVisible(false);
        otro.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(jPasswordFieldConstraseña.getText()!=jPasswordFieldRepetirContra.getText())
        {
            if(!jTextFieldNombreUsuario.getText().trim().equals(""))
            {
                int combo = jComboBox.getSelectedIndex();
                boolean user = manejador.CrearUsuario(jTextFieldNombreUsuario.getText().trim(), jPasswordFieldConstraseña.getText(), accesos.get(combo).getId());
                JOptionPane.showMessageDialog(this, "El usuario " + jTextFieldNombreUsuario.getText().trim() + " fue creado","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(this, "Ingrese un Nombre de Usuario","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AnadirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnadirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnadirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnadirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnadirUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelImagenUsuario;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRepetirContra;
    private javax.swing.JPasswordField jPasswordFieldConstraseña;
    private javax.swing.JPasswordField jPasswordFieldRepetirContra;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
