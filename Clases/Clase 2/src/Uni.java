import java.util.Scanner;

public class Uni {
    public static Scanner scan = new Scanner(System.in);
    public static String name;
    public static String secondName;
    public static float age;
    public static float score;
    public static float income;
    public static int discount;
    public static boolean x= false;
    public static void main(String[] args) {
        System.out.println("Escriba su nombre");
        name = scan.next();
        System.out.println("Escriba su apellido");
        secondName = scan.next();
        System.out.println("¡Hola " + name + " " + secondName + "!");
        while (!x){
            System.out.println("Ingresa tu edad");
            if (scan.hasNextFloat()) {
                age = scan.nextFloat();
                if (age - (int) age != 0 || age > 99 || age < 15) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                    scan.next(); // Limpiar el buffer del Scanner
                } else {
                    age = Math.round(age);
                    x = true;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scan.next(); // Limpiar el buffer del Scanner
            }
        }
        x = false;
        while (!x){
            System.out.println("Ingresa tu puntaje en el examen");
            if (scan.hasNextFloat()) {
                score = scan.nextFloat();
                if (score - (int) score != 0 || score > 100 || score < 0) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                    scan.next(); // Limpiar el buffer del Scanner
                } else {
                    score = Math.round(score);
                    x = true;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scan.next(); // Limpiar el buffer del Scanner
            }
        }
        x = false;
        while (!x){
            System.out.println("Ingresa tu ingreso familiar en numero decimal");
            if(scan.hasNextFloat()){
                income = scan.nextFloat();
                if(income >= 0){
                    x = true;
                }else{
                    System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                    scan.next(); // Limpiar el buffer del Scanner
                }
            }else {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scan.next(); // Limpiar el buffer del Scanner
            }
        }

        x = false;

        System.out.println("Nombre: " + name + " " + secondName);
        System.out.println("Edad: " + age);
        System.out.println("Puntaje: " + score);
        System.out.println("Ingresos familiares en salarios minimos: " + income);

        if(age >= 15 && age <= 18 ){
            discount += 25;
        } else if (age >= 19 && age <= 21) {
            discount += 15;
        } else if (age >= 22 && age <= 25) {
            discount += 10;
        }

        if(income <= 1){
            discount += 30;
        } else if (income <= 2) {
            discount += 20;
        } else if (income <= 3) {
            discount += 10;
        } else if (income <= 4) {
            discount += 5;
        }
        if (score >= 80 && score < 86){
            discount += 30;
        } else if (score >= 86 && score < 91) {
            discount += 35;
        } else if (score >= 91 && score < 96) {
            discount += 40;
        } else if (score >= 96) {
            discount += 45;
        }
        System.out.println("El descuento sobre el precio de la matricula es: " + discount +"%");


    }
}
