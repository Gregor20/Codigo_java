package ejercicios_practicos;

import java.util.Scanner;

// Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. Suponer que todos
//los meses tienen 30 días.
public class dia_siguiente {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while(true) {
		System.out.println("dime el dia");
		int dia = sc.nextInt();
		if (dia <= 0 || dia > 30) {
				System.out.println("dime un dia entre el 1 y el 30");
				break;
			}
			System.out.println("dime el mes");
			int mes = sc.nextInt();
			
			if (mes <= 0 || mes > 12) {
				System.out.println("dime un mes del 1 al 12");
				break;

			}
			if (mes == 12) {
				mes = 1;
			}
			System.out.println("dime el año");
			int año = sc.nextInt();
			
			if (año <= 0) {
				System.out.println("dime un año mayor que 0");
				break;
			}
		}
	}

}
