package _5deNoviembre;

import java.util.Scanner;

public class ejercicio_16_primo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Itroduce un numero: ");
		int numero=Integer.valueOf(sc.nextLine());
		boolean primo=true;
		
		for(int i=2; i<numero; i++) {
			if(numero%i==0) {
				primo=false;
				break;
			}
		} 
		String cadena= primo? "Es primo" : "No es primo";
		System.out.printf("el nº = %d %s", numero, cadena);
		
		
				
		
		
			
			
			
		
		

	}

}
