package ejercicios_practicos;

//Dibuja un cuadrado de n elementos de lado utilizando *.
import java.util.Scanner;

public class cuadrado_anidado {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Lado del cuadrado: ");
		int lado = sc.nextInt();

		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
