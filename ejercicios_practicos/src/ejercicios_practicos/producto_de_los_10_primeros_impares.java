package ejercicios_practicos;
//Diseñar un programa que muestre el producto de los 10 primeros números impares.

import java.util.Scanner;

public class producto_de_los_10_primeros_impares {
static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		int num = 1;
		for (int i = 1; i < 20; i += 2) {
			num = num * i;
		}
		System.out.println(num);

	}

}
