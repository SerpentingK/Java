import java.util.Scanner;

public class Main {
    public static boolean x = false;
    public static Scanner scan = new Scanner(System.in);
    public static String r;
    public static float total;

    public static void main(String[] args) {

        boolean y = false;
        boolean z = false;
        int r2;

        while (!y) {
            z = false;
            x = false; // Resetear x en cada iteración del bucle principal
            while (!x) {
                System.out.println("Dijiste su opcion");
                r = scan.next();

                switch (r) {
                    case "1":
                        AñadirAlTotal(1);
                        x = true;
                        break;
                    case "2":
                        AñadirAlTotal(2);
                        x = true;
                        break;
                    case "3":
                        AñadirAlTotal(3);
                        break;
                    default:
                        System.out.println("Opcion invalida, intente de nuevo.");
                }
            }

            while (!z) {
                System.out.println("Desea comprar mas?");
                r2 = scan.nextInt();
                switch (r2) {
                    case 1:
                        System.out.println("Perfecto");
                        z = true;
                        break; // No necesitas setear x a true aquí
                    case 2:
                        y = true;
                        z = true;
                        System.out.println("El total es: " + total);
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }
        }
    }

    public static void AñadirAlTotal(int R) {
        boolean w = false;
        int c = 0;
        while (!w) {
            System.out.println("Que cantidad deseas?");
            c = Math.round(scan.nextFloat());
            if (c > 0) {
                w = true;
            } else {
                System.out.println("Cantidad invalida, intente de nuevo.");
            }
        }

        switch (R) {
            case 1:
                total += c * 6000;
                System.out.println("Se agregaran: " + c * 6000);
                break;
            case 2:
                total += c * 3500;
                System.out.println("Se agregaran: " + c * 3500);
                break;
            case 3:
                total += c * 2500;
                System.out.println("Se agregaran: " + c * 2500);
                break;
            default:

        }
        System.out.println("La cantidad que pediste es: " + c);
        System.out.println("El total es: " + total);
        x = true;
    }
}
