package ar.edu.unq.po2.tp4;

public class IngresoHsExtra extends Ingreso{
	

	private int cantHoras;
	
	public IngresoHsExtra(int mes, String concepto, int monto, int cant) {
		super(mes, concepto, monto);
		this.setCantHoras(cant);
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
}
