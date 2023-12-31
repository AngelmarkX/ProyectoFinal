/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Miguel
 */
public class crearUsuario extends javax.swing.JPanel {

    /**
     * Creates new form crearUsuario
     */
    public crearUsuario() {
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

        body = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JLabel();
        textoCorreo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        fieldTelefono = new javax.swing.JTextField();
        fieldCorreo = new javax.swing.JTextField();
        textoNombre = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        textoApellido = new javax.swing.JLabel();
        fieldApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        textoCedula = new javax.swing.JLabel();
        fieldCedula = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        botonRegistrar = new javax.swing.JButton();

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setText("Registrar nuevo Usuario");
        body.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        textoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoTelefono.setText("Teléfono");
        body.add(textoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        textoCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoCorreo.setText("Correo");
        body.add(textoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 10, 350));

        fieldTelefono.setForeground(new java.awt.Color(102, 102, 102));
        fieldTelefono.setText("Ingrese el telefono");
        fieldTelefono.setBorder(null);
        fieldTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldTelefonoMousePressed(evt);
            }
        });
        fieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTelefonoActionPerformed(evt);
            }
        });
        body.add(fieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 260, 30));

        fieldCorreo.setForeground(new java.awt.Color(102, 102, 102));
        fieldCorreo.setText("Ingrese el correo");
        fieldCorreo.setBorder(null);
        fieldCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldCorreoMousePressed(evt);
            }
        });
        fieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCorreoActionPerformed(evt);
            }
        });
        body.add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 260, 30));

        textoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoNombre.setText("Nombre");
        body.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        fieldNombre.setForeground(new java.awt.Color(102, 102, 102));
        fieldNombre.setText("Ingrese el nombre");
        fieldNombre.setBorder(null);
        fieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldNombreMousePressed(evt);
            }
        });
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });
        body.add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 10));

        textoApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoApellido.setText("Apellido");
        body.add(textoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        fieldApellido.setForeground(new java.awt.Color(102, 102, 102));
        fieldApellido.setText("Ingrese el apellido");
        fieldApellido.setBorder(null);
        fieldApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldApellidoMousePressed(evt);
            }
        });
        fieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellidoActionPerformed(evt);
            }
        });
        body.add(fieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 10));

        textoCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoCedula.setText("Cedula");
        body.add(textoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        fieldCedula.setForeground(new java.awt.Color(102, 102, 102));
        fieldCedula.setText("Ingrese la cedula");
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
        body.add(fieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 10));

        botonRegistrar.setBackground(new java.awt.Color(119, 56, 200));
        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRegistrarMousePressed(evt);
            }
        });
        body.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 270, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldTelefonoMousePressed
        //.equals hace la comparacion
        
        if(fieldNombre.getText().equals("") || fieldNombre.getText() == null || fieldNombre.getText().equals(" "))
        fieldNombre.setText("Ingrese el nombre");
       if(fieldApellido.getText().equals("") || fieldApellido.getText() == null || fieldApellido.getText().equals(" "))
        fieldApellido.setText("Ingrese el apellido");
       if(fieldCedula.getText().equals("") || fieldCedula.getText() == null || fieldCedula.getText().equals(" "))
        fieldCedula.setText("Ingrese la cedula");
       if(fieldCorreo.getText().equals("") || fieldCorreo.getText() == null || fieldCorreo.getText().equals(" "))
        fieldCorreo.setText("Ingrese el correo");
       if(fieldTelefono.getText().equals("Ingrese el telefono"));
        fieldTelefono.setText("");
    }//GEN-LAST:event_fieldTelefonoMousePressed

    private void fieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTelefonoActionPerformed

    private void fieldCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldCorreoMousePressed
        //.equals hace la comparacion
       if(fieldNombre.getText().equals("") || fieldNombre.getText() == null || fieldNombre.getText().equals(" "))
        fieldNombre.setText("Ingrese el nombre");
       if(fieldApellido.getText().equals("") || fieldApellido.getText() == null || fieldApellido.getText().equals(" "))
        fieldApellido.setText("Ingrese el apellido");
       if(fieldCedula.getText().equals("") || fieldCedula.getText() == null || fieldCedula.getText().equals(" "))
        fieldCedula.setText("Ingrese la cedula");
       if(fieldCorreo.getText().equals("Ingrese el correo"))
        fieldCorreo.setText("");
       if(fieldTelefono.getText().equals("") || fieldTelefono.getText() == null || fieldTelefono.getText().equals(" "))
        fieldTelefono.setText("Ingrese el telefono");
    }//GEN-LAST:event_fieldCorreoMousePressed

    private void fieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCorreoActionPerformed

    private void fieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNombreMousePressed
       //.equals hace la comparacion
        if(fieldNombre.getText().equals("Ingrese el nombre"));
        fieldNombre.setText("");
       if(fieldApellido.getText().equals("") || fieldApellido.getText() == null || fieldApellido.getText().equals(" "))
        fieldApellido.setText("Ingrese el apellido");
       if(fieldCedula.getText().equals("") || fieldCedula.getText() == null || fieldCedula.getText().equals(" "))
        fieldCedula.setText("Ingrese la cedula");
       if(fieldCorreo.getText().equals("") || fieldCorreo.getText() == null || fieldCorreo.getText().equals(" "))
        fieldCorreo.setText("Ingrese el correo");
       if(fieldTelefono.getText().equals("") || fieldTelefono.getText() == null || fieldTelefono.getText().equals(" "))
        fieldTelefono.setText("Ingrese el telefono");
    }//GEN-LAST:event_fieldNombreMousePressed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldApellidoMousePressed
      //.equals hace la comparacion
        if(fieldNombre.getText().equals("") || fieldNombre.getText() == null || fieldNombre.getText().equals(" "))
        fieldNombre.setText("Ingrese el nombre");
       if(fieldApellido.getText().equals("Ingrese el apellido"));
        fieldApellido.setText("");
       if(fieldCedula.getText().equals("") || fieldCedula.getText() == null || fieldCedula.getText().equals(" "))
        fieldCedula.setText("Ingrese la cedula");
       if(fieldCorreo.getText().equals("") || fieldCorreo.getText() == null || fieldCorreo.getText().equals(" "))
        fieldCorreo.setText("Ingrese el correo");
       if(fieldTelefono.getText().equals("") || fieldTelefono.getText() == null || fieldTelefono.getText().equals(" "))
        fieldTelefono.setText("Ingrese el telefono");
    }//GEN-LAST:event_fieldApellidoMousePressed

    private void fieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellidoActionPerformed

    private void fieldCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldCedulaMousePressed
      //.equals hace la comparacion
        if(fieldNombre.getText().equals("") || fieldNombre.getText() == null || fieldNombre.getText().equals(" "))
        fieldNombre.setText("Ingrese el nombre");
       if(fieldApellido.getText().equals("") || fieldApellido.getText() == null || fieldApellido.getText().equals(" "))
        fieldApellido.setText("Ingrese el apellido");
       if(fieldCedula.getText().equals("Ingrese la cedula"));
        fieldCedula.setText("");
       if(fieldCorreo.getText().equals("") || fieldCorreo.getText() == null || fieldCorreo.getText().equals(" "))
        fieldCorreo.setText("Ingrese el correo");
       if(fieldTelefono.getText().equals("") || fieldTelefono.getText() == null || fieldTelefono.getText().equals(" "))
        fieldTelefono.setText("Ingrese el telefono");
    }//GEN-LAST:event_fieldCedulaMousePressed

    private void fieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedulaActionPerformed

    private void botonRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMousePressed
       
        String nombre = fieldNombre.getText();
        String apellido = fieldApellido.getText();
        String cedula = fieldCedula.getText();
        String correo = fieldCorreo.getText();
        String telefono = fieldTelefono.getText();

        // Realizar la inserción en la base de datos
        try {
            // Establecer la conexión a la base de datos
            //DriverManager es una clase en Java que gestiona una lista de controladores de bases de datos. 
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecadb", "root", "123456");

            // Preparar la consulta SQL
            String sql = "INSERT INTO Usuarios (Nombre, Apellido, UsuarioID, Correo, Telefono) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, cedula);
            pstmt.setString(4, correo);
            pstmt.setString(5, telefono);

            // Ejecutar la consulta
            pstmt.executeUpdate();

            // Cerrar la conexión
            conn.close();

    
            System.out.println("Usuario registrado con exito.");

        } catch (SQLException e) {
            e.printStackTrace();
         
            System.err.println("Error al registrar usuario en la base de datos.");
        }
    
    }//GEN-LAST:event_botonRegistrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel body;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldCedula;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel textoApellido;
    private javax.swing.JLabel textoCedula;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTelefono;
    // End of variables declaration//GEN-END:variables
}
