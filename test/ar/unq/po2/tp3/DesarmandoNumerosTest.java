package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DesarmandoNumerosTest {

	@Test
	void ContarParesDeUnNumero(){
		assertEquals(DesarmandoNumeros.contarParesDeUnNumero(199292),2);
	}

	
	@Test
	public void testEvenCounterDigits() {
        int[] numberList = {451, 23, 11422, 2461, 225, 461, 121111};
        int result = DesarmandoNumeros.mayorNumeroConDigitoPar(numberList);
        assertEquals(result, 11422);
    }
}
