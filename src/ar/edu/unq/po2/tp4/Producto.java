package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre = null;
	private double precio = 0.0;
	private boolean cuidado = false;
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return cuidado;
	}

	private void setCuidado(boolean cuidado) {
		this.cuidado = cuidado;
	}
	
	public Producto(String nombre,double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	public Producto(String nombre,double precio, boolean esCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setCuidado(esCuidado);
	}
	
	public void aumentarPrecio(double aumento) {
		double nvoPrecio = this.getPrecio() + aumento;
		this.setPrecio(nvoPrecio);
	}
	
}
