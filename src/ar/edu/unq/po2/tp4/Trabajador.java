package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	/**
	 * Una clase que modela a un trabajador que posee nombre, un ingreso y una cantidad de hsExtra.
	 * Las hsExtra podrian ser 0.
	 */
	private String nombre = null;
	private int hsExtra = 0;
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTotalPercibido() {
		int total = 0;
		for(Ingreso ingreso : ingresos) {
			total += ingreso.getMonto();
		}
		return total;
	}
	
	public int getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}
	
	public Trabajador(String nombre) {
		this.setNombre(nombre);
	}
	
	public void agregarIngreso(int mes,String motivo, int monto) {
		/** 
		 * Crea una instancia de Ingreso y la agrega a la lista de ingresos.
		 */
		Ingreso ingreso = new Ingreso(mes, motivo, monto);
		ingresos.add(ingreso);		
	}
	
	public void agregarIngresoHsExtra(int mes,String motivo, int monto, int horas) {
		/** 
		 * Crea una instancia de IngresoHsExtra y la agrega a la lista de ingresos.
		 */
		Ingreso ingreso = new IngresoHsExtra(mes, motivo, monto, horas);
		ingresos.add(ingreso);		
	}
	
	public int ingresoDelMes(int mes) {
		/**
		 * Retorna el monto del ingreso del mes especificado en la lista de ingresos.
		 * Si tiene mas de un ingreso en el mismo mes, se suman.
		 * Si no existe da un error.
		 */
		int total = 0;
		for(Ingreso ingreso : ingresos) {
			if(ingreso.getMesPercepcion() == mes) {
				total += ingreso.getMonto();
			}
			else {
				throw new java.lang.RuntimeException("No hay ingreso registrado para el mes dado");
			}
		}
		return total;
	}
		
	public int getMontoImponible() {
		/**
		 * Retorna el valor total de los ingresos que si suman al monto imponible.
		 * No suma el valor de los ingresos por horas extra.
		 */
		int total = 0;
		for(Ingreso ingreso : ingresos) {
			if(ingreso.esImponible()) {
				total += ingreso.getMonto();
			}
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		/**
		 * Retorna el valor del impuesto a pagar calculando el 2% del monto imponible.
		 */
		return this.getMontoImponible() * 0.02;
	}
}
