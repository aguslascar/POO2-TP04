package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IngresoTest {
	private Trabajador agustin;
	
	@Test
	void testIngresoDeUnMes() {
		agustin = new Trabajador("agustin");
		agustin.agregarIngreso(4, "pago Abril", 50000);
		assertEquals(50000, agustin.ingresoDelMes(4));
		// Testeo que si en el mes ingresado no hay un ingreso, me da un error.
		assertThrows(RuntimeException.class, () -> agustin.ingresoDelMes(5));
	}
	
	void testIngresoDeUnMesConHsExtra() {
		agustin = new Trabajador("agustin");
		agustin.agregarIngreso(4, "pago Abril", 50000);
		agustin.agregarIngresoHsExtra(4, "extraAbril", 10000, 10);
		assertEquals(60000, agustin.ingresoDelMes(4));
		
	}
	
	void testImpuestoAPagar() {
		agustin = new Trabajador("agustin");
		agustin.agregarIngreso(2,"febrero", 50000);
		agustin.agregarIngreso(3,"marzo", 50000);
		agustin.agregarIngreso(4,"abril", 50000);
		assertEquals(30000, agustin.getImpuestoAPagar());
	}
	
	void testImpuestoAPagarConHsExtra() {
		agustin = new Trabajador("agustin");
		agustin.agregarIngreso(2,"febrero", 50000);
		agustin.agregarIngreso(3,"marzo", 50000);
		agustin.agregarIngreso(4,"abril", 50000);
		agustin.agregarIngresoHsExtra(4, "extraAbril", 10000, 10);
		assertEquals(30000, agustin.getImpuestoAPagar());
	}

}
