package ejercicios_practicos;

import java.util.Scanner;

public class circulo_area {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("dime el radio(cm)");
		double r = sc.nextDouble();
		
		double area = 3.14 * Math.pow(r, 2);
		
		System.out.println("el area del circulo es "+area+"cm");

	}

}
