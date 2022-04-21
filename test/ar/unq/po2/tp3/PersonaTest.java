package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	private Persona persona1;
	private Persona persona2;

	@BeforeEach
	public void setUp() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha1 = "07/09/1991";
		Date fecha1 = sdf.parse(stringFecha1);

		String stringFecha2 = "12/10/1997";
		Date fecha2 = sdf.parse(stringFecha2);

		persona1 = new Persona("Nicolas", fecha1);
		persona2 = new Persona("Agustina", fecha2);
	}

	@Test
	public void edadTest() throws ParseException {
		assertEquals(30, persona1.getEdad());
	}

	// 1. Responder: Si un objeto cualquiera que le pide la edad a una Persona:
	// ¿Conoce cómo ésta calcula u
	// obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite
	// esto?

	// No, ningún otro objeto externo puede conocer la implementacion de edad, solo
	// lo conoce la clase persona.
	// El mecanismo se llama encapsulamiento.

	@Test
	public void esMenorQueTest() {
		assertTrue(persona2.menorQue(persona1));
	}
}
