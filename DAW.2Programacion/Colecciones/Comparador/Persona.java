package Comparador;

public class Persona implements  Comparable<Persona> {
    String nombre;
    int edad;

    public Persona(String nombre , int edad){
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }



    @Override
    public int compareTo(Persona otra) {
        // establece como orden natural , el orden alfabetico por "nombre "
         return  this.nombre.compareTo(otra.nombre);

        // orden por edad ascendente
        //  return this.edad - otra.edad;

        // orden por edad descendente
        // return otra.edad - this.edad ;
    }
}
