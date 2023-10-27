/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class Usuario {
    private String ID;
    private String Nombre;

    public Usuario(String ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }
}

