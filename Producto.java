
public class Producto {
	private String tipoDeProducto;
	private int precioUnitario;
	
	public Producto(String tipoDeProducto, int precio){
		this.tipoDeProducto=tipoDeProducto;
		this.precioUnitario=precio;
	}
	
	public double calcularPrecio(int cantidad){
		if (tipoDeProducto=="Articulo")
			return precioUnitario*cantidad;
		else
			return precioUnitario*cantidad*0.2;			
	}
}
