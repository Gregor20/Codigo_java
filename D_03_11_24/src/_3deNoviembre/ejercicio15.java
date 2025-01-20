package _3deNoviembre;

import java.util.Scanner;

public class ejercicio15 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Dime la base ");
		double base=Double.valueOf(sc.nextLine()); 
		
		System.out.print("Dime el exponente ");
		long exponente=Long.valueOf(sc.nextLine());
		
		for(long i=1; i<=exponente; i++) {
		System.out.printf("%.2f ^ %d = %.2f\n",base,i,Math.pow(base, i));
		} 
		
		

	}

}
