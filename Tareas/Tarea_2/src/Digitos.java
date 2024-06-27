import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        int[] digitos = obtenerDigitos(numero);

        int cantidadDigitos = digitos.length;
        int sumaDigitos = obtenerSuma(digitos);
        int productoDigitos = obtenerProducto(digitos);
        int digitoIzquierda = obtenerDigitoIzquierda(digitos);
        int digitoDerecha = obtenerDigitoDerecha(digitos);
        int digitoMenor = obtenerDigitoMenor(digitos);
        int digitoMayor = obtenerDigitoMayor(digitos);
        String numeroInvertido = invertirNumero(digitos);

        System.out.println("Cantidad de dígitos: " + cantidadDigitos);
        System.out.println("Suma de dígitos: " + sumaDigitos);
        System.out.println("Producto de dígitos: " + productoDigitos);
        System.out.println("Dígito de la izquierda: " + digitoIzquierda);
        System.out.println("Dígito de la derecha: " + digitoDerecha);
        System.out.println("Dígito menor: " + digitoMenor);
        System.out.println("Dígito mayor: " + digitoMayor);
        System.out.println("Número invertido: " + numeroInvertido);
    }

    private static int[] obtenerDigitos(int numero) {
        String numeroStr = String.valueOf(numero);
        int[] digitos = new int[numeroStr.length()];
        for (int i = 0; i < numeroStr.length(); i++) {
            digitos[i] = Character.getNumericValue(numeroStr.charAt(i));
        }
        return digitos;
    }

    private static int obtenerSuma(int[] digitos) {
        int suma = 0;
        for (int digito : digitos) {
            suma += digito;
        }
        return suma;
    }

    private static int obtenerProducto(int[] digitos) {
        int producto = 1;
        for (int digito : digitos) {
            producto *= digito;
        }
        return producto;
    }

    private static int obtenerDigitoIzquierda(int[] digitos) {
        return digitos[0];
    }

    private static int obtenerDigitoDerecha(int[] digitos) {
        return digitos[digitos.length - 1];
    }

    private static int obtenerDigitoMenor(int[] digitos) {
        int menor = digitos[0];
        for (int i = 1; i < digitos.length; i++) {
            if (digitos[i] < menor) {
                menor = digitos[i];
            }
        }
        return menor;
    }

    private static int obtenerDigitoMayor(int[] digitos) {
        int mayor = digitos[0];
        for (int i = 1; i < digitos.length; i++) {
            if (digitos[i] > mayor) {
                mayor = digitos[i];
            }
        }
        return mayor;
    }

    private static String invertirNumero(int[] digitos) {
        StringBuilder builder = new StringBuilder();
        for (int i = digitos.length - 1; i >= 0; i--) {
            builder.append(digitos[i]);
        }
        return builder.toString();
    }
}
