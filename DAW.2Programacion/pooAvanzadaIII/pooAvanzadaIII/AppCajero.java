package pooAvanzadaIII;

public class AppCajero {
	
	public static void main(String[] args) {
	  
	  
	  Cliente c1 = new Cliente("Parsa", 23);
	  
	  cuentaBancaria cuenta1 = new cuentaBancaria(c1, 100.00);
	  
	  cuentaAhorro cuentaAhorro =new cuentaAhorro(c1, 100, 10);
	  
	  System.out.println(cuenta1.toString());
	  
	  System.out.println("----------------");
	  System.out.println("Retirar 10$");
	  cuenta1.retirar(10.00);
	  System.out.println(cuenta1.toString());
	  
	  System.out.println("----------------");
	  System.out.println("Depositar 20$");
	  cuenta1.depositar(20.00);
	  System.out.println(cuenta1.toString());
	  
	  System.out.println("----------------");
	  
	  System.out.println(cuentaAhorro.toString()); 
	  System.out.println("Aplicamos interes");
	  cuentaAhorro.aplicarinteres();
	  System.out.println(cuentaAhorro.toString()); 
	  
	}
	

}
