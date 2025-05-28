package Ficheros_EV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


      int bucle = 0;

      while (bucle != 5) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("--------- Jefatura --------");
        System.out.println("- Agregar Estudiante   (1) -");
        System.out.println("- Ver Estudiantes      (2) -");
        System.out.println("- Calcular Promedio    (3) -");
        System.out.println("- Generar informe      (4) -");
        System.out.println("- Salir                (5) -");
        System.out.println("----------------------------");
        bucle = scanner.nextInt();
        if(bucle == 1){
            AnyadirEstudiante("Prometeo.txt");
        }else if (bucle == 2 ) {
          List<Estudiante> Estudiantes = leerEstudiante("Prometeo.txt" , true);  
          
        }else if(bucle ==3){
          List<Estudiante> Estudiantes = leerEstudiante("Prometeo.txt" , false);  
          double promedio = calcularPromedio(Estudiantes);
          
          System.out.println("");
          System.out.println("Promedio de notas : " + promedio); 
        }else if(bucle ==4){
          // hemos dejado aqui  no imprime informeprometeo
          List<Estudiante> Estudiantes = leerEstudiante("Prometeo.txt" , false);      
          generarInforme("informe_notas.txt",Estudiantes);
          
          
        }
      }
    }
    


    public static void AnyadirEstudiante(String nombreArchivo){
      Scanner scanner = new Scanner(System.in);
      boolean b1 = true ;
      try (
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo ,true))
        ){
          while (b1) {
             System.out.println("Porfavor introduce nombre de alumno (Q para salir): ");
        String nombreAlumno = scanner.nextLine();
        if (nombreAlumno.equalsIgnoreCase("q")) break;
        System.out.println("Porfavor introduce la nota :");
        int notaAlumno = -1 ; 
        do{
          System.out.println("(Nota debe ser entre 0 y 10)");
          notaAlumno=Integer.parseInt(scanner.nextLine()); 
        }while(notaAlumno < 0 || notaAlumno >10);

       
          
        // String notaEnString = String.valueOf(notaAlumno);
        bw.write(nombreAlumno  + " - " +  notaAlumno);
        bw.newLine();
       
          }
       
        

    } catch (IOException e) {
        System.out.println("Error al escribir archivo!" + e.getMessage());
    }
    }

    public static List<Estudiante> leerEstudiante(String nombreArchivo , boolean Mostrar){
        List<Estudiante> estudiantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
          String linea;
          while((linea = br.readLine()) !=null){
            String[] x = linea.split(" - ");
            if(x.length == 2){
              String nombre = x[0].trim();
              int nota = Integer.parseInt(x[1].trim());
              estudiantes.add(new Estudiante(nombre, nota));
              if(Mostrar == true){
              System.out.println("Nombre : " +nombre +" - Nota : " +nota);
              }
              
            }
          }
          
        } catch (Exception e) {
          System.out.println("Error en leer el archivo: " + e.getMessage());
        }
        return estudiantes;
    }

    public static double calcularPromedio(List<Estudiante> Estudiantes) {
      if (Estudiantes.isEmpty()) return 0;
  
      int total = 0;
      for (Estudiante s : Estudiantes) {
          total += s.getNota();
      }
      return (double) total / Estudiantes.size();
  }
  

  public static void generarInforme(String nomArch, List<Estudiante> Estudiantes) {
    try (BufferedWriter w = new BufferedWriter(new FileWriter(nomArch))) {
        w.write("-- Aprobados --");
        w.newLine();
        System.out.println(" -- Aprobados -- ");
        for (Estudiante s : Estudiantes) {
            if (s.getNota() >= 5) {
                w.write(s.getNombre());
                w.newLine();
                
                System.out.println(s.getNombre());
            }
        }

        System.out.println(" -- Suspendidos -- ");
        w.write("-- Suspendidos -- ");
        w.newLine();
        for (Estudiante s : Estudiantes) {
            if (s.getNota() < 5) {
                w.write(s.getNombre());
                w.newLine();
                
                System.out.println(s.getNombre());
            }
        }
        
    } catch (IOException e) {
        System.out.println("Error al escribir el informe: " + e.getMessage());
    }
}

}
