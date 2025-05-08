package interfaz5;

public class App {

    public static void main(String[] args) {
        B_Cliente[] clientes = new B_Cliente[5];
        clientes[0] = new B_Cliente("Sena", 1, "madrid", false);
        clientes[1] = new B_Cliente("Casandra", 1, "mostoles", false);
        clientes[2] = new B_Cliente("Pedro", 1, "vallecas", false);
        clientes[3] = new B_Cliente("Jorge", 1, "madrid", false);
        clientes[4] = new B_Cliente("David", 1, "madrid", false);
            

        C_Televisor tv1 = new C_Televisor("VESTEL", "OLED", "Nuevo", "2 años", false, clientes[0] , "48inch");
        

        B_Tecnico[] tecnicos = new B_Tecnico[5];
        tecnicos[0] = new B_Tecnico("Jose", 1, 0, "junior");
        tecnicos[1] = new B_Tecnico("Javi", 2, 0, "junior");
        tecnicos[2] = new B_Tecnico("Miguel", 3, 1, "Senior");
        tecnicos[3] = new B_Tecnico("Noe", 4, 0, "Senior");
        tecnicos[4] = new B_Tecnico("Parsa", 5, 0, "Senior");

        A_OrdenReparacion[] ordenes = new A_OrdenReparacion[5];

        ordenes[0] = new A_OrdenReparacion(1, tv1 , "" );
        ordenes[1] = new A_OrdenReparacion(2, tv1 , "" );
        ordenes[2] = new A_OrdenReparacion(3, tv1 , "" );
        ordenes[3] = new A_OrdenReparacion(4, tv1 , "" );
        ordenes[4] = new A_OrdenReparacion(5, tv1 , "" );
        

        D_TallerReparacion taller = new D_TallerReparacion();

        taller.addTecnico(tecnicos[0]);
        taller.addTecnico(tecnicos[1]);
        taller.addTecnico(tecnicos[2]);
        taller.addTecnico(tecnicos[3]);
        taller.addTecnico(tecnicos[4]);

        taller.AddCliente(clientes[0]);
        taller.AddCliente(clientes[1]);
        taller.AddCliente(clientes[2]);
        taller.AddCliente(clientes[3]);
        taller.AddCliente(clientes[4]);
        System.out.println(" ");
        System.out.println(" ");

        taller.Registrar(ordenes[0]);
        taller.mostrarOrden();

        System.out.println(" ");
        System.out.println(" ");

        taller.asignarT(tecnicos[2]);
        System.out.println(" ");
        taller.mostrarOrden();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(tecnicos[2].getDispon());

        System.out.println("");
        taller.completarOrden(ordenes[0]);
        taller.mostrarOrden();
        System.out.println(tecnicos[2].getDispon());
        
        
        
    }
    
}
