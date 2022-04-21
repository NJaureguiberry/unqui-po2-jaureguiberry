package ar.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> numeros = new ArrayList<Integer>();

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void addNumber(int i) {
		this.getNumeros().add(i);

	}

	public int valorTotalSuma() {
		int resultado = 0;
		for (Integer numero : this.getNumeros()) {
			resultado += numero;
		}
		return resultado;
	}

	public int valorTotalResta() {
		int resultado = numeros.get(0);
		for (int i = 1; i < numeros.size(); i++) {
			resultado = (resultado - numeros.get(i));
		}
		return resultado;

	}

	public int valorTotalProducto() {
		int resultado = 1;
		for (Integer numero : this.getNumeros()) {
			resultado *= numero;
		}
		return resultado;

	}

}