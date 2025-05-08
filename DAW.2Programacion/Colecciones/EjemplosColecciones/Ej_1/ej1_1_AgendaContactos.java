package EjemplosColecciones.Ej_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej1_1_AgendaContactos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> Nombres = new ArrayList<>();
        Nombres.add("Parsa");
        Nombres.add("Noe");
        Nombres.add("David");
        List<String> Numeros = new ArrayList<>();
        Numeros.add("+90 53521565");
        Numeros.add("+34 34343434");
        Numeros.add("+01 12912912");



        int x = 0;
        while (x != 5) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("-----------Agenda-----------");
            System.out.println("- Ver Contactos        (1) -");
            System.out.println("- Buscar Contacto      (2) -");
            System.out.println("- Agergar Contacto     (3) -");
            System.out.println("- Eliminar Contacto    (4) -");
            System.out.println("- Salir                (5) -");
            System.out.println("----------------------------");
            x = scanner.nextInt();
            scanner.nextLine();
            int size = 0;
            if(Nombres.size()>Numeros.size()){
                size = Nombres.size();
            }else{
                size = Numeros.size();
            }

            if(x == 1){
                
                System.out.println("--------- Contactos ---------");
              
                for (int i = 0; i < size ; i++) {
                    System.out.println(Nombres.get(i) + "  ->   " + Numeros.get(i));
                    
                }
            }else if(x == 2){
                System.out.println("--------- Buscar Contacto ---------");
                System.out.println("- Introducen el nombre para buscar");
                String nombreBuscar = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < size ; i++) {
                    
                    if(nombreBuscar.equalsIgnoreCase(Nombres.get(i)) || nombreBuscar.equalsIgnoreCase(Numeros.get(i))){
                        System.out.println("Contactos encontrados ");
                        System.out.println(Nombres.get(i) + "  ->   " + Numeros.get(i));
                        encontrado = true;
                        break;
                    }

                    
                    
                }
                if (encontrado == false){
                    System.out.println("Contacto no encontrado !");
                }
             
            }else if(x == 3){
                System.out.println("--------- Agregar Contacto ---------");
                System.out.println("- Nombre de contacto :             -");
                String newNombre = scanner.nextLine();
                Nombres.add(newNombre);
                System.out.println("- Numero de contacto :             -");
                String newNumero = scanner.nextLine();
                Numeros.add(newNumero);
                System.out.println("");
                System.out.println("- Contacto Añadido !               -");
            }else if (x == 4){
                System.out.println("----------  Agregar Contacto  ----------");
                System.out.println("- Introducir Nombre/Numero de contacto -");
                String contactoEliminar = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < size ; i++) {
                    
                    if(contactoEliminar.equalsIgnoreCase(Nombres.get(i)) || contactoEliminar.equalsIgnoreCase(Numeros.get(i))){
                        System.out.println("Contacto Eliminado ");
                        System.out.println(Nombres.remove(i) + "  ->   " + Numeros.remove(i));
                         encontrado = true;
                         break;
                    }
                       
                    
                    
                }
                if (encontrado == false){
                    System.out.println("Contacto no encontrado !");
                }
            }else if(x==5){
                System.out.println("--------------------------");
                System.out.println("-Saliendo de Agenda      -");
                System.out.println("--------------------------");
            }else{
                System.out.println("--------------------------");
                System.out.println("-Error! Opcion no valido!-");
                System.out.println("--------------------------");
            }
        }
        
        
    }
    
}
