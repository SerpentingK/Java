import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static boolean inGame = true;
    static int throwingNum = 0;
    static boolean shift = true;

    static int currentBet = 200;
    static int playerBet;
    static int player1Mount = 1000;
    static int player2Mount = 1000;
    static int currentPlayer = 1;
    static int throwing;
    static int lastThrowing;

    static boolean y = true;
    public static void main(String[] args) {
        while (y){
            System.out.println("Presione enter para jugar");
            scan.nextLine();

            Game();
        }
    }
    public static void Game(){
        if(inGame){
            throwing = 0;
            shift = true;
            boolean x = false;

            System.out.println("JUGADOR ACTUAL: " + currentPlayer);
            while (shift){
                //Hago lanzamiento
                throwingNum =(int)(Math.random() * 6 +1);
                System.out.println("Lanzamiento: " + throwingNum);

                throwing += 1;
                //Dependiendo del numero del turno, se ejcuta una accion o otra
                if (throwing == 1){
                    //Asignar valor al ultimo lanzamiento
                    lastThrowing = throwingNum;
                    //Verifico lanzamiento
                    if(throwingNum == 1 || throwingNum == 6){
                        currentBet += 100;
                        //Cambio de jugador y descuento de dinero
                        switch (currentPlayer) {
                            //Disminuimos saldo dependiendo del jugador, y acabamos turno
                            case 1:
                                player1Mount -= 100;
                                currentPlayer = 2;
                                throwing = 0;
                                System.out.println("Pierdes: $100");
                                shift = false;
                                break;
                            case 2:
                                player2Mount -= 100;
                                currentPlayer = 1;
                                throwing = 0;
                                System.out.println("Pierdes: $100");
                                shift = false;
                                break;
                        }
                    }else {
                        while (!x){
                            //Leemos apuesta del jugador
                            System.out.println();
                            System.out.println("Ingrese cuanto quiere apostar");
                            System.out.println("Acumulado actual: $" + currentBet);
                            playerBet = Integer.parseInt(scan.nextLine());
                            switch (currentPlayer) {
                                //Analizamos salario del jugador, apuesta actual, y que la apuesta no sea menor a 0
                                case 1:
                                    if (playerBet > currentBet || playerBet < 0 || playerBet > player1Mount) {
                                        System.out.println("No puedes apostar eso");
                                    } else {
                                        System.out.println("Perfecto");
                                        x = true;
                                    }
                                    break;
                                case 2:
                                    if (playerBet > currentBet || playerBet < 0 || playerBet > player2Mount) {
                                        System.out.println("No puedes apostar eso");
                                    } else {
                                        System.out.println("Perfecto");
                                        x = true;
                                    }
                                    break;
                            }
                        }
                    }
                } else if (throwing == 2) {
                    //Restablecemos numero de lanzamiento
                    throwing = 0;

                    if(throwingNum > lastThrowing){
                        System.out.println();
                        System.out.println("GANASTE");
                        switch (currentPlayer){
                            //Añadimos saldo dependiendo jugador
                            case 1:
                                player1Mount += playerBet;
                                currentPlayer = 2;
                                currentBet -= playerBet;
                                System.out.println("Tienes: $" + player1Mount);
                                break;
                            case 2:
                                player2Mount += playerBet;
                                currentPlayer = 1;
                                currentBet -= playerBet;
                                System.out.println("Tienes: $" + player1Mount);
                                break;
                        }
                    } else {
                        //Restamos saldo dependiendo del jugador
                        System.out.println();
                        System.out.println("PERDISTE");
                        switch (currentPlayer){
                            case 1:
                                player1Mount -= playerBet;
                                currentPlayer = 2;
                                currentBet += playerBet;
                                break;
                            case 2:
                                player2Mount -= playerBet;
                                currentPlayer = 1;
                                currentBet += playerBet;
                                break;
                        }
                    }
                    shift = false;
                }
            }
            if (currentBet <= 0){
                inGame = false;
            }
        }else {
            System.out.println();
            System.out.println("Juego terminado, no hay mas dinero");
            y = false;

        }
        System.out.println();
        System.out.println("Jugador 1: $" + player1Mount);
        System.out.println("Jugador 2: $" + player2Mount);
        System.out.println("Acumulado: $" + currentBet);
    }

}