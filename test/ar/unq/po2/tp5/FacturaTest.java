package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	private FacturaDeServicios facturaDeServicio;
	private FacturaDeImpuestos facturaDeImpuesto;
	private CajaRegistradora caja1;

	@BeforeEach
	public void setUp() {
		facturaDeServicio = new FacturaDeServicios(new Agencia(), 70, 3);
		facturaDeImpuesto = new FacturaDeImpuestos(new Agencia(), 50);
		caja1 = new CajaRegistradora();
	}

	@Test
	void testRegistrarFacturaDeServicio() throws Exception {
		caja1.registrar(facturaDeServicio);
		assertEquals(facturaDeServicio.monto(), 210);
		assertEquals(caja1.getMontoTotal(), 210);
	}

	@Test
	void testRegistrarFacturaDeImpuesto() throws Exception {
		caja1.registrar(facturaDeImpuesto);
		assertEquals(facturaDeImpuesto.monto(), 50);
		assertEquals(caja1.getMontoTotal(), 50);
	}

}
