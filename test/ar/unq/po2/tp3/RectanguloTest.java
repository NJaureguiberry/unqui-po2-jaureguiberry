package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	public void createRectangulo() {
		Point punto = new Point(1,5);
		Rectangulo  rectangulo = new Rectangulo(punto,3,2);
	
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getX(), 1,0);
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getY(), 5,0);
		
		
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getX(), 1,0);
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getY(), 7,0);
		
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getX(), 4,0);
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getY(), 5,0);
		
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getX(), 4,0);
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getY(), 7,0);
		
	}
	
	@Test
	public void areaRectangulo() {
		Point punto = new Point(1,5);
		Rectangulo  rectangulo = new Rectangulo(punto,3,2);
		assertEquals(rectangulo.getArea(), 6);
	}
	
	@Test
	public void perimetroRectangulo() {
		Point punto = new Point(1,5);
		Rectangulo  rectangulo = new Rectangulo(punto,3,2);
		assertEquals(rectangulo.getPerimetro(),10);
	}
	@Test
	public void esHorizontalTest() {
		Point punto = new Point(1,5);
		Rectangulo  rectangulo = new Rectangulo(punto,3,2);
		assertTrue(rectangulo.esHorizontal());
	}
	
	@Test
	public void esVerticalTest() {
		Point punto = new Point(1,5);
		Rectangulo  rectangulo = new Rectangulo(punto,3,5);
		assertFalse(rectangulo.esHorizontal());
	}
	
}
