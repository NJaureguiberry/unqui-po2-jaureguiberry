package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTest {

	Multioperador multioperador;

	@BeforeEach
	public void setup() {
		multioperador = new Multioperador();
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);
	}

	@Test
	void testValorTotalSuma() {
		assertEquals(multioperador.valorTotalSuma(), 9);
	}

	@Test
	void testValorTotalResta() {
		assertEquals(multioperador.valorTotalResta(), -7);
	}

	@Test
	void testValorTotalProductoria() {
		assertEquals(multioperador.valorTotalProducto(), 15);
	}
}
