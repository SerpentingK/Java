import java.util.Scanner;

public class Main {
    static char[] caracteres = {'1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'};


    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String nuevaContraseña = "";
        int minusculas = 0;
        int mayusculas = 0;
        int digitos = 0;

        String[] contraseñas = {};
        boolean[] valores = {};

        System.out.println("Cuantas contraseñas deseas generar?");
        int cantidad = scan.nextInt();
        System.out.println("Cuantos caracteres van a tener las contraseñas?");
        int longitud = scan.nextInt();

        contraseñas = new String[cantidad];
        valores = new boolean[cantidad];

        for (int i = 0; i < cantidad; i++){
            nuevaContraseña = "";
            minusculas = 0;
            mayusculas = 0;
            digitos = 0;
            System.out.println("Contraseña: " + (i + 1));
            //Generar contraseña
            for (int j = 0;j < longitud; j++){
                int aleatorio = (int) (Math.random() * (caracteres.length));
                nuevaContraseña += caracteres[aleatorio];

                if(Character.isLowerCase(caracteres[aleatorio])){
                    minusculas++;
                } else if (Character.isUpperCase(caracteres[aleatorio])) {
                    mayusculas++;
                } else if (Character.isDigit(caracteres[aleatorio])) {
                    digitos++;
                }
            }
            contraseñas[i] = nuevaContraseña;
            System.out.println(nuevaContraseña);
            if (minusculas >= 2 && mayusculas >= 3 && digitos >= 8) {
                System.out.println("Es fuerte");
                valores[i] = true;
            }else {
                System.out.println("Es debil");
                valores[i] = false;
            }
        }
        for (int i = 0; i < contraseñas.length; i++) {
            System.out.print(contraseñas[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }

    }

}