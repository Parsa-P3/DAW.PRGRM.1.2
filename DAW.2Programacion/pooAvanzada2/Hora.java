package pooAvanzada2;

public class Hora {
	protected int hora;
	protected int minutos;
	
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	public int hora(int a , int b) {
		a = hora;
		b = minutos;
		return hora;
	}
	
	public void inc() {
	 minutos++;
	 if(minutos == 60) {
		 hora ++;
		 minutos = 0;
		 
	 }
		
	}
	
	public boolean setMinutoss(int a) {
		if (a>0 && a<60) {
			
			return true;
		}
		return true;
	
	}
	
	public boolean setHoras(int a) {
		if (a>0 && a<24) {
			hora = a;
			return true;
		}
		return true;
	}
	
	
	

	@Override
	public String toString() {
		return "Es a las " + hora + " y " + minutos + " minutos";
	}

	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMinutos() {
		return minutos;
	}


	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	
	
	

}
