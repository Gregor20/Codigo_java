package ejercicios_practicos;
// Pedir un número N, y mostrar todos los números del 1 al N.

import java.util.Scanner;

public class del_1_al_N {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("dime un número");
		int num = sc.nextInt();
		
			for (int i = 0; i <= num; i++) {
				System.out.println(i);
			}
	}

}
