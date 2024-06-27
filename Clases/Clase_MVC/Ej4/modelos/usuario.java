package Ej4.modelos;

public class usuario {
    protected String nombre;
    protected int edad;
    protected int puntos;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public usuario(String nombre, int edad){
        setEdad(edad);
        setNombre(nombre);
        setPuntos(0);
    }

    public void sumarPuntos(int suma){
        this.puntos += suma;
    }
    @Override
    public String toString() {
        return "usuario [nombre=" + nombre + ", edad=" + edad + ", puntos=" + puntos + "]";
    }
    
    
}
