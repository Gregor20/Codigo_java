package ejercicios_practicos;
//Escribir todos los números del 100 al 0 de 7 en 7.

import java.util.Scanner;

public class de_7_en_7 {
	static Scanner sc= new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int num = 100;
		
		for (int i = 0; i <= num; i+=7) {
			System.out.println(num - i);
		}
	}

}
