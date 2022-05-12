package ar.unq.po2.tp5;

public class CajaRegistradora {

	double montoTotal = 0;

	public CajaRegistradora() {
		this.setMontoTotal(0);
	}

	public void registrar(IRegistrable unRegistrable) throws Exception {
		unRegistrable.registrar();
		montoTotal += unRegistrable.monto();
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
