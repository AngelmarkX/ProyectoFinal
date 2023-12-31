/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controlAcceso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Miguel
 */
public class ingresarAcceso extends javax.swing.JPanel {

    /**
     * Creates new form ingresarAcceso
     */
    public ingresarAcceso() {
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

        jPanel1 = new javax.swing.JPanel();
        textoIngresarAcceso = new javax.swing.JLabel();
        fieldCedula = new javax.swing.JTextField();
        textoFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        textoMinuto = new javax.swing.JLabel();
        textoCedula = new javax.swing.JLabel();
        ingresarHora = new com.toedter.components.JSpinField();
        ingresarMinuto = new com.toedter.components.JSpinField();
        textoHora = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        elegirFecha = new com.toedter.calendar.JDateChooser();
        botonIngresarSalida = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoIngresarAcceso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoIngresarAcceso.setText("Ingresar Acceso");
        jPanel1.add(textoIngresarAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        fieldCedula.setForeground(new java.awt.Color(102, 102, 102));
        fieldCedula.setBorder(null);
        fieldCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldCedulaMousePressed(evt);
            }
        });
        fieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 30));

        textoFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoFecha.setText("Fecha");
        jPanel1.add(textoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 204, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 30));

        textoMinuto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoMinuto.setText("Minuto");
        jPanel1.add(textoMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        textoCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoCedula.setText("Cedula");
        jPanel1.add(textoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(ingresarHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 90, -1));
        jPanel1.add(ingresarMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 90, -1));

        textoHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoHora.setText("Hora");
        jPanel1.add(textoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 204, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 600, -1));

        elegirFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                elegirFechaMousePressed(evt);
            }
        });
        jPanel1.add(elegirFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 240, 100));

        botonIngresarSalida.setBackground(new java.awt.Color(119, 56, 200));
        botonIngresarSalida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonIngresarSalida.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresarSalida.setText("Ingresar");
        botonIngresarSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresarSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIngresarSalidaMousePressed(evt);
            }
        });
        botonIngresarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldCedulaMousePressed

    }//GEN-LAST:event_fieldCedulaMousePressed

    private void fieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedulaActionPerformed

    private void elegirFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elegirFechaMousePressed
       
    
    }//GEN-LAST:event_elegirFechaMousePressed

    private void botonIngresarSalidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarSalidaMousePressed
        // Obtener los valores de los campos
        String cedula = fieldCedula.getText();
        Date fecha = elegirFecha.getDate();
        int hora = ingresarHora.getValue();
        int minuto = ingresarMinuto.getValue();

        // Realizar la inserción en la base de datos
        try {
            // Establecer la conexión a la base de datos 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecadb", "root", "123456");

            // Preparar la consulta SQL
            String sql = "INSERT INTO RegistrosAcceso (UsuarioID, Fecha, HoraEntrada) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            pstmt.setString(1, cedula);
            pstmt.setDate(2, new java.sql.Date(fecha.getTime())); // Convertir la fecha de util.Date a sql.Date
            pstmt.setString(3, hora + ":" + minuto + ":00"); // Crear una cadena de tiempo HH:mm:ss

            // Ejecutar la consulta
            pstmt.executeUpdate();

            // Cerrar la conexión
            conn.close();

          
            System.out.println("Acceso registrado con exito.");

        } catch (SQLException e) {
            e.printStackTrace();
         
            System.err.println("Error al registrar acceso en la base de datos.");
        }
    }//GEN-LAST:event_botonIngresarSalidaMousePressed

    private void botonIngresarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarSalidaActionPerformed
   
    }//GEN-LAST:event_botonIngresarSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresarSalida;
    private com.toedter.calendar.JDateChooser elegirFecha;
    private javax.swing.JTextField fieldCedula;
    private com.toedter.components.JSpinField ingresarHora;
    private com.toedter.components.JSpinField ingresarMinuto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel textoCedula;
    private javax.swing.JLabel textoFecha;
    private javax.swing.JLabel textoHora;
    private javax.swing.JLabel textoIngresarAcceso;
    private javax.swing.JLabel textoMinuto;
    // End of variables declaration//GEN-END:variables
}
