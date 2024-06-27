import java.util.Objects;
import java.util.Scanner;

public class Palindromos {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese su palabra");
        String original = scan.nextLine();
        String invertida = Invertir(original);
        System.out.println(invertida);
        if(Objects.equals(invertida.toLowerCase(), original.toLowerCase())){
            System.out.println("Es palindromo!");
        }else {
            System.out.println("No es palindromo");
        }
    }
    public static  String Invertir(String str){
        String invertida = "";

        for(int i = str.length() - 1; i >= 0; i--){
            invertida += str.charAt(i);
        }
        return invertida;
    }
}
