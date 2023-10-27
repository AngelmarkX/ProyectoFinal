/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import Vista.PantallaInicio;
import javax.swing.SwingUtilities;

/**
 *
 * @author Miguel
 */
public class Main {

 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PantallaInicio pantallaInicio = new PantallaInicio();
            }
        });
    }
    
}
