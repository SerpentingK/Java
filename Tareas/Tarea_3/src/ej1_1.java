import java.util.Scanner;

public class ej1_1 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese marca para el vehiculo: ");
        String marcaNuevo = scan.nextLine();
        System.out.println("Ingrese placa para el vehiculo: ");
        String placaNuevo = scan.nextLine();
        System.out.println("Ingrese color para el vehiculo: ");
        String colorNuevo = scan.nextLine();
        System.out.println("Ingrese modelo del vehiculo: ");
        int modeloNuevo = scan.nextInt();
        System.out.println("Ingrese velocidad maxima: ");
        int velNuevo = scan.nextInt();
        scan.nextLine(); // Consume el carácter de nueva línea pendiente
        System.out.println("Ingrese el estado del vehiculo: ");
        String estadoNuevo = scan.nextLine();
        System.out.println("Ingrese el cilindraje:");
        float cilinNuevo = scan.nextFloat();


        Vehiculo miCarro = new Vehiculo(modeloNuevo, velNuevo, marcaNuevo, placaNuevo, colorNuevo, estadoNuevo, cilinNuevo);
        boolean x = true;
        while (x){
            System.out.println("Que deseas hacer?");
            System.out.println("1. Arrancar");
            System.out.println("2. Frenar");
            System.out.println("3. Acelerar");
            System.out.println("4. Detener");
            System.out.println("5. Llevar al mecanido y cambiar color");
            System.out.println("6. Salir del coche");
            int accion = scan.nextInt();
            scan.nextLine(); // Consume el carácter de nueva línea pendiente
            switch (accion){
                case 1:
                    miCarro.Arrancar();
                    break;
                case 2:
                    miCarro.Frenar();
                    break;
                case 3:
                    System.out.println("Cuanto deseas acelrar?");
                    int acel = scan.nextInt();
                    scan.nextLine(); // Consume el carácter de nueva línea pendiente
                    miCarro.Acelerar(acel);
                    break;
                case 4:
                    miCarro.Detener();
                    break;
                case 5:
                    System.out.println("A que color lo deseas cambiar?");
                    String newC = scan.nextLine();
                    miCarro.SetColor(newC);
                    break;
                case 6:
                    if (miCarro.velocidad > 0){
                        System.out.println("Tienes que detener el carro primero");
                    }else{
                        System.out.println("Saliendo del carro");
                        x = false;
                    }
                    break;
            }

        }
    }
}
