package interfaz2;

public abstract class Pago implements MetodoPago {
    private double saldoDisponible;
    private String titular;
    


    
    public double getSaldoDisponible() {
        return saldoDisponible;
    }
    public String getTitular() {
        return titular;
    }
    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }




    public Pago(double saldoDisponible, String titular) {
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }




    public boolean tieneSaldoSuficiente(double saldoDisponible , double cantidadProceso){
        if(saldoDisponible >= cantidadProceso){
            return true;
        }else{
            return false;
        }
    }
    
    
}
