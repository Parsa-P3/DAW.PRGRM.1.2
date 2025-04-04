package interfaz2;

public class TarjetaCredito extends Pago {


    private double tasaInteres;
    private double limiteCredito;

    public TarjetaCredito(double saldoDisponible, String titular, double  tasaInteres , double  limiteCredito) {
            super(saldoDisponible, titular);
            this.tasaInteres = tasaInteres;
            this.limiteCredito = limiteCredito;
            
        }
    

    public double getTasaInteres() {
        return tasaInteres;
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }



    public void procesarPago(double precio){

        double saldo = getSaldoDisponible() + getLimiteCredito();

        precio =precio +( precio * COMISION );
        if (precio > 1000){
            precio = precio + (precio * tasaInteres);
            
        }
        if(!(tieneSaldoSuficiente(saldo , precio))){
            System.out.println("****************************************");
            System.out.println("*No hay saldo/credito suficiente en tarjeta!   *");
            System.out.println("*Operacion cancelada!                  *");
            System.out.println("* "+(getLimiteCredito()+getSaldoDisponible() - precio) + "*");
            System.out.println("****************************************");

        }else{
            double rest = precio - getSaldoDisponible();
            if(precio > getSaldoDisponible() && (rest<getLimiteCredito())){
                setLimiteCredito((getLimiteCredito() -rest));
                setSaldoDisponible(0);
                
            }else{
               setSaldoDisponible(getSaldoDisponible() - precio); 
            }

             
  
                System.out.println("*******************************************");
                System.out.println("*Operacion realizado con Tarjeta!         ");
                System.out.println(  "*Saldo actual : " + getSaldoDisponible()+ "           ");
                System.out.println("*limite credito actual : " + getLimiteCredito() );
                System.out.println("******************************************");
            
        }
        
    }



    
    
}
