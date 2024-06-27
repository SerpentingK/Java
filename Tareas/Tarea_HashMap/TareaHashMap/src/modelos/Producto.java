package modelos;

import java.util.HashMap;

public class Producto {
    private HashMap<String, Object> atributos;

    public Producto() {
        atributos = new HashMap<>();
        atributos.put("ref", "No definida");
        atributos.put("nombre", "No definido");
        atributos.put("precio", 0f);
        atributos.put("cantidad", 0);
        setTotal();
    }

    public Producto(String ref, String nombre, float precio, int cantidad) {
        atributos = new HashMap<>();
        atributos.put("ref", ref);
        atributos.put("nombre", nombre);
        atributos.put("precio", precio);
        atributos.put("cantidad", cantidad);
        setTotal();
    }

    public void setTotal() {
        float precio = (float) atributos.get("precio");
        int cantidad = (int) atributos.get("cantidad");
        atributos.put("total", precio * cantidad);
    }

    public HashMap<String, Object> getAtributos() {
        return atributos;
    }
    public void setCantidad(int c){
        atributos.put("cantidad", c);
    }

    public String getRef() {
        return (String) atributos.getOrDefault("ref", "No definida");
    }

    public String getNombre() {
        return (String) atributos.getOrDefault("nombre", "No definido");
    }

    public float getPrecio() {
        return (float) atributos.getOrDefault("precio", 0f);
    }

    public int getCantidad() {
        return (int) atributos.getOrDefault("cantidad", 0);
    }

    public float getTotal() {
        return (float) atributos.getOrDefault("total", 0f);
    }

}
