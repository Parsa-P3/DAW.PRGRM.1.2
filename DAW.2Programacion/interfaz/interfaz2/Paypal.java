package interfaz2;

import java.util.Scanner;

public class Paypal extends Pago implements Verificable {
    private String correo;
 
    public Paypal(double saldoDisponible, String titular , String correo) {
            super(saldoDisponible, titular);
            this.correo = correo;
        }
    

    

 
        public boolean verificarIdentidad(String usuario) {
            if(usuario.equalsIgnoreCase(correo)){
                return true;
            }else{
                return false;
            }
        }

    
    public void procesarPago(double cantidad){

        System.out.println("Introduce tu usuario : ");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();

        if (verificarIdentidad(usuario)) {
            cantidad = cantidad + ((cantidad * COMISION) + (cantidad * 0.10));
            if(!(tieneSaldoSuficiente(getSaldoDisponible(), cantidad))){
                System.out.println("*****************************");
                System.out.println("*No hay saldo suficiente!   *");
                System.out.println("*Operacion cancelada!       *");
                System.out.println("*****************************");
    
            }else{
                setSaldoDisponible(getSaldoDisponible() - cantidad);
                System.out.println("*******************************************");
                System.out.println("*Operacion realizado con Paypal!          ");
                System.out.println(  "*Saldo actual : " + getSaldoDisponible()+ "           ");
                System.out.println("******************************************");
                
            }
        }else{
            System.out.println("No hemos podido verificar tu usuario");
            System.out.println("Porfavor vuelva intentar en 5 minutos");
        }
    }



  
    
}
