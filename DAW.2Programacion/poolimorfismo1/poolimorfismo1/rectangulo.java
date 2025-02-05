package poolimorfismo1;

public class rectangulo extends Figura {
	protected double longuitud;
	protected double ancho;
	
    void calcularArea(double x) {
		x = longuitud * ancho;
	}
	
	void calcularPrimetro(double x) {
		x = 2 * (longuitud + ancho);
	}

}
