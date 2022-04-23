package ar.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {
    private String name;
    private String direccion;
    private List<Producto> productos = new ArrayList <Producto>();
    
    public Supermercado(String string, String string2) {
		this.setName(string);
		this.setDireccion(string2);
	}

	
    public int getCantidadDeProductos() {
		return this.productos.size();
	}
    
    public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);	
	}
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	public List<Double> getPrecios() {
		return this.getProductos().stream().map(Producto -> Producto.getPrecio()).collect(Collectors.toList());
	}
	
	public Double getPrecioTotal() {
		return this.getPrecios().stream().mapToDouble(Double::doubleValue).sum();
	}


	

	
}
