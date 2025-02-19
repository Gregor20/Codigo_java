package ejercicios_practicos;
//Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
//números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
//cuando el usuario acierta.
import java.util.Scanner;

public class adivina_numero {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("dime el numero que hay que adivinar");
		int num_incognita = sc.nextInt();
		int num = 0;
		System.out.println("adivina el numero");
		
		while (num != num_incognita) {
			num = sc.nextInt();
			
			if(num > num_incognita) {
				System.out.println("menor");
			}else if (num < num_incognita) {
				System.out.println("mayor");
			}else {
				System.out.println("Has acertado");
			}
			
		}

	}

}
