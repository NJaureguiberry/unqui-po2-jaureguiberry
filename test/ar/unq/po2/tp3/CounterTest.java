package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter;
	
	
	   
	   @BeforeEach
	   public void setup() {
		   counter = new Counter();
		   counter.addNumber(1);
		   counter.addNumber(3);
		   counter.addNumber(5);
		   counter.addNumber(7);
		   counter.addNumber(1);
		   counter.addNumber(1);
		   counter.addNumber(1);
		   counter.addNumber(1);
		   counter.addNumber(4);
	   }
	   
	@Test
	void testContarPares() {
		assertEquals(counter.contarPares(), 1);
	}
	
	
	@Test
	void testContarMultiplos() {
		assertEquals(counter.contarMultiplos(1), 9);
	}
	
	@Test
	void ContarImpares(){
		assertEquals(counter.contarImpares(),8);
	}
	
	@Test
	void ContarParesDeUnNumero(){
		assertEquals(counter.contarParesDeUnNumero(199292),2);
	}
	
	}
