package pooAvanzada2;

import java.util.Objects;

public class HorasExacta extends Hora {
	protected int segundos;

	public HorasExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	public void incmin() {
		minutos++;
		if (minutos == 60) {
			hora++;
			minutos = 0;

		}
	}

	public void incseg() {
		segundos++;
		if (segundos == 60) {
			minutos++;
			segundos = 0;

		}
	}

	@Override
	public String toString() {
		return "Es a las " + hora + " y " + minutos + " minutos " + segundos + " segundos";
	}

	public boolean setMinutoss(int a) {
		if (a > 0 && a < 60) {

			return true;
		}
		return true;

	}

	public boolean setsegundos(int a) {
		if (a > 0 && a < 60) {
			segundos = a;
			
			return true;
		}if( a >60){
			segundos = a - (60);
			minutos++;
		}
		return true;

	}

	public boolean setHoras(int a) {
		if (a > 0 && a < 24) {
			hora = a;
			return true;
		}
		return true;
	}

	public void HoraExacta(int a, int b, int c) {
		HorasExacta H1 = new HorasExacta(a, b, c);
	}

	@Override
	public int hashCode() {
		return Objects.hash(segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HorasExacta other = (HorasExacta) obj;
		return segundos == other.segundos;
	}



	
}
