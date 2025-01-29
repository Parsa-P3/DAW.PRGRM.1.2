package pooa1;

import java.util.Arrays;

public class carritoCompra {
	
	private int cantidadProd;
	private producto[] carrito;
	
	public carritoCompra () {
		carrito = new producto[20];
		cantidadProd = 0;
		
		
	}

	public void addProducto(producto p) {
		carrito[cantidadProd]= p;
		cantidadProd++;
	}
	
	public producto[] getProductos() {
		return Arrays.copyOf(carrito, cantidadProd);
	}
	
}
