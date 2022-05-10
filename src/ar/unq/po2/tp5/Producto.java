package ar.unq.po2.tp5;

public abstract class Producto {
	public String name;
	public double precio;
	public int stock;

	 
	public abstract double getPrecio();

	public void restarStock() {
		stock -= 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		
		
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
