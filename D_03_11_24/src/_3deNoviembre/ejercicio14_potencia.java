package _3deNoviembre;

import java.util.Scanner;

public class ejercicio14_potencia {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Dime la base ");
		long base=Integer.valueOf(sc.nextLine()); 
		
		System.out.print("Dime el exponente ");
		long exponente=Integer.valueOf(sc.nextLine()); 
		
		
		long resultado=(long)Math.pow(base, exponente);
		System.out.println(resultado);

	}

}
