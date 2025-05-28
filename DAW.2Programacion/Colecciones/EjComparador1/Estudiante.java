package EjComparador1;


public class Estudiante implements  Comparable<Estudiante> {
    String nombre;
    String apellido;
    double nota ;

    public Estudiante(String nombre , String apellido , double nota) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nota = nota;
    }


    

    @Override
    public int compareTo(Estudiante otra) {
        if (this.apellido.compareTo(otra.apellido) == 0) {
           return this.nombre.compareTo(otra.nombre);
        }else{
            return  this.apellido.compareTo(otra.apellido);
        }
    }


}
