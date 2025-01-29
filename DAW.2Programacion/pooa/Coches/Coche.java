package Coches;

import java.util.Arrays;

public class Coche {
    private int cantidadRuedas;
    private Ruedas[] ruedas;
    
    public Coche(){
        ruedas = new Ruedas[0];
        cantidadRuedas = 0;

    }

    public void addRuedas (String marca , String tamanyo){
        if(cantidadRuedas < 4){
        ruedas = Arrays.copyOf(ruedas, cantidadRuedas +1);
        // ruedas[cantidadRuedas] = x;
        ruedas[cantidadRuedas] = new Ruedas(marca, tamanyo);
        cantidadRuedas++;
        
    }else{
       
        System.out.println("** No se puede añadir mas de 4 ruedas. primeros 4 introducidos son aceptados: ** ");}
        
    }

    public Ruedas[] getRuedas(){
        return Arrays.copyOf(ruedas, cantidadRuedas);
    }

    
    public void mostrarRuedas() {
        for (int i = 0; i < cantidadRuedas; i++) {
            System.out.println("Rueda " + (i+1) + " - Marca: " + ruedas[i].getMarca() + ", Tamaño: " + ruedas[i].getTamanyo());
        }
    }
}
