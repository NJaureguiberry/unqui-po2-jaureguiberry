package ar.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuentoAAplicar;

		
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.setDescuentoAAplicar(descuento);
	}
	

	public double getPrecio() {
		return super.getPrecio() * (1 - this.getDescuentoAAplicar() / 100);
	}
	
	public double getDescuentoAAplicar() {
		return descuentoAAplicar;
	}

	public void setDescuentoAAplicar(double descuento) {
		this.descuentoAAplicar = descuento;
	}

}
