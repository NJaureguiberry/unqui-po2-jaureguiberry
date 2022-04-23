package ar.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trabajador {
    private List<IngresoPercibido> ingresosPercibidos = new ArrayList<IngresoPercibido>();
	
	public int getTotalPercibido() {
		return this.getMontos().stream().mapToInt(Integer::intValue).sum();
	}

	
	public void agregarIngresoPercibido(IngresoPercibido ingresoPercibido) {
      	  this.ingresosPercibidos.add(ingresoPercibido);
	}

	public List<IngresoPercibido> getIngresosPercibidos() {
		return ingresosPercibidos;
	}

	public void setIngresosPercibidos(List<IngresoPercibido> ingresosPersividos) {
		this.ingresosPercibidos = ingresosPersividos;
	}
	
	public List<Integer> getMontos() {
		return this.getIngresosPercibidos().stream()
				   .map(IngresoPercibido -> IngresoPercibido.getMonto())
				   .collect(Collectors.toList());
	}


	
	
	
	
	

}
