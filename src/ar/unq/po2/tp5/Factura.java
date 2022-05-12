package ar.unq.po2.tp5;

public abstract class Factura implements IRegistrable {
    
	public Agencia agencia;
	
	public abstract double monto();
	
	public Factura(Agencia unaAgencia) {
		this.agencia = unaAgencia;
	}
	
	@Override
	public void registrar() {
		agencia.registrarPago(this);
	}
	
	
	
}
