package ejercicios_practicos;
// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
import java.util.Scanner;

public class cuantos_nums {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("dime numeros y te diré cuantos has introducido");
		int num = 1;
		int contador = 0;
		
		while (num >= 0) {
			num=sc.nextInt();
				if(num < 0)break;
			System.out.println("siguiente numero:");
			contador ++;
		}
		System.out.println("HAS INTRODUCIDO UN NUMERO NEGATIVO, SE TERMINA EL BUCLE");
		System.out.printf("Has introducido un total de: %d numeros",contador);
		
		

	}

}
