package Ej4.modelos;

public class cliente extends usuario{
    public cliente(String nombre, int edad){
        super(nombre, edad);
        System.out.println("Cliente creado");
    }
    @Override
    public String toString() {
        return "usuario [nombre=" + nombre + ", edad=" + edad + ", puntos=" + puntos + "] Rol: Cliente";
    }
}
