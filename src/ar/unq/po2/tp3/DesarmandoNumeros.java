package ar.unq.po2.tp3;




//import java.lang.reflect.Array;

public class DesarmandoNumeros {

	
    public static int mayorNumeroConDigitoPar(int[] numbers) {
    	int max = contarParesDeUnNumero(numbers[0]);
    	int result = 0; 
        for (int i=1;i<numbers.length; i++) {
            if(contarParesDeUnNumero(numbers[i]) > max) {
            	max = contarParesDeUnNumero(numbers[i]);
            	result = numbers[i];
            }
        }
        return result;
    }
    
    public static int contarParesDeUnNumero(int x) {
 	   int  cantPares=0;
 	   int digito;
 	   while(x>0) {
 		   digito = x % 10;
 		   if (digito % 2 == 0) cantPares++;
 		   x = x/10;
 	   }
 	   return cantPares;
 }
}