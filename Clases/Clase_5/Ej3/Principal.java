package Ej3;

import java.util.Scanner;

public class Principal {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese numero de cuenta");
        int numero = scan.nextInt();
        System.out.println("Ingrese tipo de cuenta (Ahorros o Credito): ");
        String tipo = scan.next();
        System.out.println("Ingrese valor inicial: ");
        double valor = scan.nextFloat();
        Cuenta nuevaCuenta = new Cuenta(numero, tipo, valor);
        while (true) {
            System.out.println("Que deseas hacer?");
            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Consultar saldo mínimo");
            System.out.println("5. Consultar capacidad de crédito");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scan.nextInt();
            float cantidad = 0;
            switch (opcion) {
                // Casos vacíos
                case 1:
                    System.out.println("Ingrese cuanto desea consignar: ");
                    cantidad = scan.nextFloat();
                    nuevaCuenta.consignar(cantidad);
                    break;
                case 2:
                    System.out.println("Ingrese cuanto desea retirar: ");
                    cantidad = scan.nextFloat();
                    nuevaCuenta.retirar(cantidad);
                    break;
                case 3:
                    System.out.printf("Saldo actual: $%.1f\n", nuevaCuenta.getSaldo());
                    break;
                case 4:
                    System.out.printf("Saldo minimo: $%.1f\n", nuevaCuenta.getSaldoMinimo());
                    break;
                case 5:
                    System.out.printf("Capacidad de credito actual: $%.1f\n", nuevaCuenta.getCapacidadCredito());
                    break;
                case 6:
                    System.out.println("Cerrando programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
