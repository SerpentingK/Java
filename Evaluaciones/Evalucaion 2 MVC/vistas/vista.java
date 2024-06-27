package vistas;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.estudiante;
import controladores.*;

public class vista {

    static Scanner x = new Scanner(System.in);
    static controlador c = new controlador();

    public static void Inicio(){
        c.Ejecutar();
    }
    public static int Menu(){
        System.out.println("1. Imprimir datos estudiantes.");
        int r = x.nextInt();
        x.nextLine();
        return r;
    }
    public static void ImprimirDatosEstudiantes(ArrayList<estudiante> lista){
        for(estudiante e : lista){
            System.out.println("Codigo: " + e.getCodigo() + " Nombre: " + e.getNombre() + " " + e.getApellido() + " Curso: " + e.getCurso() + " Promedio: " + e.getPromedio() + " Aprobado: " + e.isAprobado());
        }
    }

    public float RecibirFloat(){
        float r = x.nextFloat();
        x.nextLine();
        return r;
    }
}
