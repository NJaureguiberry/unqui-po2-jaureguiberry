package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuadradoTest {

	@Test
	public void createCuadrado() {
		Point punto = new Point(1,5);
		Cuadrado  cuadrado = new Cuadrado(punto,3);
	
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getX(), 1,0);
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getY(), 5,0);
		
		
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getX(), 1,0);
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getY(), 8,0);
		
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getX(), 4,0);
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getY(), 5,0);
		
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getX(), 4,0);
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getY(), 8,0);
		
	}
	
	@Test
	public void areaRectangulo() {
		Point punto = new Point(1,5);
		Cuadrado  cuadrado = new Cuadrado(punto,3);
		assertEquals(cuadrado.getArea(), 9);
	}
	
	
	@Test
	public void perimetroCuadrado() {
		Point punto = new Point(1,5);
		Cuadrado  cuadrado = new Cuadrado(punto,3);
		assertEquals(cuadrado.getPerimetro(),12);
	}
		
}
