package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {
    private Persona Micky;
    private Persona Facu;
    private Persona Nico;
    private Persona lali;
    private Persona vicky;
    private EquipoDeTrabajo equipo1;
    
    @BeforeEach
    public void setUp() throws ParseException {
        equipo1 = new EquipoDeTrabajo();
    	equipo1.setName("TeamNico");
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String stringFecha = "06/10/1999";
        Date fecha = sdf.parse(stringFecha);

        stringFecha = "15/05/2002";
        Date fecha1 = sdf.parse(stringFecha);
        stringFecha = "10/07/1991";
        Date fecha2 = sdf.parse(stringFecha);
        stringFecha = "10/10/1991";
        Date fecha3 = sdf.parse(stringFecha);
        stringFecha = "26/05/2000";
        Date fecha4 = sdf.parse(stringFecha);
        
        
        
        Micky = new Persona("Micky","Goitea", fecha);
        Facu = new Persona("Facu","Cordoba", fecha1);
        Nico = new Persona("Nico","Jaure", fecha2);
        lali = new Persona("Lali","Fernandez", fecha3);
        vicky = new Persona ("Vicky","Gutierrez",fecha4);
        equipo1.addIntegrante(Micky);
        equipo1.addIntegrante(Facu);
        equipo1.addIntegrante(Nico);
        equipo1.addIntegrante(lali);
        equipo1.addIntegrante(vicky);
    }

    @Test
    public void equipoDeTrabajoTieneNombreYConjuntoDeIntegrantes() {
        assertEquals("TeamNico", equipo1.getName());
        assertEquals(5, equipo1.getIntegrantes().size());
    }
    
    @Test
    public void equipoDeTrabajoConoceSuNombreYPromedioDeEdadDeSusIntegrantes() {
        assertEquals(24.4 , equipo1.getPromedioDeEdades());
        System.out.println("El promedio de edad en el equipo " + equipo1.getName() + " es " + equipo1.getPromedioDeEdades() );
    } 
}