package proyecto2;

import java.util.Scanner;

public class ejerciciovocales {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
		
		
		
		boolean vocal=true;
		
		for(int i=0; i<=27;i++) {
			
			System.out.println("Dime letras");
			String caracter=sc.next().toUpperCase();
	
			if (caracter.equals("A")||caracter.equals("E")||caracter.equals("I")||caracter.equals("O")||caracter.equals("U"))
			{
			vocal=true;
		}else {
			vocal= false; continue;
			}
		String cadena= vocal ? "es vocal " : "es consonante ";
		System.out.printf("la letra %s %s",caracter,cadena);

		}
		
	}

}
