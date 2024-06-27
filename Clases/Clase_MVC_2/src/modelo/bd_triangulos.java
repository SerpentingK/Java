package modelo;

import java.util.ArrayList;

public class bd_triangulos {
    
    public ArrayList<triangulo> baseDatos = new ArrayList<>();
    
    public bd_triangulos() {
        baseDatos.add(new triangulo(10, 10, 10));
        baseDatos.add(new triangulo(10, 10, 5));
        baseDatos.add(new triangulo(10, 8, 8));
        baseDatos.add(new triangulo(10, 5, 10));
        baseDatos.add(new triangulo(10, 8, 3));

        for(triangulo i : baseDatos){
            i.tipoTriangulo();
            i.calcularArea();
        }
    }

    public ArrayList<triangulo> getBaseDatos() {
        return baseDatos;
    }

    public void añadirTriangulo(triangulo t){
        t.calcularArea();
        t.tipoTriangulo();
        baseDatos.add(t);
    }


    public ArrayList<triangulo> consultarTipo(String tipo){
        ArrayList<triangulo> listaTipo = new ArrayList<triangulo>();
    
        for(triangulo i : baseDatos){
            if(i.getTipo().equals(tipo)){
                listaTipo.add(i);
            }
        }
        return listaTipo;
    }
    
    

    @Override
    public String toString() {
        String txt = "";
        for (triangulo t : baseDatos){
            txt += t.toString() + "\n";
        }
        return txt;
    }

    

}
