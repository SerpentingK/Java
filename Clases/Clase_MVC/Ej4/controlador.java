package Ej4;

import Ej4.modelos.usuario;
import java.util.ArrayList;

public class controlador {
    private ArrayList<usuario> usuarios;
    private vista vs;

    public controlador() {
        this.usuarios = new ArrayList<usuario>();
        this.vs = new vista();
        
    }

    public void iniciar() {
        int opcion = 0;
        do {
            vs.mostrarMenu();
            opcion = vs.leerOpcion();
            switch (opcion) {
                case 1:
                    vs.mostrarUsuarios(usuarios);
                    break;
                case 2:
                    usuario nuevoUsuario = vs.crearUsuario();
                    usuarios.add(nuevoUsuario);
                    break;
                case 3:
                    vs.sumarPuntosUsuario(usuarios);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);
    }
}
