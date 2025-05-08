package EjemplosColecciones.Ej_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1_3_AgendaContactos3 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array de telefono para contacto 1
        String[] TelefonosC1 = new String[5];
        TelefonosC1[0] = "+34 123";
        TelefonosC1[1] = "+34 223";
        TelefonosC1[2] = "+34 323";
        TelefonosC1[3] = "+34 423";
        TelefonosC1[4] = "+34 523";

        // array de telefono para contacto 2
        String[] TelefonosC2 = new String[5];
        TelefonosC2[0] = "+34 623";
        TelefonosC2[1] = "+34 723";
        
        // crear objetos con telefono array de 5
        ej1_3_Contacto c1 = new ej1_3_Contacto("Parsa", "pour", "shahroodi", TelefonosC1);
        ej1_3_Contacto c2 = new ej1_3_Contacto("Noe", "pour", "shahroodi", TelefonosC2);


        // crear un ArrayList 
        ArrayList<ej1_3_Contacto> contactos = new ArrayList<>();

        /* añadir al list */
        contactos.add(c1);
        contactos.add(c2);
        int x = 0;
        while (x != 5){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------Agenda-----------");
        System.out.println("- Ver Contactos        (1) -");
        System.out.println("- Buscar Contacto      (2) -");
        System.out.println("- Editar Contacto      (3) -");
        System.out.println("- Eliminar Contacto    (4) -");
        x = scanner.nextInt();
        scanner.nextLine();
        if (x == 1) {

            for (ej1_3_Contacto ej1_3_Contacto : contactos) {
                for (int i = 0; i < TelefonosC1.length; i++) {
                    if(ej1_3_Contacto.getTelefonos()[i] != null) {
                        ej1_3_Contacto.info(i);
                 }
                }
                System.out.println("--");
            }

           
        }else if(x == 2){
        if (x == 2) {
            System.out.println("- Introducen el nombre/numero para buscar");

            String nombreBuscar = scanner.nextLine();
            boolean encontrado = false;
            boolean mostrar = true;
            for (int i = 0; i < contactos.size() ; i++) {
                for (int j = 0; j < 5; j++) {
                    
                
                if(nombreBuscar.equalsIgnoreCase(contactos.get(i).getNombre()) || nombreBuscar.equalsIgnoreCase(contactos.get(i).getTelefonos()[j])){
                    
                    if (mostrar) {
                        System.out.println(" ");
                        System.out.println("<- Contactos encontrados ->");
                        System.out.println(" ");
                        mostrar = false ;
                    }
                    if ( contactos.get(i).getTelefonos()[j] != null) {
                        System.out.println(contactos.get(i).getNombre() + " --> " + contactos.get(i).getTelefonos()[j]);
                    encontrado = true; 
                    }
                   
                   
                }
               
            }   
            }
            if (encontrado == false){
                System.out.println("Contacto no encontrado !");
            }
        }
    } if (x == 4) {
        System.out.println("- Introducen el nombre/numero para eliminar");

        String nombreBuscar = scanner.nextLine();
        boolean encontrado = false;
        boolean mostrar = true;
        for (int i = 0; i < contactos.size() ; i++) {
            for (int j = 0; j < 5; j++) {
                
            
            if(nombreBuscar.equalsIgnoreCase(contactos.get(i).getNombre()) || nombreBuscar.equalsIgnoreCase(contactos.get(i).getTelefonos()[j])){
                
                if (mostrar) {
                    System.out.println(" ");
                    System.out.println("<- Contactos Eliminados ->");
                    System.out.println(" ");
                    mostrar = false ;
                }
                if ( contactos.get(i).getTelefonos()[j] != null) {
                    System.out.println(contactos.get(i).getNombre() + " --> " + contactos.get(i).getTelefonos()[j]);
                    contactos.remove(i);
                encontrado = true; 
                }
               
               
            }
           
        }   
        }
        if (encontrado == false){
            System.out.println("Contacto no encontrado !");
        }
    }else if(x == 3){
        
        System.out.println("- Introducen el nombre/numero para editar");
           String nombreBuscar = scanner.nextLine();
        boolean encontrado = false;
        boolean mostrar = true;
        for (int i = 0; i < contactos.size() ; i++) {
            for (int j = 0; j < 5; j++) {
                
            if (mostrar){
            System.out.println("Para editar nombre (1)");
            System.out.println("");
            System.out.println("Para editar numero (2)");
            int o = scanner.nextInt();
            scanner.nextLine();
            if(o == 1){
                if(nombreBuscar.equalsIgnoreCase(contactos.get(i).getNombre()) || nombreBuscar.equalsIgnoreCase(contactos.get(i).getTelefonos()[j])){
                    System.out.println(contactos.get(i).getNombre() + " --> " + contactos.get(i).getTelefonos()[j]);
                    System.out.println("Introducen el nombre nuevo : ");
                    String nombrenuevo = scanner.nextLine();
                    // contactos.set(i, contactos.get(i).setNombre(nombrenuevo));
                    contactos.get(i).setNombre(nombrenuevo);
                    System.out.println(" ");
                    System.out.println(" el nombre nuevo : ");
                    System.out.println(contactos.get(i).getNombre() + " --> " + contactos.get(i).getTelefonos()[j]);
                    System.out.println(" ");
                }
                // conclusion : hay que tener un busqueda como lo de linea 141 y dentro de su if preguntar editar nombre o numero y al resto dentro 
            }else if (o == 2){
                if(nombreBuscar.equalsIgnoreCase(contactos.get(i).getNombre()) || nombreBuscar.equalsIgnoreCase(contactos.get(i).getTelefonos()[j])){
                    System.out.println(contactos.get(i).getNombre() + " --> " + contactos.get(i).getTelefonos()[j]);
                    System.out.println("Introducen el numero nuevo : ");

                    String nombrenuevo = scanner.nextLine();
                    // contactos.set(i, contactos.get(i).setNombre(nombrenuevo));

                            String[] telefononuevo = new String[1];
                            telefononuevo[0] = nombrenuevo;
                    contactos.get(i).setTelefonos(j, nombrenuevo);

                    System.out.println(" ");
                    System.out.println(" el nombre nuevo : ");
                    System.out.println(contactos.get(i).getNombre() + " --> " + contactos.get(i).getTelefonos()[j]);
                    System.out.println(" ");
                }
            }else{
                System.out.println("Opcion no valido!");
            }
            mostrar = false;
        }
            break;   
        }
         
            

        }
    }else{
        System.out.println("Opcion no valido , saliendo de la programa! ");
    }
     
        
    }

}
}
