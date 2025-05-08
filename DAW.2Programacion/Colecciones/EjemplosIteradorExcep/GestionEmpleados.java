package EjemplosIteradorExcep;

import java.util.ArrayList;
import java.util.Iterator;
/*
 c) Clase GestionEmpleados:
 */
public class GestionEmpleados {
    /*
    • Contiene una colección para almacenar objetos de tipo Empleado (ArrayList)
    */
    private ArrayList<Empleado> empleados;
    
    

    public GestionEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /*
     • Implementa un método público llamado agregarEmpleado(Empleado empleado)
        que permita añadir un objeto Empleado a la lista
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /*
     • Implementa un método público llamado obtenerIteradorEmpleados() que
    devuelva un objeto de tipo java.util.Iterator para recorrer la lista de empleados.
     */

    public Iterator<Empleado> obtenerIteradorEmpleados(){
        return empleados.iterator();
    }

    public void aumentarSalarioEmpleadosMayoresDe30(double percentajeAumento){
        Iterator<Empleado> iterador1 = obtenerIteradorEmpleados();
        while (iterador1.hasNext()) {
            Empleado empleado = iterador1.next();

            if (empleado.getEdad()>30) {
                double salarioActualizada = empleado.getSalario() + ( empleado.getSalario() * percentajeAumento);
                empleado.setSalario(salarioActualizada);
                System.out.println("Salario Actualizado");
            }
        }
    }

    public Empleado buscarEmpleadoPorNombre(String nombre) throws EmpleadoNoEncontradoException{
        Iterator<Empleado> iterador1 = obtenerIteradorEmpleados();
        while (iterador1.hasNext()) {
            Empleado empleado = iterador1.next();
            if (empleado.getNombre().equals(nombre)) {
                System.out.println("Empleado encontrado:");
                System.out.println("Nombre: " + empleado.getNombre() + ", Edad: " + empleado.getEdad() + ", Salario: " + empleado.getSalario());
                return empleado;
            }

        }
        throw new EmpleadoNoEncontradoException("No se encontró ningún empleado con el nombre:" + nombre);
    }

    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println("--");
            System.out.println("Nombre: " + e.getNombre() + ", Edad: " + e.getEdad() + ", Salario: " + e.getSalario());
        }
    }

}
