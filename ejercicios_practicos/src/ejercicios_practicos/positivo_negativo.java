package ejercicios_practicos;
// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
import java.util.Scanner;

public class positivo_negativo {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("dime un número y te diré si es positivo o negativo");
		int num=1;
		while (num != 0) {
			
			num=sc.nextInt();
			if (num < 0 ) {
				System.out.println("NEGATIVO");
			}else if (num > 0) {
				System.out.println("POSITIVO");
			}
			else {
				System.out.println("ES CERO, TERMINA EL BUCLE");
			}
			
		}

	}

}
