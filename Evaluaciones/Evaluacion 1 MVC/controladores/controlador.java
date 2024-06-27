package controladores;

import modelos.*;
import vistas.*;

public class controlador {
    private bd_productos base = new bd_productos();

    public void Ejecutar() {
        boolean ejecutando = true;

        while (ejecutando) {
            vista.Menu();
            int r = vista.RecibirInt();
            switch (r) {
                case 1:
                    vista.ImprimirProductos(base.getProductos());
                    break;
                case 2:
                    base.AumentarPrecios();
                    break;
                case 3:
                    base.ResetearPrecios();
                    System.out.println("Precios reseteados");
                    break;
                case 4:
                    base.AñadirProducto(vista.RecibirProducto());
                    break;
                case 5:
                    ActualizarProducto();
                    break;
                case 6:
                    EliminarProducto();
                    break;
                case 7:
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Valor fuera del rango");
                    break;
            }
        }
    }

    private void ActualizarProducto() {
        System.out.println("Ingrese la referencia del producto: ");
        String ref = vista.RecibirRefProducto();
        producto p = base.BuscarProductoPorRef(ref);
        if (p != null) {
            System.out.println("Producto encontrado:");
            System.out.printf("Referencia: %s Nombre: %s Cantidad: %d\n", p.getRef(), p.getNombre(), p.getCantidad());
            System.out.println("Ingrese la cantidad a añadir (+) o restar (-): ");
            int cantidad = vista.RecibirInt();
            if (cantidad >= 0 || Math.abs(cantidad) <= p.getCantidad()) {
                p.setCantidad(p.getCantidad() + cantidad);
                p.setTotal();
                System.out.println("Cantidad modificada correctamente.");
            } else {
                System.out.println("La cantidad a restar no puede ser mayor que la cantidad actual.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void EliminarProducto() {
        System.out.println("Ingrese la referencia del producto: ");
        String ref = vista.RecibirRefProducto();
        if (base.EliminarProducto(ref)) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
