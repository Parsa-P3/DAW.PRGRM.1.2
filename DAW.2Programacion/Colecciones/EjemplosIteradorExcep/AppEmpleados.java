package EjemplosIteradorExcep;

import java.util.ArrayList;

public class AppEmpleados {

    public static void main(String[] args) throws EmpleadoNoEncontradoException {
        
   
        
        ArrayList<Empleado> empleados = new ArrayList<>();

        Empleado e1 = new Empleado("Parsa", 23, 2000);
        Empleado e2 = new Empleado("Noe", 34, 1000);
        Empleado e3 = new Empleado("David", 19, 700);

        GestionEmpleados g1 = new GestionEmpleados(empleados);

        g1.agregarEmpleado(e1);
        g1.agregarEmpleado(e2);
        g1.agregarEmpleado(e3);

        System.out.println("Lista de Empleados : ");
        g1.mostrarEmpleados();

        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ahora aumentamos salario para los que tienen mas de 30 años (+10%)");
        g1.aumentarSalarioEmpleadosMayoresDe30(10);
        g1.mostrarEmpleados();
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ahora buscamos empleo que se llama 'Parsa' " );
        try {
            g1.buscarEmpleadoPorNombre("Parsa");
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ahora buscamos empleo que se llama 'Javi' " );
        try {
            g1.buscarEmpleadoPorNombre("Javi");
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }


    }
}
