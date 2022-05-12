package ar.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(String name, double precio, int stock) {
		this.name = name;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public double getPrecio() {
		double iva = 0.1;
		return precio -= precio*iva;
	}

}
