package modelos;

import java.util.HashMap;

public class producto {
    private HashMap<String, Object> atributos;

    public producto() {
        atributos = new HashMap<>();
        atributos.put("ref", "No definida");
        atributos.put("nombre", "No definido");
        atributos.put("categoria", "No definida");
        atributos.put("precioBase", 0f);
        atributos.put("precio", 0f);
        atributos.put("cantidad", 0);
        atributos.put("total", 0f);
        atributos.put("descuento", 0f);
        atributos.put("aumento", 0f);
        setTotal();
    }

    public producto(String ref, String nombre, float precio, int cantidad) {
        atributos = new HashMap<>();
        atributos.put("ref", ref);
        atributos.put("nombre", nombre);
        atributos.put("precioBase", precio);
        atributos.put("precio", precio);
        atributos.put("cantidad", cantidad);
        atributos.put("descuento", 0f);
        atributos.put("categoria", "PREDEFINIDA");
        atributos.put("aumento", 0f);
        setTotal();
    }

    public void AumentarPrecio(float porcentaje) {
        float precio = (float) atributos.get("precio");
        float aumento = precio * (porcentaje / 100);
        atributos.put("aumento", aumento);
        atributos.put("precio", precio + aumento);
        setTotal();
    }

    public void ResetearPrecio() {
        float precioBase = (float) atributos.get("precioBase");
        atributos.put("precio", precioBase);
        atributos.put("aumento", 0f);
        setTotal();
    }

    public void setTotal() {
        float precio = (float) atributos.get("precio");
        int cantidad = (int) atributos.get("cantidad");
        atributos.put("total", precio * cantidad);
    }

    public String getRef() {
        return (String) atributos.get("ref");
    }

    public void setRef(String ref) {
        atributos.put("ref", ref);
    }

    public String getNombre() {
        return (String) atributos.get("nombre");
    }

    public void setNombre(String nombre) {
        atributos.put("nombre", nombre);
    }

    public String getCategoria() {
        return (String) atributos.get("categoria");
    }

    public void setCategoria(String categoria) {
        atributos.put("categoria", categoria);
    }

    public float getPrecio() {
        return (float) atributos.get("precio");
    }

    public void setPrecio(float precio) {
        atributos.put("precio", precio);
        setTotal();
    }

    public int getCantidad() {
        return (int) atributos.get("cantidad");
    }

    public void setCantidad(int cantidad) {
        atributos.put("cantidad", cantidad);
        setTotal();
    }

    public float getTotal() {
        return (float) atributos.get("total");
    }

    public float getDescuento() {
        return (float) atributos.get("descuento");
    }

    public void setDescuento(float descuento) {
        atributos.put("descuento", descuento);
    }
}
