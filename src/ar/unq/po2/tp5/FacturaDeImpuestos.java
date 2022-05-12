package ar.unq.po2.tp5;

public class FacturaDeImpuestos extends Factura {
	
	public double tasaDeServicio;
	
	
	
	public FacturaDeImpuestos(Agencia unaAgencia, double tasaDeServicio) {
		super(unaAgencia);
		this.tasaDeServicio = tasaDeServicio;
	}



	@Override
	public double monto() {
		return tasaDeServicio;
	}
}
