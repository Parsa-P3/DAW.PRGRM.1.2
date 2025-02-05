package pooAvanzadaIII;

public class cuentaAhorro extends cuentaBancaria{
	private double interes;

	cuentaAhorro(Cliente cliente, double saldoInicial , double interes) {
		super(cliente , saldoInicial);
		this.setInteres(interes);
	}

	
	
	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public void aplicarinteres() {
		saldoInicial += (saldoInicial * interes) / 100; 
	}
		

}
