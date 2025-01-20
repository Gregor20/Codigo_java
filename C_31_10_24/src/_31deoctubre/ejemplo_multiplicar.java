package _31deoctubre;

import java.util.Scanner;

public class ejemplo_multiplicar {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		System.out.println("Dime un numero");
		numero=sc.nextInt();
		
		for(int i=0; i<=10; i++){
		
		System.out.printf(" %2d * %2d = %2d\n", numero, i, numero*i);
		}
		
		

	} 

}
