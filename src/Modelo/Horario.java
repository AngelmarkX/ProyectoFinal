/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class Horario {
    private String Dia;
    private String Hora;

    public Horario(String Dia, String Hora) {
        this.Dia = Dia;
        this.Hora = Hora;
    }

    public String getDia() {
        return Dia;
    }

    public String getHora() {
        return Hora;
    }
}
