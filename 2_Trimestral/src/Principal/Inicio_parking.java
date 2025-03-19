package Principal;

import Clases.Parking;
import Clases.ParkingException;

import java.util.Scanner;

public class Inicio_parking {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Parking p1 = new Parking("Parking Centro", 10);
		// p1.entrada("1234edf", 1);
		int opcion = 0;
		do {
			try {
				System.out.println("Elige entre 4 opciones:\n1)Entrada de coche\n"
						+ "2)Salida de coche\n3)Mostrar Parking\n4)Salir del programa");

				opcion = Integer.valueOf(sc.nextLine());

				switch (opcion) {
				case 1: // pregunta: Tengo que poner aqui try?catch? si ya lo tengo en el metodo entrada.

					System.out.println("Introduce la matricula");
					String matricula = sc.nextLine();

					System.out.println("Introduce la plaza");
					int plaza = Integer.valueOf(sc.nextLine());

					p1.entrada(matricula, plaza);

					System.out.printf("Plazas totales %d\nPlazas libres %d\nPlazas ocupadas %d\n\n",
							p1.getPlazasTotales(), p1.getPlazasLibres(), (p1.getPlazasOcupadas()));
					break;
				case 2:

					System.out.println("Introduce la matricula");
					String matricula2 = sc.nextLine();

					p1.salida(matricula2);

					System.out.printf("Plazas totales %d\nPlazas libres %d\nPlazas ocupadas %d\n\n",
							p1.getPlazasTotales(), p1.getPlazasLibres(), (p1.getPlazasOcupadas()));
					break;
				case 3:
					System.out.println(p1.toString());
					break;
				case 4:
					System.out.println("Programa terminado");
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("Debes introducir un número");
			} catch(ParkingException e) {
				System.out.println(e.getMensaje()+" "+e.getMatricula());
			}
		} while (opcion != 4);

	}

}
