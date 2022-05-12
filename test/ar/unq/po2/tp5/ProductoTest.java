package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	private ProductoDeCooperativa arroz;
	private ProductoDeEmpresaTradicional detergente;
	private CajaRegistradora caja1;

	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoDeCooperativa("Arroz", 50, 10);
		detergente = new ProductoDeEmpresaTradicional("Detergente", 100, 9);
		caja1 = new CajaRegistradora();
	}
	
	@Test
	public void testRegistrarProductoDeCooperativa() throws Exception {
		caja1.registrar(arroz);
		assertEquals(arroz.getStock(), 9);
		assertEquals(caja1.getMontoTotal(), 45);
	}
	
	@Test
	public void testRegistrarProductoDeEmpresaTradicional() throws Exception {
		caja1.registrar(detergente);
		assertEquals(detergente.getStock(), 8);
		assertEquals(caja1.getMontoTotal(), 100);
	}
	
	
	
	
}
