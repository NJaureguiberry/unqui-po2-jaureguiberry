package ar.unq.po2.tp3;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persona {
	private String name;
	private Date fechaDeNacimiento;
	
	
	public Persona(String nombre, Date fechaNacimiento) {
		super();
		this.setName(nombre);
		this.setFechaDeNacimiento(fechaNacimiento);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getName() {
		return name;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public long getEdad() {
		 LocalDate hoy = LocalDate.now();   
		 LocalDate nacimiento = this.getFechaDeNacimiento().toInstant().
		           atZone(ZoneId.systemDefault()).toLocalDate(); 
		 long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
		 return edad;
	}
	
	public boolean menorQue(Persona persona) {
	   return this.getEdad() < persona.getEdad();	
	}

	
	
}
