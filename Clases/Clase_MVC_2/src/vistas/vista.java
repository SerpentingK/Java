package vistas;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;

public class vista {
    public int dato = -1;

    Scanner scan = new Scanner(System.in);

    public int capturaLado(){
        System.out.println("Digite el lado: ");
        this.dato = scan.nextInt();
        scan.nextLine();
        while (this.dato <= 0) {
            System.out.println("El lado debe ser mayor a 0");
            System.out.println("Digite el lado: ");
            this.dato = scan.nextInt();
            scan.nextLine();
        }
        return this.dato;
    }

    public String capturarTipo(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Equilatero");
        list.add("Isoceles");
        list.add("Escaleno");
        boolean x = true;
        while(x){
            System.out.println("Ingrese tipo");
            String tipo = scan.nextLine();
            if(list.contains(tipo)){
                x = false;
                return tipo;
            }else{
                System.out.println("Tipo invalido.");
            }

        }
        
        return "";
    }

    public int menu(){
        System.out.println("Elija opcion.");
        System.out.println("1. Ingresar Triangulo");
        System.out.println("2. Consultar por tipo.");
        System.out.println("3. Mostrar listado de triangulos.");
        System.out.println("4. Salir.");

        int r = scan.nextInt();
        scan.nextLine();
        return r;
    }

    public void imprimirBase(bd_triangulos b){
        System.out.println(b.toString());
    }
    
    public void imprimirListaPorTipo(ArrayList<triangulo> list){
        for(triangulo t: list){
            System.out.println(t.toString());
        }
    }

    
}
