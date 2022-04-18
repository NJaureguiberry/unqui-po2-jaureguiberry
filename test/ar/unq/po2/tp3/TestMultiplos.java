package ar.unq.po2.tp3;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplos {

    @Test
    public void testOK() {
        Multiplos multiplos = new Multiplos();
        assertEquals(multiplos.valorMasAltoMultiplo(3, 9), 999);

    }
    
    @Test
    public void testFail() {
        Multiplos multiplos = new Multiplos();
        assertEquals(multiplos.valorMasAltoMultiplo(34, 67), -1);

    }

}