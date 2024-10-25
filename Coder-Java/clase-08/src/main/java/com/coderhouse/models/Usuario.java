package com.coderhouse.models;


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int idCliente;
    private String txNombre;
    private String txApellido;
    private int nuMatricula;
    private String txDomicilio;
    private String mail;

    private static List<Usuario> listaUsuarios = new ArrayList<>(); // Simulación de base de datos

    // Constructor
    public Usuario(int idCliente, String txNombre, String txApellido, int nuMatricula, String txDomicilio, String mail) {
        this.idCliente = idCliente;
        this.txNombre = txNombre;
        this.txApellido = txApellido;
        this.nuMatricula = nuMatricula;
        this.txDomicilio = txDomicilio;
        this.mail = mail;
    }

    // Método para agregar un nuevo usuario
    public static void nuevoUsuario(Usuario nuevo) {
        listaUsuarios.add(nuevo);
        System.out.println("Usuario " + nuevo.txNombre + " agregado con éxito.");
    }

    // Método para modificar un usuario existente
    public static void modificarUsuario(int idCliente, String nuevoNombre, String nuevoApellido, String nuevoDomicilio, String nuevoMail) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.idCliente == idCliente) {
                usuario.txNombre = nuevoNombre;
                usuario.txApellido = nuevoApellido;
                usuario.txDomicilio = nuevoDomicilio;
                usuario.mail = nuevoMail;
                System.out.println("Usuario con ID " + idCliente + " modificado con éxito.");
                return;
            }
        }
        System.out.println("Usuario con ID " + idCliente + " no encontrado.");
    }

    // Método para dar de baja un usuario
    public static void bajaUsuario(int idCliente) {
        listaUsuarios.removeIf(usuario -> usuario.idCliente == idCliente);
        System.out.println("Usuario con ID " + idCliente + " eliminado.");
    }

    // Getters y Setters
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
    // Otros getters y setters...
}
