package vistas;

import java.util.HashMap;
import java.util.Scanner;
import modelos.*;
import controladores.controlador;

public class vista {
    static Scanner scan = new Scanner(System.in);
    static controlador c = new controlador();

    public static void Inicio() {
        c.Ejecutar();
    }

    public static void Menu() {
        System.out.println("1. Imprimir base de productos");
        System.out.println("2. Aumentar precio a los 3 productos con mayor total");
        System.out.println("3. Resetear precios.");
        System.out.println("4. Añadir nuevo producto");
        System.out.println("5. Actualizar un producto existente");
        System.out.println("6. Eliminar un producto");
        System.out.println("7. Salir");
    }

    public static int RecibirInt() {
        int r = scan.nextInt();
        scan.nextLine();
        return r;
    }

    public static void ImprimirProductos(HashMap<String, producto> productos) {
        System.out.println("PRODUCTOS:");
        for (producto p : productos.values()) {
            System.out.printf("Referencia: %s Nombre: %s Categoria: %s Precio: %f Cantidad: %d Total: %f\n",
                    p.getRef(), p.getNombre(), p.getCategoria(), p.getPrecio(), p.getCantidad(), p.getTotal());
        }
    }

    public static producto RecibirProducto() {
        System.out.println("Ingrese referencia: ");
        String ref = scan.nextLine();
        System.out.println("Ingrese nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese precio por unidad: ");
        float precio = scan.nextFloat();
        scan.nextLine();
        System.out.println("Ingrese cantidad en inventario: ");
        int cantidad = scan.nextInt();
        scan.nextLine();

        return new producto(ref, nombre, precio, cantidad);
    }

    public static String RecibirRefProducto() {
        System.out.println("Ingrese la referencia del producto: ");
        return scan.nextLine();
    }

    public static producto RecibirDatosActualizados() {
        System.out.println("Ingrese el nuevo nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el nuevo precio por unidad: ");
        float precio = scan.nextFloat();
        scan.nextLine();
        System.out.println("Ingrese la nueva cantidad en inventario: ");
        int cantidad = scan.nextInt();
        scan.nextLine();

        return new producto("", nombre, precio, cantidad); // La referencia se gestionará en el controlador
    }
}
