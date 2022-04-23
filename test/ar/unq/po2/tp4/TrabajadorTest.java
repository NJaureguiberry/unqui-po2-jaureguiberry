package ar.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadorTest {

	@Test
	public void testtotalPercibido() {
     Trabajador trabajador = new Trabajador();
     IngresoPercibido ingreso = new IngresoPercibido("Abril", "honorarios", 30000);
     assertEquals(0, trabajador.getTotalPercibido());
     trabajador.agregarIngresoPercibido(ingreso);
     assertEquals(30000, trabajador.getTotalPercibido());
	}
}
