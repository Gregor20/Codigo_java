package _3deNoviembre;

import java.util.Scanner;
//-- Escribe un programa, que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros numeros enteros a partir de uno q se introduce por teclado

public class ejercicio11 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Dime un nº");
		double numero=(int)sc.nextDouble();
		
		for(int i=(int)numero+1; i<=(int)numero+5; i++) 
			
			
			
		
		 System.out.printf("%d %.0f %.0f\n" ,i, Math.pow( i,2),Math.pow(i, 3));
		}
		
		

}
