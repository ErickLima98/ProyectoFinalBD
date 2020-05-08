/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.ImageIcon;
import Seguridad.Usuario;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;

/**
 *
 * @author donald
 */
public class menu extends javax.swing.JFrame {
private static Usuario user;//variable global del usuario logeado
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
        
    }
 
    
    public menu(Usuario user) {//metodo constructor que recibe el usuario logeados
        initComponents();
        this.user=user;//Se asigna el usuaario que hizo login
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/cafe.png")).getImage());
        
    }

    
     public void seguridad(){
        System.out.println("nivel de acceso: "+user.getNivelAcceso());
        if(user.getNivelAcceso()==1){
            jButtonMenu.setVisible(true);
            jButtonCierre.setVisible(true);
            jButtonVenta.setVisible(true);
            jButtonCliente.setVisible(true);
            jButtonProveedores.setVisible(true);
            jButtonCargar.setVisible(true);
            jButtonUsuarios.setVisible(true);
            jButtonAnadirUsuario.setVisible(true);
            jButtonCerrarSesion.setVisible(true);
        }else if(user.getNivelAcceso()==2){
            jButtonMenu.setVisible(true);
            jButtonCierre.setVisible(true);
            jButtonCierre.setEnabled(false);
            jButtonVenta.setVisible(true);
            jButtonCliente.setVisible(true);
            jButtonProveedores.setVisible(true);
            jButtonProveedores.setEnabled(false);
            jButtonCargar.setVisible(true);
            jButtonUsuarios.setVisible(true);
            jButtonUsuarios.setEnabled(false);
            jButtonAnadirUsuario.setVisible(true);
            jButtonAnadirUsuario.setEnabled(false);
            jButtonCerrarSesion.setVisible(true);      
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

        jButtonUsuarios = new javax.swing.JButton();
        jButtonAnadirUsuario = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonCargar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButtonProveedores = new javax.swing.JButton();
        jButtonCierre = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonUsuarios.setBackground(new java.awt.Color(255, 153, 102));
        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/usuarios2.png"))); // NOI18N
        jButtonUsuarios.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>USUARIOS</h4>\n\t</div>\n</body>\n</html>");
        jButtonUsuarios.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonUsuarios.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonUsuarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/usuarios.png"))); // NOI18N
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 140, 110));

        jButtonAnadirUsuario.setBackground(new java.awt.Color(255, 153, 102));
        jButtonAnadirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/añadirUsuario.png"))); // NOI18N
        jButtonAnadirUsuario.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>AÑADIR USUARIO</h4>\n\t</div>\n</body>\n</html>");
        jButtonAnadirUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonAnadirUsuario.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonAnadirUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/añadirUsuario2.png"))); // NOI18N
        jButtonAnadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAnadirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 140, 110));

        jButtonVenta.setBackground(new java.awt.Color(255, 153, 102));
        jButtonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Venta2.png"))); // NOI18N
        jButtonVenta.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>VENTAS</h4>\n\t</div>\n</body>\n</html>");
        jButtonVenta.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonVenta.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonVenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Venta.png"))); // NOI18N
        jButtonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 140, 110));

        jButtonMenu.setBackground(new java.awt.Color(255, 153, 102));
        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Inventario.png"))); // NOI18N
        jButtonMenu.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>INVENTARIO</h4>\n\t</div>\n</body>\n</html>");
        jButtonMenu.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonMenu.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonMenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/controlar.png"))); // NOI18N
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, 110));

        jButtonCliente.setBackground(new java.awt.Color(255, 153, 102));
        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/clientes.png"))); // NOI18N
        jButtonCliente.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>CLIENTES</h4>\n\t</div>\n</body>\n</html>");
        jButtonCliente.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCliente.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonCliente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/clientes2.png"))); // NOI18N
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 140, 110));

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 153, 102));
        jButtonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/salir.png"))); // NOI18N
        jButtonCerrarSesion.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>CERRAR SESION</h4>\n\t</div>\n</body>\n</html>");
        jButtonCerrarSesion.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCerrarSesion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/salir2.png"))); // NOI18N
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 140, 110));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CERRAR SESION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 60, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("VENTAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 60, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("CLIENTES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("USUARIOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("AÑADIR USUARIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, -1, -1));

        jButtonCargar.setBackground(new java.awt.Color(255, 153, 102));
        jButtonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/compras.png"))); // NOI18N
        jButtonCargar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>COMPRAS</h4>\n\t</div>\n</body>\n</html>");
        jButtonCargar.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCargar.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonCargar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/compras2.png"))); // NOI18N
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 140, 110));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("CARGAR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jButtonProveedores.setBackground(new java.awt.Color(255, 153, 102));
        jButtonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/proveedor.png"))); // NOI18N
        jButtonProveedores.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>PROVEEDORES</h4>\n\t</div>\n</body>\n</html>");
        jButtonProveedores.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonProveedores.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonProveedores.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/proveedor2.png"))); // NOI18N
        jButtonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, 110));

        jButtonCierre.setBackground(new java.awt.Color(255, 153, 102));
        jButtonCierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cierre.png"))); // NOI18N
        jButtonCierre.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #111111;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h4>CIERRE</h4>\n\t</div>\n</body>\n</html>");
        jButtonCierre.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCierre.setPreferredSize(new java.awt.Dimension(98, 74));
        jButtonCierre.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cierre2.png"))); // NOI18N
        jButtonCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCierreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 140, 110));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("CIERRE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("PROVEEDORES");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cafe.png"))); // NOI18N
        jLabel11.setText("MENU");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 320, 100));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        Inventario in = new Inventario(user);
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        Cliente cliente = new Cliente(user);
        this.setVisible(false);
        cliente.setVisible(true);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonAnadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirUsuarioActionPerformed
        AnadirUsuario usuar = new AnadirUsuario();
        this.setVisible(false);
        usuar.setVisible(true);
    }//GEN-LAST:event_jButtonAnadirUsuarioActionPerformed

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        Usuarios usuar = new Usuarios();
        this.setVisible(false);
        usuar.setVisible(true);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
        Venta venta = new Venta();
        this.setVisible(false);
        venta.setVisible(true);
    }//GEN-LAST:event_jButtonVentaActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        // TODO add your handling code here:
        Inicio otro = new Inicio();
        otro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        Cargo cargo = new Cargo();
        cargo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButtonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedoresActionPerformed
        Proveedores proveedor = new Proveedores(user);
        proveedor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonProveedoresActionPerformed

    private void jButtonCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCierreActionPerformed
        Visualizar_Ventas Vv;
          try {
              Vv = new Visualizar_Ventas(user);
              Vv.setVisible(true);
          } catch (SQLException ex) {
              Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
          }        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCierreActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadirUsuario;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonCierre;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonProveedores;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables

}