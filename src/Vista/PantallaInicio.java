/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author Miguel
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaInicio {
    private JFrame frame;

    public PantallaInicio() {
        frame = new JFrame("Inicio");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Sistema de Control de Acceso");
        label.setBounds(50, 30, 200, 30);
        frame.add(label);

        JButton iniciarButton = new JButton("Iniciar");
        iniciarButton.setBounds(100, 100, 100, 30);
        frame.add(iniciarButton);

        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para iniciar la aplicación
                frame.dispose(); // Cierra la ventana de inicio
                //crear y mostrar la pantalla principal aquí
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}