package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {
	
	/**
	 * Test modificado para incluir descuentos variables en productos.
	 */

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.89);
		arroz = new ProductoPrimeraNecesidad("Arroz", 8d, false, 0.92);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.12, leche.getPrecio());
		assertEquals(7.36, arroz.getPrecio());
	}
}
