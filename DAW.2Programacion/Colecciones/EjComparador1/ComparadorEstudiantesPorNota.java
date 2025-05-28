package EjComparador1;

import java.util.Comparator;

public class ComparadorEstudiantesPorNota implements Comparator<Estudiante> {

    // compare siempre debe ser un clase int , para comparar valores que no son int debemos returnear el clase tambien para que no se pierde su valor
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return Double.compare(o2.nota , o1.nota);
    }
    
}
