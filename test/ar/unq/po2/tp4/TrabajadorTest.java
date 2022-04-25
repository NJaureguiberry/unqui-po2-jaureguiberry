package ar.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadorTest {

	@Test
	public void testTotalPercibido() {
     Trabajador trabajador = new Trabajador();
     IngresoPercibido ingreso = new IngresoPercibido("Abril", "honorarios", 30000);
     assertEquals(0, trabajador.getTotalPercibido());
     trabajador.agregarIngresoPercibido(ingreso);
     assertEquals(30000, trabajador.getTotalPercibido());
	}
	
	@Test
	public void testGetMontoImponible() {
     Trabajador trabajador = new Trabajador();
     IngresoPercibido ingreso = new IngresoPercibido("Abril", "honorarios", 30000);
     IngresoConHorasExtras ingresoConHoras = new IngresoConHorasExtras("Abril", "honorarios", 10000, 2);
     assertEquals(0, trabajador.getTotalPercibido());
     trabajador.agregarIngresoPercibido(ingreso);
     trabajador.agregarIngresoPercibido(ingresoConHoras);
     assertEquals(30000, trabajador.getMontoImponible());
     assertEquals(40000, trabajador.getTotalPercibido());
	}
	
	@Test
	public void testGetImpuestoAPagar() {
     Trabajador trabajador = new Trabajador();
     IngresoPercibido ingreso = new IngresoPercibido("Abril", "honorarios", 30000);
     IngresoConHorasExtras ingresoConHoras = new IngresoConHorasExtras("Abril", "honorarios", 10000, 2);
     assertEquals(0, trabajador.getTotalPercibido());
     trabajador.agregarIngresoPercibido(ingreso);
     trabajador.agregarIngresoPercibido(ingresoConHoras);
     assertEquals(30000, trabajador.getMontoImponible());
     assertEquals(600, trabajador.getImpuestoAPagar());
	}
}
