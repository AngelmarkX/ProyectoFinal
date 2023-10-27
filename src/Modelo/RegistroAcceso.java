/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class RegistroAcceso {
    private Usuario Persona;
    private String HoraEntrada;
    private String HoraSalida;

    public RegistroAcceso(Usuario Persona, String HoraEntrada, String HoraSalida) {
        this.Persona = Persona;
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
    }

    public Usuario getPersona() {
        return Persona;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }
}


