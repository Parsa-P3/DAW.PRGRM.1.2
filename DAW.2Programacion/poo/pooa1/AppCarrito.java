package pooa1;

public class AppCarrito {

	public static void main(String[] args) {
		
		producto p1 = new producto("P001","Lapiz", 1.25);
		producto p2 = new producto("P002","Goma", 0.9);
		
		carritoCompra c1 = new carritoCompra();
		
		c1.addProducto(p1);
		c1.addProducto(p2);
		c1.addProducto(p2);
		c1.addProducto(p2);
		
		//se recorre el array que devuelve get productos para imprimir su nombre y su precio
		// pp1 es nusetro variable de foreach
		System.out.println("Aqui los productos del carrito: ");
		for (producto pp1 : c1.getProductos()) {
			System.out.println(pp1.getDescripcion() + " -> " + pp1.getPrecio()+ "$");
		}

	}

}
