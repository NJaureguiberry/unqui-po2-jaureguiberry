package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

class PersonaYMascotaTest {
	

	@Test
	public void coleccionarPersonaYMascota() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha1 = "07/09/1991";
		Date fecha1 = sdf.parse(stringFecha1);

		String stringFecha2 = "12/10/1997";
		Date fecha2 = sdf.parse(stringFecha2);
		
		
		Persona persona1 = new Persona("Nicolas", fecha1);
		Persona persona2 = new Persona("Agustina", fecha2);
		Mascota perro = new Mascota("Cholo", "yorkie");
		Mascota gato = new Mascota("Anita", "Siames");
		
		

		List<SerVivo> seresVivos = new ArrayList<>();

		seresVivos.add(persona1);
		seresVivos.add(persona2);
		seresVivos.add(perro);
		seresVivos.add(gato);
		for (SerVivo serVivo : seresVivos) {
			System.out.println(serVivo.getName());
		}

	}
	
	@Test
	public void compararEdadesTest() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha1 = "07/09/1991";
		Date fecha1 = sdf.parse(stringFecha1);

		String stringFecha2 = "12/10/1997";
		Date fecha2 = sdf.parse(stringFecha2);
		
		
		Persona persona1 = new Persona("Nicolas", fecha1);
		Persona persona2 = new Persona("Agustina", fecha2);
		
		assertTrue(persona2.menorQue(persona1));
	}
}
