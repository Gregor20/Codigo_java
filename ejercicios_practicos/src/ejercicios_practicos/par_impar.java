package ejercicios_practicos;
// Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
import java.util.Scanner;

public class par_impar {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("dime un número y te diré si es par o impar");
		int num=1;
		while(num != 0) {
			num=sc.nextInt();
			if(num % 2 == 0) {
				System.out.println("PAR");
			}else {
				System.out.println("IMPAR");
			}
			
		}
		System.out.println("HAS INTRODUCIDO 0, SE TERMINA EL BUCLE");
		

	}

}
