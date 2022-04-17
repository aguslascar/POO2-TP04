package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private List<Producto> getProductos() {
		return productos;
	}

	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}
	
	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public double getPrecioTotal() {
		double total = 0.0;
		for(Producto producto : this.getProductos()) {
			total += producto.getPrecio();
		}
		return total;
	}
}
