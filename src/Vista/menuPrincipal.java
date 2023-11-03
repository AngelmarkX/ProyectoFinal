/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Miguel
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPrincipal = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JPanel();
        labelUsuarios = new javax.swing.JPanel();
        textoUsuarios = new javax.swing.JLabel();
        iconoUsuarios = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelControlAcceso = new javax.swing.JPanel();
        textoAcceso = new javax.swing.JLabel();
        iconoAcceso = new javax.swing.JLabel();
        labelPrincipal = new javax.swing.JPanel();
        textoPrincipal = new javax.swing.JLabel();
        iconoPrincipal = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(940, 654));
        setResizable(false);

        bgPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        bgPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPrincipal.setBackground(new java.awt.Color(119, 56, 200));
        menuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsuarios.setBackground(new java.awt.Color(138, 84, 206));
        labelUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelUsuariosMousePressed(evt);
            }
        });
        labelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        textoUsuarios.setText("Usuarios");
        labelUsuarios.add(textoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        iconoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account-multiple.png"))); // NOI18N
        labelUsuarios.add(iconoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        menuPrincipal.add(labelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 50));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("Biblioteca");
        menuPrincipal.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        menuPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 20));

        labelControlAcceso.setBackground(new java.awt.Color(138, 84, 206));
        labelControlAcceso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelControlAcceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelControlAccesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelControlAccesoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelControlAccesoMousePressed(evt);
            }
        });
        labelControlAcceso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoAcceso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoAcceso.setForeground(new java.awt.Color(255, 255, 255));
        textoAcceso.setText("Control Acceso");
        labelControlAcceso.add(textoAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        iconoAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar-multiple-check.png"))); // NOI18N
        labelControlAcceso.add(iconoAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        menuPrincipal.add(labelControlAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 50));

        labelPrincipal.setBackground(new java.awt.Color(138, 84, 206));
        labelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelPrincipalMousePressed(evt);
            }
        });
        labelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        textoPrincipal.setText("Principal");
        labelPrincipal.add(textoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        iconoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-outline.png"))); // NOI18N
        labelPrincipal.add(iconoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        menuPrincipal.add(labelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 50));

        bgPrincipal.add(menuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        Header.setBackground(new java.awt.Color(138, 84, 206));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administración/Control/Biblioteca");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel3)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(52, 52, 52))
        );

        bgPrincipal.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 700, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración/Control/Biblioteca");
        bgPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMouseEntered
 
    }//GEN-LAST:event_labelUsuariosMouseEntered

    private void labelUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMouseExited

    }//GEN-LAST:event_labelUsuariosMouseExited

    private void labelUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMousePressed
    
    }//GEN-LAST:event_labelUsuariosMousePressed

    private void labelControlAccesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelControlAccesoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelControlAccesoMouseEntered

    private void labelControlAccesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelControlAccesoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelControlAccesoMouseExited

    private void labelControlAccesoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelControlAccesoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelControlAccesoMousePressed

    private void labelPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPrincipalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPrincipalMouseEntered

    private void labelPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPrincipalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPrincipalMouseExited

    private void labelPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPrincipalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPrincipalMousePressed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel bgPrincipal;
    private javax.swing.JLabel iconoAcceso;
    private javax.swing.JLabel iconoPrincipal;
    private javax.swing.JLabel iconoUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel labelControlAcceso;
    private javax.swing.JPanel labelPrincipal;
    private javax.swing.JPanel labelUsuarios;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JLabel textoAcceso;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoUsuarios;
    // End of variables declaration//GEN-END:variables
}
