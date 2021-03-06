package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaRegistradoraTest {

	private ProductoDeCooperativa arroz;
	private ProductoDeEmpresaTradicional detergente;
	private CajaRegistradora caja1;
	private FacturaDeServicios facturaDeServicio;
	private FacturaDeImpuestos facturaDeImpuesto;

	@BeforeEach
	public void setUp() {
		arroz = new ProductoDeCooperativa("Arroz", 50, 10);
		detergente = new ProductoDeEmpresaTradicional("Detergente", 100, 9);
		caja1 = new CajaRegistradora();
		facturaDeServicio = new FacturaDeServicios(new Agencia(), 70, 3);
		facturaDeImpuesto = new FacturaDeImpuestos(new Agencia(), 50);
	}

	@Test
	public void testRegistrarProductosDeCliente() throws Exception {
		caja1.registrar(facturaDeServicio);
		caja1.registrar(facturaDeImpuesto);
		caja1.registrar(arroz);
		caja1.registrar(detergente);
		assertEquals(caja1.getMontoTotal(), 405);
	}
}
