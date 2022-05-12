package ar.unq.po2.tp5;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class Persona extends SerVivo {

	private Date birthDate;

	public Persona(String name, Date birthDate) {
		super(name);
		this.setBirthDate(birthDate);
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date aBirthDate) {
		this.birthDate = aBirthDate;
	}
	
	public int getAge() {
		 LocalDate hoy = LocalDate.now();   
		 LocalDate nacimiento = this.getBirthDate().toInstant().
		           atZone(ZoneId.systemDefault()).toLocalDate(); 
		 Long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
		 return Integer.valueOf(edad.toString());
	}
	
	public boolean menorQue(Persona persona) {
		   return this.getAge() < persona.getAge();	
		}
}
