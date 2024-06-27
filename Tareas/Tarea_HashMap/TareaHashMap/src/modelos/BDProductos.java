package modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class BDProductos {
    Gson gson = new Gson();
    private HashMap<String, Producto> productos = new HashMap<>();
    private static int contador = 0;

    public BDProductos() {
        productos.put(crearReferencia(), new Producto("NECTAR", "VERDE", 15000, 20));
        productos.put(crearReferencia(), new Producto("NECTAR", "DORADO", 15000f, 7));
        productos.put(crearReferencia(), new Producto("RON", "CALDAS", 16000f, 15));
        actualizarJson();
    }
    public void actualizarJson(){
        String json = gson.toJson(productos);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter fileWriter = new FileWriter("BDProductos.json")){
            gson.toJson(gson.fromJson(json, Object.class), fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String crearReferencia(){
        contador++;
        return "ref" + contador;
    }

    public void añadirProducto(Producto p) {
        productos.put(crearReferencia(), p);
        actualizarJson();
    }

    public HashMap<String, Producto> getProductos() {
        return productos;
    }

    public Producto buscarProductoPorRef(String ref) {
        return productos.get(ref);
    }

    public boolean eliminarProducto(String ref) {
        if (productos.containsKey(ref)) {
            productos.remove(ref);
            actualizarJson();
            return true;
        }
        return false;
    }

    public void actualizarCantidad(String ref, int cantidad) {
        Producto p = buscarProductoPorRef(ref);
        if (p != null) {
            p.setCantidad(cantidad);
            p.setTotal();
        }
        actualizarJson();
    }
}
