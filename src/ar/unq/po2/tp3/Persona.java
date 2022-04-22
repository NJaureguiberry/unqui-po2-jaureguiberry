package ar.unq.po2.tp3;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persona {
	private String name;
	private String surname;
	private Date fechaDeNacimiento;
	
	
	public Persona(String nombre,String apellido, Date fechaNacimiento) {
		super();
		this.setName(nombre);
		this.setApellido(apellido);
		this.setFechaDeNacimiento(fechaNacimiento);
	}
	
	
	public void setApellido(String apellido) {
		this.surname = apellido;
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
	
	public String getApellido() {
		return surname;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int getEdad() {
		 LocalDate hoy = LocalDate.now();   
		 LocalDate nacimiento = this.getFechaDeNacimiento().toInstant().
		           atZone(ZoneId.systemDefault()).toLocalDate(); 
		 Long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
		 return Integer.valueOf(edad.toString());
	}
	
	public boolean menorQue(Persona persona) {
	   return this.getEdad() < persona.getEdad();	
	}

	
	
}
