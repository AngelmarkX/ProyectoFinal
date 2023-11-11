/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Miguel
 */
public class editarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form editarUsuario
     */
    
    
    public editarUsuario() {
        initComponents();
    }
    
     public void setDatosUsuario(int usuarioID) {
        try {
            // Establecer la conexión a la base de datos (reemplaza con tus propios detalles)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecadb", "root", "123456");

            // Preparar la consulta SQL para obtener los datos del usuario por su ID
            String sql = "SELECT * FROM Usuarios WHERE UsuarioID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, usuarioID);

            // Ejecutar la consulta
            ResultSet resultSet = pstmt.executeQuery();

            // Verificar si se obtuvieron resultados
            if (resultSet.next()) {
                // Obtener los datos del resultado y establecerlos en los campos del formulario
                String nombre = resultSet.getString("Nombre");
                String apellido = resultSet.getString("Apellido");
                String cedula = resultSet.getString("usuarioID");
                String correo = resultSet.getString("Correo");
                String telefono = resultSet.getString("Telefono");

                // Establecer los datos en los campos correspondientes
                fieldNombre.setText(nombre);
                fieldApellido.setText(apellido);
                fieldCedula.setText(cedula);
                fieldCorreo.setText(correo);
                fieldTelefono.setText(telefono);
            }

            // Cerrar la conexión
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Puedes agregar aquí algún mensaje de error si lo deseas
            System.err.println("Error al obtener datos del usuario desde la base de datos.");
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        fieldCedula = new javax.swing.JTextField();
        textoCedula = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        fieldApellido = new javax.swing.JTextField();
        textoApellido = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        fieldNombre = new javax.swing.JTextField();
        textoNombre = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldCorreo = new javax.swing.JTextField();
        fieldTelefono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        textoCorreo = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));

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

        textoCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoCedula.setText("Cedula");

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));

        fieldApellido.setForeground(new java.awt.Color(102, 102, 102));
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

        textoApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoApellido.setText("Apellido");

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));

        fieldNombre.setForeground(new java.awt.Color(102, 102, 102));
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

        textoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoNombre.setText("Nombre");

        botonActualizar.setBackground(new java.awt.Color(119, 56, 200));
        botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonActualizarMousePressed(evt);
            }
        });
        botonActualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar");
        botonActualizar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        fieldCorreo.setForeground(new java.awt.Color(102, 102, 102));
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

        fieldTelefono.setForeground(new java.awt.Color(102, 102, 102));
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

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        textoCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoCorreo.setText("Correo");

        textoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoTelefono.setText("Teléfono");

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setText("Actualizar Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Titulo)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoNombre)
                                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoApellido)
                                .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoCedula)
                                .addComponent(fieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(40, 40, 40)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textoCorreo)
                        .addComponent(fieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoTelefono)
                        .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Titulo)
                            .addGap(18, 18, 18)
                            .addComponent(textoNombre)
                            .addGap(10, 10, 10)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(textoApellido)
                            .addGap(10, 10, 10)
                            .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(textoCedula)
                            .addGap(10, 10, 10)
                            .addComponent(fieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(textoCorreo)
                            .addGap(10, 10, 10)
                            .addComponent(fieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(textoTelefono)
                            .addGap(10, 10, 10)
                            .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void fieldApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldApellidoMousePressed
   
    }//GEN-LAST:event_fieldApellidoMousePressed

    private void fieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellidoActionPerformed

    private void fieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNombreMousePressed
  
    }//GEN-LAST:event_fieldNombreMousePressed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void botonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseEntered

    }//GEN-LAST:event_botonActualizarMouseEntered

    private void botonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseExited

    }//GEN-LAST:event_botonActualizarMouseExited

    private void botonActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMousePressed
                                                
    // Obtener la cédula actual (que actúa como UsuarioID)
    String cedula = fieldCedula.getText();

    // Verificar si la cédula tiene datos
    if (!cedula.isEmpty()) {
        // Obtener los nuevos datos del formulario
        String nuevoNombre = fieldNombre.getText();
        String nuevoApellido = fieldApellido.getText();
        String nuevoCorreo = fieldCorreo.getText();
        String nuevoTelefono = fieldTelefono.getText();

        try {
            // Establecer la conexión a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecadb", "root", "123456");

            // Preparar la consulta SQL para actualizar los datos del usuario
            String sql = "UPDATE Usuarios SET Nombre = ?, Apellido = ?, Correo = ?, Telefono = ? WHERE usuarioID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            pstmt.setString(1, nuevoNombre);
            pstmt.setString(2, nuevoApellido);
            pstmt.setString(3, nuevoCorreo);
            pstmt.setString(4, nuevoTelefono);
            pstmt.setString(5, cedula);

            // Ejecutar la consulta de actualización
            pstmt.executeUpdate();

            // Cerrar la conexión
            conn.close();

            // Puedes agregar aquí algún mensaje de éxito si lo deseas
            System.out.println("Usuario actualizado con exito.");

        } catch (SQLException e) {
            e.printStackTrace();
            // Puedes agregar aquí algún mensaje de error si lo deseas
            System.err.println("Error al actualizar usuario en la base de datos.");
        }
    } else {
        System.out.println("La cédula no puede estar vacía.");
    }

    }//GEN-LAST:event_botonActualizarMousePressed

    private void fieldCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldCorreoMousePressed
    
    }//GEN-LAST:event_fieldCorreoMousePressed

    private void fieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCorreoActionPerformed

    private void fieldTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldTelefonoMousePressed
      
    }//GEN-LAST:event_fieldTelefonoMousePressed

    private void fieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel botonActualizar;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldCedula;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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
