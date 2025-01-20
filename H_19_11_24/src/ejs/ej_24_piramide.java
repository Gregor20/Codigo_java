package ejs;

import java.util.Scanner;

public class ej_24_piramide {
static Scanner sc=new Scanner(System.in);

	public static void haciaarriba(int n) {
		
		String cadena;
		for (int i = n; i >= 1; i --) {
			cadena = " ".repeat(i-1);
			for(int j = 1; j <= n-i+1; j ++ )
		}
	}



	public static void main(String[] args) {
		System.out.println("Dime la altura de la piramide: ");
		int n = Integer.valueOf(sc.nextLine());
		haciaarriba(n);
		
		
		

	}

}
