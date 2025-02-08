package ejercicios_practicos;

import java.util.Scanner;

// Pedir un número e indicar si es positivo o negativo
public class es_positivo_o_negativo {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("dime un numero");
		int n1= sc.nextInt();
		
		if (n1<0) {
			System.out.println("es numero es negativo");
		}else {
			System.out.println("el numero es positivo");
		}

	}

}
