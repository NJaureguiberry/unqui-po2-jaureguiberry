package ar.unq.po2.tp5;

import java.util.List;

public class CajaRegistradora {
	public Cliente clienteActual;
	double montoTotal = 0;
	
	public CajaRegistradora(Cliente cliente) {
		this.clienteActual = cliente;
	}

	public double registrarTodosLosProductos() {
		final List<Producto> productos = clienteActual.getProductosAComprar();
		for (Producto producto: productos) {
			this.registrarProducto(producto);
		}
		return montoTotal;
	}

	public void registrarProducto(Producto productoARegistrar) {
		productoARegistrar.restarStock();
		montoTotal += productoARegistrar.getPrecio();
	}

	public Cliente getClienteActual() {
		return clienteActual;
	}

	public void setClienteActual(Cliente clienteActual) {
		this.clienteActual = clienteActual;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
}
