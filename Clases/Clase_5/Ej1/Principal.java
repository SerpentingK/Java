package Ej1;

import java.util.Scanner;

public class Principal {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese numero de cita: ");
        int numero = scan.nextInt();
    
        int tipo;
        do {
            System.out.println("Ingrese el tipo de cita (1 a 5):");
            tipo = scan.nextInt();
        } while (tipo < 1 || tipo > 5);
    
        System.out.println("Ingrese la tarifa de la cita:");
        Float tarifa = scan.nextFloat();
    
        Cita nuevaCita = new Cita(numero, tipo, tarifa);
    
        System.out.println("El numero de la cita es: " + nuevaCita.getNumero());
        System.out.println("Esta cita es de tipo: " + nuevaCita.getTipo());
        System.out.println("Su tarifa normal es: " + nuevaCita.getTarifa());
        System.out.println("Pero por ser de tipo " + nuevaCita.getTipo() + " queda con un valor de " + nuevaCita.calcularValorFinal());
    }
    
}
