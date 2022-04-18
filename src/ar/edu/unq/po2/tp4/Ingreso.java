package ar.edu.unq.po2.tp4;

public class Ingreso {
	private int mesPercepcion;
	private String concepto;
	private int monto;
	
	private void setMesPercepcion(int mesPercepcion) {
		this.mesPercepcion = mesPercepcion;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	private void setMonto(int monto) {
		this.monto = monto;
	}

	public int getMesPercepcion() {
		return mesPercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public int getMonto() {
		return monto;
	}

	public Ingreso(int mes, String concepto, int monto) {
		this.setMesPercepcion(mes);
		this.setConcepto(concepto);
		this.setMonto(monto);
	}
	
	public boolean esImponible() {
		/**
		 * Retorna true para saber si el monto se suma a la base imponible,
		 * ya que es un ingreso comun.
		 */
		return true;
	}
}
