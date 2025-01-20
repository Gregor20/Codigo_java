package _apartirdel_8_Noviembre;

import java.util.Scanner;

//Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo indica el final de la introducción de datos pero no se incluye en el cómputo. 

public class ej_21_bucles {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, cantidad = 0, cant_impares = 0, suma_impares = 0, mayor = -1;

		while (true) {
			System.out.println("Dime el siguiente numero");
			numero = Integer.valueOf(sc.nextLine());
			if (numero < 0)
				break;
			cantidad++;

			if (numero % 2 != 0) {
				cant_impares++;
				suma_impares += numero;
			} else {
				if (numero > mayor)
					mayor = numero;

			}
		}
			System.out.printf("total numeros=  %d media impares=  %.2f numero par mayor=  %d ", cantidad,
					(double) suma_impares / cant_impares, mayor);
		

	}
}
