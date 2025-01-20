package ejs;

import java.util.Scanner;

public class ej3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce una cifra");
		int longitud = 0;
		int cifra = Integer.valueOf(sc.nextLine());

		while (cifra > 0) {

			cifra /= 10;
			longitud++;
		}

		System.out.println(longitud);

	}

}
