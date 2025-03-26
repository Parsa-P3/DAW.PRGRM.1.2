package interfaz.interfaz2;

public class Bitcoin extends Pago{

    private String direccionWallet;

    public Bitcoin(double saldoDisponible, String titular , String direccionWallet) {
      super(saldoDisponible, titular);
          
       
       

    }

    public String getDireccionWallet() {
        return direccionWallet;
    }

    public void setDireccionWallet(String direccionWallet) {
        this.direccionWallet = direccionWallet;
    }
   
    

    public void procesarPago(double cantidad) {
        if(!(tieneSaldoSuficiente(getSaldoDisponible(), cantidad))){
            System.out.println("******************************");
            System.out.println("*No hay bitcoin suficiente!  *");
            System.out.println("*Operacion cancelada!        *");
            System.out.println("******************************");

        }else{
            setSaldoDisponible(getSaldoDisponible() - cantidad);
            System.out.println("*******************************************");
            System.out.println("*Operacion realizado con Bitcoin!         ");
            System.out.println(  "*Saldo actual : " + getSaldoDisponible()+ "           ");
            System.out.println("******************************************");
            
        }

    }

  
    
}
