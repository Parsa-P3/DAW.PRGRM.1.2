package interfaz.interfaz2;

public class AppPagos {
    public static void main(String[] args) {
        
        Bitcoin bitcoin = new Bitcoin(190.0, "Parsa", "parsa666000");
        Paypal paypal = new Paypal(212.800,"Parsa", "parsa@gmail.com");
        TarjetaCredito tarjeta = new TarjetaCredito(100.0, "Parsa" , 0.10, 100);

         
          MetodoPago[] metodosPago = new MetodoPago[3];
        
          double precio = 190.0;
      
          metodosPago[0] = tarjeta;
          metodosPago[1] = paypal;
          metodosPago[2] = bitcoin;
  
          
          for (MetodoPago metodo : metodosPago) {
             metodo.procesarPago(precio);
             
        }
    }
}
