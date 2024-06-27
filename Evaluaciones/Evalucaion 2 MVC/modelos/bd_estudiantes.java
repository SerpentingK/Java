package modelos;

import java.util.ArrayList;

public class bd_estudiantes {
    private ArrayList<estudiante> bd_estudiantes = new ArrayList<estudiante>();

    public bd_estudiantes(){
        bd_estudiantes.add(new estudiante("1", "David", "Caceres", "Sexto", 2, 1, 3));
        bd_estudiantes.add(new estudiante("2", "Julian", "Chacon", "Octavo", 2, 3, 3));
        bd_estudiantes.add(new estudiante("3", "Felipe", "Piedrahita", "Noveno", 3, 4, 1));
    }

    public ArrayList<estudiante> getBd_estudiantes() {
        return bd_estudiantes;
    }

    public void setBd_estudiantes(ArrayList<estudiante> bd_estudiantes) {
        this.bd_estudiantes = bd_estudiantes;
    }

    
}
