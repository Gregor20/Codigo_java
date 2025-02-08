package ejercicios_practicos;

import java.util.Scanner;

// Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
public class cuantas_cifras {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {

			System.out.println("dime un numero");
			int n1 = sc.nextInt();

			if (n1 > 0 || n1 < 9.999) {
				if (n1 > -1 && n1 < 9) {
					System.out.println("tiene una cifra");
				} else if (n1 > 9 && n1 < 100) {
					System.out.println("tiene dos cifras");
				} else if (n1 > 99 && n1 < 999) {
					System.out.println("tiene tres cifras");
				} else if (n1 > 999 && n1 < 9999) {
					System.out.println("tiene cuatro cifras");
				}else {
					System.out.println("dime un numero entre 0 y 9.999");
				}
			}
		}
	}
}
