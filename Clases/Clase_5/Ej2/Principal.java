package Ej2;

import java.util.Scanner;

public class Principal {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese placa: ");
        String placa = scan.nextLine();
        System.out.println("Ingrese capacidad: ");
        int capacidad = scan.nextInt();
        System.out.println("Inrse precio pasaje: ");
        float precio = scan.nextFloat();
        Bus bus = new Bus(placa, capacidad, precio);
        System.out.println("Placa: " + bus.getPlaca());
        System.out.println("Capacidad: " + bus.getCapacidad());
        System.out.println("Precio: " + bus.getPrecioPasaje());
        System.out.println("Pasajeros actuales: " + bus.getPasajerosActuales());
        boolean x = true;
        while (x) {
            System.out.println("Que va a pasar?");
            System.out.println("1. Subir pasajeros");
            System.out.println("2. Bajar pasajeros");
            System.out.println("3. Ver cuantos pasajeros hay");
            System.out.println("4. Ver cuantos pasajeros se han subido");
            System.out.println("5. Parar bus");
            
            String r = scan.nextLine();
            int cantidad = 0;
            switch (r) {
                case "1":
                    System.out.println("Ingrese que cantidad de psajeros van a subir: ");
                    cantidad = scan.nextInt();
                    bus.SubirPasajeros(cantidad);
                    System.out.println("Presione enter para continuar");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case "2":
                    System.out.println("Ingrese que cantidad de pasajeros van a bajar: ");
                    cantidad = scan.nextInt();
                    bus.BajarPasajeros(cantidad);
                    System.out.println("Presione enter para continuar");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case "3":
                    System.out.println("Actualmente hay: " + bus.getPasajerosActuales() + " pasajeros.");
                    break;
                case "4":
                    System.out.println("Actualmente se han subido " + bus.getPasajerosTotales() + " pasajeros.");
                    break;
                case "5":
                    System.out.println("Bus detenido: " + bus.getDineroAcumulado() + "$ de dinero acumulado.");
                    x = false;
                    break;
                default:
                    System.out.println("Opcion invalida, ingrese nuevo");
                    break;
            }
        }

    }
}
