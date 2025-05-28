package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploLecturaEscrito {
    public static void main(String[] args) {

        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("prueba.txt"))
            ){
            bw.write("Hola mundo");
            bw.newLine();
            bw.write("Utilizar BufferedWriter");

        } catch (IOException e) {
            System.out.println("Error de BufferedWriter!");
        }
        
        try (     BufferedReader br = new BufferedReader(new FileReader("prueba.txt"))){
        String linea;
        while ((linea = br.readLine()) != null) { 
            System.out.println("Leido: " + linea);
        }
        br.close(); 
            
        } catch (Exception e) {
            System.out.println("Error de BufferedReader!");
        }
    
    }
   
}
