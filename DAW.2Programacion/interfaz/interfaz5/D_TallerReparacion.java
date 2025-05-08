package interfaz5;

public class D_TallerReparacion implements A_GestionOrdenes {

    B_Tecnico[] tecnico;
    A_OrdenReparacion[] orden;
    B_Cliente[] cliente;
    C_Electrodomestico[] electrodomestico;

    int contadorTecnicos = 0;
    int contadorOrdenes = 0;
    int contadorClientes = 0;
    int contadorElectrodomesticos = 0;

    public D_TallerReparacion() {
        this.tecnico = new B_Tecnico[10];
        this.orden = new A_OrdenReparacion[10];
        this.cliente = new B_Cliente[10];
        this.electrodomestico = new C_Electrodomestico[10];
    
    }

    public void addTecnico(B_Tecnico t) {
        boolean anadir = false;
        for (int i = 0; i < tecnico.length; i++) {
            if (tecnico[i] == null) {
                tecnico[i] = t;
                contadorTecnicos++;
                anadir = true;
                System.out.println("Tecnico anadido.");
                break;
            }
        }
        if (!anadir) {
            System.out.println("No se puede anadir mas tecnicos");
        }
    }

    public void AddCliente(B_Cliente c){
       boolean anadir = false;
       for (int i = 0; i < cliente.length; i++) {
           if (cliente[i] == null) { 
               cliente[i] = c;
               contadorClientes++;
               anadir = true;
               System.out.println("Cliente añadido.");
               break;
           }
       }
       if (!anadir) {
           System.out.println("No se puede añadir mas clientes");
       }
    }

    public void addElectro(C_Electrodomestico e) {
        
        boolean anadir = false;
        for (int i = 0; i < electrodomestico.length; i++) {
            if (electrodomestico[i] == null) {
                electrodomestico[i] = e;
                contadorElectrodomesticos++;
                anadir = true;
                System.out.println("Electrodomestico añadido.");
                break;
            }
        }
        if (!anadir) {
            System.out.println("No se puede añadir mas Electrodomesticos");
        }
    }

    

    

    @Override
    public void Registrar(A_OrdenReparacion o) {
        
            boolean anadir = false;
            for (int i = 0; i < orden.length; i++) {
                if (orden[i] == null) { 
                    orden[i] = o;
                    contadorOrdenes++;
                    anadir = true;
                    System.out.println(" --- Orden registrada. ---  ");
                    break;
                }
            }
            if (!anadir) {
                System.out.println("No se puede añadir más órdenes.");
            }
        }

        // lo tengo mal!
    @Override
    public void asignarT(B_Tecnico t) {
         
           boolean asignado = false;
           for (int i = 0; i < tecnico.length; i++) {
               if (tecnico[i] != null && tecnico[i].getDispon() == 1) {  
                   orden[contadorOrdenes - 1].setTecnico(tecnico[i]); 
                   tecnico[i].cambiarDisp(tecnico[i].getDispon()); 
                   asignado = true;
                   System.out.println("Técnico asignado a la orden.");
                   break;
               }
           }
           if (!asignado) {
               System.out.println("No hay técnicos disponibles.");
           }
       }

    @Override
    public void completarOrden(A_OrdenReparacion o) { 
        o.setEstado("Finalizada");
        B_Tecnico tecnicoAsignado = o.getTecnico();
        tecnicoAsignado.setDispon(1);
        System.out.println("Orden completada.");
    }
    @Override
    public void mostrarOrden() {
        // mostrar ordenes pendientes
        for (int i = 0; i < contadorOrdenes; i++) {
            System.out.println(orden[i]);
            if (orden[i] != null && orden[i].getEstado().equals("Pendiente")) {
                System.out.println(orden[i]);
            }
        }
    }
        

    
}
