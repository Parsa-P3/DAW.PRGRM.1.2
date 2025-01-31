package pooa1;

import java.util.Objects;

public class vehiculo {
	
	private String marca;
	private String modelo;
	private int anyo;
	
	
	
	
	
	public vehiculo(String marca, String modelo, int anyo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
	}
	
	
	
	// source to string!
	public String toString() {
		return "vehiculo [marca=" + marca + ", modelo=" + modelo + ", anyo=" + anyo + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(anyo, marca, modelo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		vehiculo other = (vehiculo) obj;
		return anyo == other.anyo && Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}



	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	

}
