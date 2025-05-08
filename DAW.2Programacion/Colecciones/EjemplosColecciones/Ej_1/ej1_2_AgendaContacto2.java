package EjemplosColecciones.Ej_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1_2_AgendaContacto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      ArrayList<String[]> Contacto = new ArrayList<>();
        String[] C1 = {"parsa" , "+90 53521565"};
        String[] C2 = {"Noe" , "+34 34343434"};
        String[] C3 = {"David" , "+01 12912912"};
        String[] C4 = {"parsa" , "+90 53521565"};


      Contacto.add(C1);
      Contacto.add(C2);
      Contacto.add(C3);
      Contacto.add(C4);




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
            int size = Contacto.size();
            if(x == 1){
                
                System.out.println("--------- Contactos ---------");
              
                for (int i = 0; i < size ; i++) {
                    System.out.println(Contacto.get(i)[0] + "  ->   " + Contacto.get(i)[1]);
                    
                }
            }else if(x == 2){
                System.out.println("--------- Buscar Contacto ---------");
                System.out.println("- Introducen el nombre/numero para buscar");
                String nombreBuscar = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < size ; i++) {
                    
                    if(nombreBuscar.equalsIgnoreCase(Contacto.get(i)[0]) || nombreBuscar.equalsIgnoreCase(Contacto.get(i)[1])){
                        System.out.println("Contactos encontrados ");
                        System.out.println(Contacto.get(i)[0] + "  ->   " + Contacto.get(i)[1]);
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
                String ContactoNuevo[]  = new String[2];
                ContactoNuevo[0] = scanner.nextLine();

                System.out.println("- Numero de contacto :             -");
                ContactoNuevo[1] = scanner.nextLine();
                
                Contacto.add(ContactoNuevo);

                System.out.println("");
                System.out.println("- Contacto Añadido !               -");
            }else if (x == 4){
                System.out.println("----------  Eliminar Contacto  ----------");
                System.out.println("- Introducir Nombre/Numero de contacto -");
                String contactoEliminar = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < size ; i++) {
                    
                    if(contactoEliminar.equalsIgnoreCase(Contacto.get(i)[0]) || contactoEliminar.equalsIgnoreCase(Contacto.get(i)[1])){
                        System.out.println("Contacto Eliminado ");
                        System.out.println(Contacto.get(i)[0] + "  ->   " + Contacto.get(i)[1]);
                        Contacto.remove(i);
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
