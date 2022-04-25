package ar.unq.po2.tp4;

public class IngresoConHorasExtras extends IngresoPercibido {

	private float horasExtras;

	public IngresoConHorasExtras(String mes, String concepto, int monto, float horasExtra) {
		super(mes, concepto, monto);
		this.setHorasExtras(horasExtra);
	}

	public float getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(float horas) {
		this.horasExtras = horas;
	}
	
	@Override
	public int montoImponible() {
		return 0;
	}
}
