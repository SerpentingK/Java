package Ej4.modelos;

public class admin extends usuario{
    public admin(String nombre, int edad){
        super(nombre, edad);
        System.out.println("Administrador creado.");
    }
    @Override
    public String toString() {
        return "usuario [nombre=" + nombre + ", edad=" + edad + "] Rol: Administrador";
        
    }
}
