package Ej4;

import Ej4.modelos.admin;
import Ej4.modelos.cliente;
import Ej4.modelos.usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class vista {
    Scanner scanner = new Scanner(System.in);
    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema.");
        System.out.println("1. Mostrar usuarios.");
        System.out.println("2. Agregar usuario.");
        System.out.println("3. Sumar puntos a usuario.");
        System.out.println("4. Salir.");
    }

    public void mostrarUsuarios(ArrayList<usuario> usuarios) {
        for (usuario u : usuarios) {
            System.out.println(u);
        }
    }
    
    public int leerOpcion() {
        System.out.print("Ingrese una opción: ");
        int r = scanner.nextInt();
        scanner.nextLine();
        return r;
    }

    public usuario crearUsuario() {
        String nombre = "";
        int edad = 0;
        String rol = "";
    
        while (true) {
            try {
                System.out.print("Ingrese nombre del usuario: ");
                nombre = scanner.nextLine();
                System.out.print("Ingrese edad del usuario: ");
                edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
    
                System.out.print("¿El usuario será administrador (A) o cliente (C)? ");
                rol = scanner.nextLine();
    
                if (rol.equalsIgnoreCase("A") || rol.equalsIgnoreCase("C")) {
                    break; // Salir del bucle si el rol es válido
                } else {
                    System.out.println("Rol inválido. Debe ser 'A' para administrador o 'C' para cliente.");
                }
            } catch (Exception e) {
                System.out.println("Error al ingresar datos. Intente nuevamente.");
                scanner.nextLine(); // Limpiar el buffer en caso de error
            }
        }
    
        usuario nuevoUsuario;
        if (rol.equalsIgnoreCase("A")) {
            nuevoUsuario = new admin(nombre, edad);
        } else {
            nuevoUsuario = new cliente(nombre, edad);
        }
    
        return nuevoUsuario;
    }
    public void sumarPuntosUsuario(ArrayList<usuario> usuarios) {
        System.out.print("Ingrese el nombre del usuario al que desea sumar puntos: ");
        String nombreUsuario = scanner.nextLine();

        usuario usuarioEncontrado = null;
        for (usuario u : usuarios) {
            if (u.getNombre().equals(nombreUsuario)) {
                usuarioEncontrado = u;
                break;
            }
        }

        if (usuarioEncontrado != null) {
            System.out.print("Ingrese la cantidad de puntos a sumar: ");
            int puntosASumar = scanner.nextInt();
            usuarioEncontrado.sumarPuntos(puntosASumar);
            System.out.println("Se han sumado " + puntosASumar + " puntos al usuario " + nombreUsuario + ".");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
    
}
