package controladores;

import modelos.*;
import vistas.*;

public class controlador {
    private bd_estudiantes base = new bd_estudiantes();

    public void Ejecutar(){
        boolean x = true;
        while(x){
            int r = vista.Menu();
            switch (r) {
                case 1:
                    vista.ImprimirDatosEstudiantes(base.getBd_estudiantes());
                    break;
            
                default:
                    break;
            }
        }
    }

}
