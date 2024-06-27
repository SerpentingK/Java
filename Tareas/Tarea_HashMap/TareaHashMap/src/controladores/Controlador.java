package controladores;

import modelos.*;
import vistas.Vista;

public class Controlador {
    private BDProductos base = new BDProductos();

    public void ejecutar() {
        boolean ejecutando = true;

        while (ejecutando) {
            int r = Vista.menuProductos();
            switch (r) {
                case 1:
                    Vista.imprimirProductos(base.getProductos());
                    break;
                case 2:
                    base.añadirProducto(Vista.recibirProducto());
                    break;
                case 3:
                    base = Vista.actualizarProducto(base);
                    break;
                case 4:
                    base = Vista.eliminarProducto(base);
                    break;
                case 5:
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Valor fuera del rango");
                    break;
            }
        }
    }



}
