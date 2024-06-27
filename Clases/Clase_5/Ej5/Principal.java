package Ej5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Pedir datos por teclado
        System.out.println("Ingrese nombre:");
        String nombre = scanner.nextLine();
    
        System.out.println("Ingrese edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    
        System.out.println("Ingrese sexo (H/M):");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);
    
        float peso;
        do {
            System.out.println("Ingrese peso (entre 0 y 200):");
            peso = scanner.nextFloat();
        } while (peso < 0 || peso > 200);
    
        float altura;
        do {
            System.out.println("Ingrese altura (entre 1 y 2 metros):");
            altura = scanner.nextFloat();
        } while (altura < 1 || altura > 2);
    
        // Crear primer objeto con todos los datos ingresados
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
    
        // Crear segundo objeto con todos los datos menos peso y altura
        Persona persona2 = new Persona(nombre, edad, sexo);
    
        // Crear tercer objeto con valores por defecto y modificarlos con los setters
        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(70);
        persona3.setAltura(175);
    
        // Mostrar información y resultados
        System.out.println("\n--- Resultados ---");
        mostrarResultado(persona1);
        mostrarResultado(persona2);
        mostrarResultado(persona3);
    
        scanner.close();
    }
    

    public static void mostrarResultado(Persona persona) {
        System.out.println("\nInformación de la persona:");
        System.out.println(persona.toString());

        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        int resultadoIMC = persona.calcularIMC();
        if (resultadoIMC == -1) {
            System.out.println("Está por debajo de su peso ideal.");
        } else if (resultadoIMC == 0) {
            System.out.println("Está en su peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }
    }
}
