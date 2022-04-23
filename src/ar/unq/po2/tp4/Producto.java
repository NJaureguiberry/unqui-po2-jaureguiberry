package ar.unq.po2.tp4;

public class Producto {
    private String nombre;
    private double precio;
    private boolean preciosCuidado = false;
    

    public Producto(String nombre, double precio) {
        super();
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    public Producto(String nombre, double precio, boolean esPrecioCuidado) {
        this(nombre, precio);
        this.setPreciosCuidado(esPrecioCuidado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean esPrecioCuidado() {
        return preciosCuidado;
    }

    public void setPreciosCuidado(boolean preciosCuidado) {
        this.preciosCuidado = preciosCuidado;
    }

    public void aumentarPrecio(double precioAAumentar) {
        this.setPrecio(this.getPrecio() + precioAAumentar);
    }

}