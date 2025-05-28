package EjComparador1;

import java.util.ArrayList;
import java.util.Collections;

public class GestionEstudiantes {

    public void agregarEstudiante(ArrayList<Estudiante> lista, Estudiante nuevoEstudiante) throws NotaInvalidaException {
        if (nuevoEstudiante.nota > -1 && nuevoEstudiante.nota < 11) {
            lista.add(nuevoEstudiante);
            return;
        }
        throw new NotaInvalidaException("Nota no puede ser menos que 0 o  mayor que 10");

    }

    public void mostrarEstudiantes(ArrayList<Estudiante> estudiante){
        for (Estudiante estudiante1 : estudiante) {
            System.out.println(estudiante1.nombre +" "+ estudiante1.apellido +" "+ estudiante1.nota );
        }
    }

    public static void ordenarPorNota(ArrayList<Estudiante> estudiantes) {
        estudiantes.sort(new ComparadorEstudiantesPorNota());
    }

    public static void main(String[] args) {
        ArrayList estudiantes = new ArrayList<>();

        GestionEstudiantes g1 = new GestionEstudiantes();
        Estudiante e1 = new Estudiante("Abraham", "a", 9.1);
        Estudiante e2 = new Estudiante("Arya", "b", 10);
        Estudiante e3 = new Estudiante("Burak", "c", 8.2);
        Estudiante e4 = new Estudiante("Pedro", "d", 7.6);
        Estudiante e5 = new Estudiante("Alex", "a", -5.4);

        try {
            g1.agregarEstudiante(estudiantes, e1);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());        }
        
        try {
            g1.agregarEstudiante(estudiantes, e2);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());        }
        
        try {
            g1.agregarEstudiante(estudiantes, e3);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());        }
        
        try {
            g1.agregarEstudiante(estudiantes, e4);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());        }
        
        try {
            g1.agregarEstudiante(estudiantes, e5);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("-- desordenado -- ");
        g1.mostrarEstudiantes(estudiantes);
        Collections.sort(estudiantes);
        System.out.println("-- ordenado alfabetico --");
        g1.mostrarEstudiantes(estudiantes);

        
        System.out.println("-- Ordenada por la nota --");
        g1.ordenarPorNota(estudiantes);
        g1.mostrarEstudiantes(estudiantes);
        
        
    }

}

   