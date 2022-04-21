package ar.unq.po2.tp3;


public class Rectangulo {
    
	private Point esquinaSuperiorIzquierda;
	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorIzquierda;
	private Point esquinaInferiorDerecha;
	
	private void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	private void setEsquinaSuperiorDerecha(Point esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}

	private void setEsquinaInferiorIzquierda(Point esquinaInferiorIzquierda) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
	}

	private void setEsquinaInferiorDerecha(Point esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	public Rectangulo(Point punto, int ancho, int alto) {
		// TODO Auto-generated constructor stub
		super();
		this.setEsquinaInferiorIzquierda(punto);
		this.setEsquinaSuperiorIzquierda(new Point(punto.getX(), punto.getY() + alto));
		this.setEsquinaInferiorDerecha(new Point(punto.getX()+ ancho, punto.getY()));
		this.setEsquinaSuperiorDerecha(new Point(punto.getX()+ ancho, punto.getY() + alto));	
	}
	
	public float getArea() {
		return this.getBase() * this.getAltura();
	}
	
	private float getBase() {
		return  this.getEsquinaInferiorDerecha().getX() -  this.getEsquinaSuperiorIzquierda().getX();
	}
	
	private float getAltura() {
		return  this.getEsquinaSuperiorIzquierda().getY() -  this.getEsquinaInferiorIzquierda().getY();
	}
	
	
	public float getPerimetro() {
		return (this.getAltura()*2) + (this.getBase()*2); 
	}
	
	public boolean esHorizontal() {
		return this.getBase() > this.getAltura();
	}
	
	 

}
