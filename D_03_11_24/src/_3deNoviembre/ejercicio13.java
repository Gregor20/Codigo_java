package _3deNoviembre;

import java.util.Scanner;

public class ejercicio13 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		int negativo=0;
		int positivo=0;
		
		
		
		for(int i=1; i<=10; i++) {    //------------------- Bucle "for", para poner un maximo de 10 numeros, si son mas de 10, PARA.
			System.out.print("Dime el nº"+i+" ");
			numero=sc.nextInt();
		
		
		if(numero<0) {             //--------------------- SI el numero es negativo, suma 1 a "negativo"
			negativo++;
		}else {positivo++;}         //-------------------- SI es cualquier otro numero, suma 1 a "positivo"
		
	
		} System.out.printf("Numeros negativos= %d Numeros positivos= %d", negativo, positivo);

	}

}
