public class Venta {
	
	private int precioTotal;
	
	public Venta(){
		this.precioTotal=0;
	}
	
	public int calcularPrecioTotal(){
		return precioTotal;
	}
	
	public void agregarProducto(Producto productoAAgregar, int cantidad){
		precioTotal += productoAAgregar.calcularPrecio(cantidad);
	}
	
}
