import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static boolean x = true;
    static int[] players = new int[0];
    static int[] results = {0,Integer.MAX_VALUE,Integer.MIN_VALUE};
    public static void main(String[] args) {

        while (x){
            System.out.println();
            System.out.println("Deseas agregar un competidor?\n1. Si\n2. No");
            String r = scan.nextLine();
            switch (r){
                case "1":
                    AddPlayers();
                    break;
                case "2":
                    System.out.println("Esta bien");
                    PrintResults(players);
                    x = false;
            }
        }
    }
    public static void AddPlayers(){

        System.out.println("Ingrese el tiempo del competidor:");

        //Nuevo tiempo de jugador a a agregar
        int t = scan.nextInt();

        //Nuevo array con tamaño mayor
        int[] newArray = new int[players.length + 1];

        //Copiar elementos del players al nuevo array
        for (int i = 0; i < players.length; i++){
            newArray[i] = players[i];
        }

        //Agregar nuevo elemento al numero array
        newArray[newArray.length - 1] = t;
        players = newArray;

    }
    public static void PrintResults(int[] array){
        results[0] = array.length;
        results[1] = array.length > 0 ? array[0] : 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > results[2]){
                results[2] = array[i];
            } else if (array[i] < results[1]) {
                results[1] = array[i];
            }
        }

        for (int i = 0; i < results.length; i++){
            System.out.print(results[i] + " ");
        }
    }
}