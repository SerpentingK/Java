package Ej5;

import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private char sexo;
    private float peso = 0;
    private float altura = 0;

    public Persona(){
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.DNI = generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura){
        this.DNI = generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;

        System.out.println("Hola 3 constructor su edad es: " + edad);
    }

    public int calcularIMC(){
        float imc = peso/(altura * altura);

        if(imc < 20){
            return -1;
        }else if(imc >= 20 && imc <= 25 ){
            return 0;
        }else if(imc > 25){
            return 1;
        }else{
            return 0;
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    private void comprobarSexo(char s){
        char sexoMayuscula = Character.toUpperCase(s);
        if (sexoMayuscula == 'H' || sexoMayuscula == 'M') {
            this.sexo = sexoMayuscula;
        } else {
            this.sexo = 'H';
        }
    }

    private String generaDNI(){
        int numero = generaNumeroAleatorio(10000000, 99999999);
        char letra = calcularLetraDNI(numero);
        return String.format("%d%c", numero, letra);
    }

    private int generaNumeroAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private char calcularLetraDNI(int numero){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numero % 23;
        return letras.charAt(indice);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String toString(){
        String sexoString = "";
        if (sexo == 'H'){
            sexoString = "Hombre";
        }else if(sexo == 'M'){
            sexoString = "Mujer";
        }
        return String.format("Nombre: %s\nEdad: %d\nDNI: %s\nSexo: %s\nPeso: %f\nAltura: %f", nombre, edad, DNI, sexoString, peso, altura);

    }
}
