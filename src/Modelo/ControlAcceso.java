/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author Miguel
 */
public class ControlAcceso {
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Horario> listaHorarios;
    private ArrayList<RegistroAcceso> listaRegistros;

    public ControlAcceso() {
        listaUsuarios = new ArrayList<>();
        listaHorarios = new ArrayList<>();
        listaRegistros = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public Usuario consultarUsuario(String ID) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getID().equals(ID)) {
                return usuario;
            }
        }
        return null;
    }
    
    public void borrarUsuario(String ID) {
        listaUsuarios.removeIf(usuario -> usuario.getID().equals(ID));
    }

    public void agregarHorario(Horario horario) {
        listaHorarios.add(horario);
    }

    public void agregarRegistro(RegistroAcceso registro) {
        listaRegistros.add(registro);
    }

    public ArrayList<Usuario> obtenerListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Horario> obtenerListaHorarios() {
        return listaHorarios;
    }

    public ArrayList<RegistroAcceso> obtenerListaRegistros() {
        return listaRegistros;
    }
}
