package Ej4;

import java.util.Scanner;

public class Principal {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] contraseñas = {};
        boolean[] datos = {};

        System.out.print("Ingrese de cual es la longitud de la contraseña: ");
        int longitud = scan.nextInt();
        System.out.print("Ingrese que cantidad de contraseñas desea generar: ");
        int cantidad = scan.nextInt();

        contraseñas = new String[cantidad];
        datos = new boolean[cantidad];

        for (int i = 0; i < cantidad; i++) {
            Password nuevaPassword = new Password(longitud);
            contraseñas[i] = nuevaPassword.contraseña;
            datos[i] = nuevaPassword.esFuerte();
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Contraseña: %s // Fuerte: %b // Intento: %d\n", contraseñas[i], datos[i], i + 1);
        }

    }
}
