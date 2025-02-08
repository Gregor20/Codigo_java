package ejercicios_practicos;

import java.util.Scanner;

public class ecuaciones {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// ax^2 + bx + c = 0;
		int a, b, c;
		double x1, x2, d;

		System.out.println("dime a");
		a = sc.nextInt();
		System.out.println("dime b");
		b = sc.nextInt();
		System.out.println("dime c");
		c = sc.nextInt();

		d = (Math.pow(b, 2) - 4 * a * c);

		System.out.println(d);

		if (d < 0)
			System.out.println("no existen soluciones reales");
		else {
			System.out.println("Hay que comprobar que sea distinto de 0");
			
			x1= -b + Math.sqrt(d) / 2*a;
			x2= -b - Math.sqrt(d) / 2*a;
			System.out.println("solucion: "+ x1);
			System.out.println("solucion: "+ x2);
		}

	}

}
