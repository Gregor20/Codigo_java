package ejercicios_practicos;
//Pide un número (que debe estar entre 0 y 10)
//y mostrar la tabla de multiplicar de dicho número.
import java.util.Scanner;

public class tabla_multiplicar {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Introduce un numero y te diré la tabla de multiplicar");
			int numero = Integer.valueOf(sc.nextLine());

			if (numero >= 0 && numero <= 10) {
				for (int i = 1; i <= numero; i++) {
					int resultado = numero * i;
					System.out.printf("%d * %d = %d\n", numero, i, resultado);
				}

			} else {
				System.out.println("numero fuera de rango");
			}

		} catch (Exception e) {
			System.out.println("Debes introducir un número válido");
		}

	}

}
