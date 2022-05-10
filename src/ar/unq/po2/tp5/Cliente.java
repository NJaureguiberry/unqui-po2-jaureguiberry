package ar.unq.po2.tp5;

import java.util.List;

public class Cliente {
	public List<Producto> productosAComprar;

	public Cliente(List<Producto> productosAComprar) {
		this.productosAComprar = productosAComprar;
	}

	public List<Producto> getProductosAComprar() {
		return productosAComprar;
	}

	public void agregarProductoAPedido(Producto producto) {
		productosAComprar.add(producto);
	}

}
