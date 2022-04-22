package ar.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private List<Persona> integrantes = new ArrayList<>();
	private String name;

	
	public List<Persona> getIntegrantes() {
		return integrantes;
	}

	public void addIntegrante(Persona persona) {
		this.getIntegrantes().add(persona);
	}

	public String getName() {
		return name;
	}

	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPromedioDeEdades() {
		return integrantes.stream().mapToInt(Persona::getEdad).average().getAsDouble();
	}
	
	
}
