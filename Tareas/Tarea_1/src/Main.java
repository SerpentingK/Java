import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static float num1 = 0;
    static float num2 = 0;
    public static void main(String[] args) {
        System.out.println("Elija que quiere hacer:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");


        int seleccion = scan.nextInt();

        switch (seleccion){
            case 1:
                LeerNumeros();
                System.out.println("El resultado es: " + Suma(num1, num2));
                break;
            case 2:
                LeerNumeros();
                System.out.println("El resultado es: " + Resta(num1, num2));
                break;
            case 3:
                LeerNumeros();
                System.out.println("El resultado es: " + Multi(num1, num2));
                break;
            case 4:
                LeerNumeros();
                System.out.println("El resultado es: " + Divi(num1, num2));
                break;
            default:
                System.out.println("Seleccion invalida");
        }
    }
    public static void LeerNumeros(){
        System.out.println("Dijite el primer numero:");
        num1 = scan.nextFloat();
        System.out.println("Dijite el segundo numero:");
        num2 = scan.nextFloat();
    }

    public static float Suma(float n1, float n2){
        return n1 + n2;
    }
    public static float Resta(float n1, float n2){
        return n1 - n2;
    }
    public static float Multi(float n1, float n2){
        return n1 * n2;
    }
    public static float Divi(float n1, float n2){
        return n1 / n2;
    }
}