package ejs;

import java.util.Scanner;

public class ej_23 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int suma = 0, cantidad = 0, numero;

		do {
			System.out.println("Dime el siguiente numero");
			numero = Integer.valueOf(sc.nextLine());
			suma += numero;
			cantidad++;

		} while (suma < 1000);
		
		if (suma>1000) {
			suma -= numero;
			cantidad --;
		}
		
		System.out.printf("La suma es= %d  Total de numeros= %d  La media es=  %.2f",suma,cantidad,(double)suma/cantidad);

	}

}
