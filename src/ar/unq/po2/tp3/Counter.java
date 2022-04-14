package ar.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
   private List<Integer> numeros = new ArrayList<Integer> ();
   
   public int contarPares() {
	   int cantidad = 0;
	   for (Integer numero: this.getNumeros()) {
		   if(numero % 2 == 0) cantidad++;
	   }
	   return cantidad;
   }
   
   public int contarImpares() {
	   int cantidad = 0;
	   for (Integer numero: this.getNumeros()) {
		   if(numero % 2 > 0) cantidad++;
	   }
	   return cantidad;
   }

private List<Integer> getNumeros() {
	return numeros;
}

public void addNumber(int i) {
	this.getNumeros().add(i);
	
}

public int contarMultiplos(int x) {
	   int cantidad = 0;
	   for (Integer numero: this.getNumeros()) {
		   if(numero % x == 0) cantidad++;
	   }
	   return cantidad;
}

int contarParesDeUnNumero(int x) {
	   int  cantPares=0;
	   int digito;
	   while(x>0) {
		   digito = x % 10;
		   if (digito % 2 == 0) cantPares++;
		   x = x/10;
	   }
	   return cantPares;
}

int numeroConMasDigitosPares(){
	
}
}
