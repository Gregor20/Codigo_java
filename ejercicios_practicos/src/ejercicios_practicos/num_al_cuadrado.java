package ejercicios_practicos;
// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
import java.util.Scanner;

public class num_al_cuadrado {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		int num=0;
		while (num >= 0) {
			System.out.println("dime un numero");
			num = sc.nextInt();
			System.out.println((int)Math.pow(num, 2));
		}
		System.out.println("Has introducido un numero negativo, se terminó el bucle");
		

	}

}
