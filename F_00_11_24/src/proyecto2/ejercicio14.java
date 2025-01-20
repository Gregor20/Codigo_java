package proyecto2;

import java.util.Scanner;

public class ejercicio14 {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Dime un numero que sea par y/o divisible entre 5 ");
		numero=sc.nextInt();
		
		if (numero%2==0) {
		System.out.println("El numero es par");
		}
		
		else {
			System.out.println("El numero es impar");
			}
		
		if (numero%5==0) {
			
			System.out.println("El numero se puede dividir entre 5 ");
		}
		else {
			System.out.println("El numero no se puede dividir entre 5 ");
		}
		
		
		
			
		
		
		

	}

}
