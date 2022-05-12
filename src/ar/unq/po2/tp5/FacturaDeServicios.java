package ar.unq.po2.tp5;

public class FacturaDeServicios extends Factura {
	public double costoPorUnidad;
	public int cantidadDeUnidadesConsumidas;

	public FacturaDeServicios(Agencia unaAgencia, double costoPorUnidad, int cantidadDeUnidadesConsumidas) {
		super(unaAgencia);
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}

	@Override
	public double monto() {
		return costoPorUnidad * cantidadDeUnidadesConsumidas;
	}
}
