package ejercicios_practicos;
// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

import java.util.Scanner;

public class sumadenumeros {
	static Scanner sc= new Scanner (System.in);
		public static void main(String[] args) {
			int num=1;
			int sum=0;
			System.out.println("dime un numero");
			while (num != 0) {
				num = sc.nextInt();
				sum += num;
				if (num == 0) {
					System.out.println("el numero es 0, se termina el bucle");break;
				}
				 System.out.println("siguiente numero:");
				
			}
			System.out.printf("La suma de todos los numeros es: %d",sum);

	}

}
