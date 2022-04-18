package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadorTest {
	private Trabajador agustin;
	@Test
	void testTrabajadorIngreso() {
		agustin = new Trabajador("agustin");
		agustin.agregarIngreso(2,"febrero", 50000);
		agustin.agregarIngreso(3,"marzo", 50000);
		agustin.agregarIngreso(4,"abril", 50000);
		assertEquals(150000, agustin.getTotalPercibido());	
	}

}
