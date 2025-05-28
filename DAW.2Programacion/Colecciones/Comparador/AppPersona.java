package Comparador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppPersona {
    
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Bernardo", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Luis", 20));

        System.out.println(personas);
        Collections.sort(personas);
        System.out.println(personas);

    }
}
