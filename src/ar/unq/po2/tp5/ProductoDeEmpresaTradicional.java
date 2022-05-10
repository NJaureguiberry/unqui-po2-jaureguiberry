package ar.unq.po2.tp5;

public class ProductoDeEmpresaTradicional extends Producto {

	public ProductoDeEmpresaTradicional(String name, double precio, int stock) {
		this.name = name;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

}
