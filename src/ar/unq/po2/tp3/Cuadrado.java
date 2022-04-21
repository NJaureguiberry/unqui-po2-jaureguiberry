package ar.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	private Cuadrado(Point punto, int ancho, int alto) {
		super(punto, ancho, alto);
		
	}
	
	public Cuadrado(Point punto, int lado) {
		this(punto, lado, lado);
	}

	
}
