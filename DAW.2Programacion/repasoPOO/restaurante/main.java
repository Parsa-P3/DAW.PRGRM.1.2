package restaurante;

import java.util.Scanner;

public class main {

    private static final ordenes o1 = null;
    
        static void opciones (){
            System.out.println("Para ver menu tecla 1 ");
            System.out.println("Para pedir tecla 2 ");
            System.out.println("Para pedir la cuenta 3");
            System.out.println("Para salir de la programa 0");
        }
    
        static void menu(){
            System.out.println("Platos disponibles : ");
            platos p1 = new platos("pescado", 5.5);
            platos p2 = new platos("Pollo", 4.5);
            p2.info();
            p1.info();
        }
    
        static ordenes pedir(mesas mesas , clientes clientes , platos platos){
            ordenes o1 = new ordenes(clientes , mesas , platos);
            o1.info();

            return o1;
    
        }
    
        static void cuenta(ordenes ordenes , mesas mesas){
            double cuenta = ordenes.cuenta(mesas.getCapacidadMesa());
            System.out.println("Cuenta de mesa : " + cuenta);
    
        }
    
        public static void main(String[] args) {
            System.out.println("****Bienvenido****");
            Scanner scanner = new Scanner(System.in);
    
    
            mesas m1 = new mesas(5, "libre", 1);    
            mesas m2 = new mesas(12, "libre", 2);
    
            
            
            System.out.println("Para ver mesas libres pulsa 1 ");
            int answer = scanner.nextInt();
            if(answer == 1){
                platos p1 = new platos("pescado", 5.5);
                platos p2 = new platos("Pollo", 4.5);
                m1.info();
                m2.info();
                System.out.println("Para reservar uno de las mesas libres teclan su numero: ");
                int mesaelegir = scanner.nextInt();
                if(mesaelegir == 1 ){
                    clientes c1 = new clientes(999, "parsa", m1);
                    c1.info();
                    m1.setEstadoMesa("Ocupada!");
                    
                    opciones();
                    int x = scanner.nextInt();
                    while(!(x==0)){
                        if(x == 1){
                        menu();
                        
                    }else if (x==2) {
                        System.out.println("eligen entre el plato 1 / 2");
                        int pedir = scanner.nextInt();
                        if(pedir ==1){
    
                            pedir(m1, c1, p1);
                            
                        }else if (pedir == 2 ){
                            pedir(m1, c1, p2);
                        }
                        
                       
                        
                    }else if (x == 3){
                        cuenta(o1 , m1);}
                    
                }
                

            } else if (mesaelegir == 2) {
                clientes c1 = new clientes(999, "parsa", m2);
                c1.info();
                m2.setEstadoMesa("Ocupada!");
                
            }


        }else{
            System.out.println("Saliendo de la programa!");
        }
    

       

      

    }
}
