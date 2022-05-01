package ar.unq.po2.tp4;

public class IngresoPercibido {
    private String mes;
    private String concepto;
    private int monto;
    
    public IngresoPercibido(String mes, String concepto, int monto) {
    	this.setConcepto(concepto);
    	this.setMes(mes);
    	this.setMonto(monto);
    }

    
    
    
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	public int getmontoImponible() {
		return this.getMonto();
	}
	
	

    
    
    
}
