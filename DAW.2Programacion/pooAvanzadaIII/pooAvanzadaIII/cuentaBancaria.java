package pooAvanzadaIII;

public class cuentaBancaria {
	protected double saldoInicial;
	protected Cliente cliente;
	
	cuentaBancaria(Cliente cliente,double saldoInicial) {
		this.saldoInicial = saldoInicial;
		this.cliente = cliente;
	}
	
	
	
	
	
	boolean depositar(double cantidad) {
		if (cantidad > 0) {
			saldoInicial = saldoInicial + cantidad;
			return true;

		}return true;
	}
	
	
	boolean retirar(double cantidad) {
		if(cantidad <= saldoInicial && cantidad > 0) {
			saldoInicial= saldoInicial-cantidad;
			return true;
		}
		return true;
		
	}
	
	
	
	 

	
	
	@Override
	public String toString() {
		return cliente + "saldo inicial " + saldoInicial;
	}




	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
}
