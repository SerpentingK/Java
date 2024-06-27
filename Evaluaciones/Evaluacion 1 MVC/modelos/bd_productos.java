package modelos;

import java.util.HashMap;
import com.google.gson.Gson;



public class bd_productos {
    Gson gson = new Gson();
    private HashMap<String, producto> productos = new HashMap<>();

    public bd_productos() {
        productos.put("rf1", new producto("rf1", "arroz", 2500f, 20));
        productos.put("rf2", new producto("rf2", "frijol", 1100f, 7));
        productos.put("rf3", new producto("rf3", "aceite", 4500f, 15));
    }

    public void AñadirProducto(producto p) {
        productos.put(p.getRef(), p);
    }

    public HashMap<String, producto> getProductos() {
        return productos;
    }

    public producto BuscarProductoPorRef(String ref) {
        return productos.get(ref);
    }

    public boolean EliminarProducto(String ref) {
        if (productos.containsKey(ref)) {
            productos.remove(ref);
            return true;
        }
        return false;
    }

    public void AumentarPrecios() {
        // Implementación anterior
    }

    public void ResetearPrecios() {
        // Implementación anterior
    }

    // Nueva función para buscar por referencia y nombre
    public producto BuscarProductoPorRefYNombre(String ref, String nombre) {
        for (producto p : productos.values()) {
            if (p.getRef().equals(ref) && p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    // Nueva función para actualizar la cantidad de un producto por referencia
    public void ActualizarCantidad(String ref, int cantidad) {
        producto p = BuscarProductoPorRef(ref);
        if (p != null) {
            p.setCantidad(cantidad);
            p.setTotal();
        }
    }
}
