import static org.junit.Assert.*;

import org.junit.Test;

public class VentaTest {

	@Test
	public void ventaIniciaConNingunProducto() {
		Venta venta = new Venta();
		assertEquals(0, venta.calcularPrecioTotal());
	}
	
	@Test
	public void agregar1ArticuloAUnaVenta(){
		Venta venta = new Venta();
		Producto producto = new Producto("Articulo",50);
		venta.agregarProducto(producto,1); 
		assertEquals(50, venta.calcularPrecioTotal());
	}
	
	@Test
	public void agregar1ServicioAUnaVenta(){
		Venta venta = new Venta();
		Producto producto = new Producto("Servicio",30);
		venta.agregarProducto(producto, 10); 
		assertEquals(60, venta.calcularPrecioTotal());
	}
	
	@Test
	public void agregarVariosProductosAUnaVenta(){
		Venta venta = new Venta();
		Producto producto1= new Producto ("Articulo",30);
		Producto producto2= new Producto ("Articulo",50);
		Producto producto3= new Producto ("Servicio",20);
		Producto producto4= new Producto ("Servicio",10);
		venta.agregarProducto(producto1, 10);
		venta.agregarProducto(producto2, 30);
		venta.agregarProducto(producto3, 50);
		venta.agregarProducto(producto4, 20);
		assertEquals(2040 , venta.calcularPrecioTotal());
	}

}
