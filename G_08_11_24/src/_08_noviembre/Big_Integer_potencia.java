package _08_noviembre;

import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer_potencia {
	
	public static void main(String[] args) {
		
		//----------------- Quiero saber cuanto son 64 bits en el pc (2 elevado a 64)
		
		 BigInteger dos= BigInteger.valueOf(2);
		
		BigInteger result= dos.pow(64);
		 
		
		System.out.println(result);

		
		//---------------- Hay que usar "Big.Integer" importando la clase "java.math.BigInteger"
	}

}

