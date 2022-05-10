package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaRegistradoraTest {

	private ProductoDeCooperativa arroz;
	private ProductoDeEmpresaTradicional detergente;
	private CajaRegistradora caja1;
	private Cliente cliente1;
	

	@BeforeEach
	public void setUp() {
		arroz = new ProductoDeCooperativa("Arroz", 50, 10);
		detergente = new ProductoDeEmpresaTradicional("Detergente", 100, 9);
		cliente1 = new Cliente(new ArrayList<Producto>());
		caja1 = new CajaRegistradora(cliente1);
	}

	@Test
	public void testRegistrarProductoDeCooperativa() {
		caja1.registrarProducto(arroz);
		assertEquals(arroz.getStock(), 9);
		assertEquals(caja1.getMontoTotal(), 45);
	}

	@Test
	public void testRegistrarProductoDeEmpresaTradicional() {
		caja1.registrarProducto(detergente);
		assertEquals(detergente.getStock(), 8);
		assertEquals(caja1.getMontoTotal(), 100);
	}

	@Test
	public void testRegistrarProductosDeCliente() {
		caja1.setClienteActual(cliente1);
		cliente1.agregarProductoAPedido(arroz);
		cliente1.agregarProductoAPedido(detergente);
		caja1.registrarTodosLosProductos();
		assertEquals(detergente.getStock(), 8);
		assertEquals(arroz.getStock(), 9);
		assertEquals(caja1.getMontoTotal(), 145);
	}
}
