package controladores;

import modelo.*;
import vistas.vista;

public class controlador {
    public bd_triangulos base = new bd_triangulos();
    public triangulo t = new triangulo();
    public vista v = new vista();

    public void ejecucion() {

        boolean x = true;
        while (x) {
            int r = v.menu();

            switch (r) {
                case 1:
                    t.setLadoA(v.capturaLado());
                    t.setLadoB(v.capturaLado());
                    t.setLadoC(v.capturaLado());
                    base.añadirTriangulo(t);
                    break;
                case 2:
                    v.imprimirListaPorTipo(base.consultarTipo(v.capturarTipo()));
                    break;
                case 3:
                    v.imprimirBase(base);
                    break;
                case 4:
                    x = false;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

}
