package vistas;

import controladores.Controlador;
import modelos.BDProductos;
import modelos.Producto;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Scanner;

public class Vista {
    static Scanner scan = new Scanner(System.in);
    static Controlador c = new Controlador();

    public static void inicio() {
        c.ejecutar();
    }

    public static int menuProductos() {
        int r = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Imprimir base de productos\n2. Añadir nuevo producto\n3. Actualizar un producto existente\n4. Eliminar un producto\n5. Salir", "Menu", JOptionPane.QUESTION_MESSAGE));
        return r;
    }

    public static void imprimirProductos(HashMap<String, Producto> productos) {
        String m = "PRODUCTOS:\n";
        for (Producto p : productos.values()) {
            String n = m + String.format("Referencia: %s Nombre: %s Precio: %f  Cantidad: %d Total: %f\n", p.getRef(), p.getNombre(), p.getPrecio(), p.getCantidad(), p.getTotal());
            m = n;
        }
        JOptionPane.showMessageDialog(null, m);
    }

    public static Producto recibirProducto() {
        String ref = JOptionPane.showInputDialog(null, "Ingrese la referencia: ", "RECIBIR PRODUCTO", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ", "RECIBIR PRODUCTO", JOptionPane.QUESTION_MESSAGE);
        float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese precio: ", "RECIBIR PRODUCTO", JOptionPane.QUESTION_MESSAGE));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad: ", "RECIBIR PRODUCTO", JOptionPane.QUESTION_MESSAGE));

        return new Producto(ref, nombre, precio, cantidad);
    }


    public static BDProductos actualizarProducto(BDProductos base) {
        String ref = JOptionPane.showInputDialog(null, "Ingrese referencia: ", "RECIBIR PRODUCTO", JOptionPane.QUESTION_MESSAGE);
        Producto p = base.buscarProductoPorRef(ref);
        String m = "";
        if (p != null) {
            m = m + "PRODUCTO ENCONTRADO:\n";
            m = m + String.format("Referencia: %s Nombre: %s Cantidad: %d\n", p.getRef(), p.getNombre(), p.getCantidad());
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, m + "Ingrese la cantidad a añadir (+) o restar (-): ", "RECIBIR PRODUCTO", JOptionPane.QUESTION_MESSAGE));
            if (cantidad >= 0 || Math.abs(cantidad) <= p.getCantidad()) {
                p.setCantidad(p.getCantidad() + cantidad);
                p.setTotal();
                JOptionPane.showMessageDialog(null,"Cantidad modificada con exito.");
            } else {
                JOptionPane.showMessageDialog(null,"Cantidad no valida.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Producto no encontrado");
        }
        return base;
    }
    public static BDProductos eliminarProducto(BDProductos base) {
        String ref = JOptionPane.showInputDialog(null, "Ingrese referencia: ", "RECIBIR PRODUCTO", JOptionPane.QUESTION_MESSAGE);
        if (base.eliminarProducto(ref)) {
            JOptionPane.showMessageDialog(null,"Producto eliminado.");
        } else {
            JOptionPane.showMessageDialog(null,"Producto no encontrado.");
        }
        return base;
    }
}
