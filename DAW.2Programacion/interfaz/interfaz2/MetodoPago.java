package interfaz.interfaz2;

public interface MetodoPago {

    double COMISION = 0.02;
    double LIMITE_TRANSACCION = 5000.0;

    public void procesarPago(double cantidad);
    
} 
