package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuento = 0.0;

	private double getDescuento() {
		return descuento;
	}

	private void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado, double descuento) {
		super(nombre, precio, esCuidado);
		this.setDescuento(descuento);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * this.getDescuento();
		
	}
	

}
