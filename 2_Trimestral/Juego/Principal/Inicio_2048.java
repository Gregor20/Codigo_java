package Principal;

import java.util.Scanner;
import Clases.Tablero;

public class Inicio_2048 {
	static Scanner sc = new Scanner(System.in);

	public static void MenuPrincipal() {
		System.out.println("Menú Principal\n1. Iniciar partida\n2. Continuar Partida\n" + "3. Salir del juego");
	}
	public static void EligeMovimiento() {
		System.out.println("\nIndica tu movimiento (arriba=w, abajo=s," + " derecha=d, izquierda=a, Menú Principal=m");
	}
	public static Tablero IniciarJuego() {
		Tablero t1 = new Tablero();
		t1.rellenarTablero();
		t1.rellenarTablero();
		return jugar(t1);
	}
	public static Tablero ContinuarPartida(Tablero t1) {	
		return jugar(t1);
	}

	public static Tablero jugar(Tablero t1) {
		EligeMovimiento();
		while (!t1.tableroCompleto() && !t1.ganador()) {
			String mov = sc.nextLine();
			switch (mov.toLowerCase()) {
			case "d":
				t1.moverDerecha();
				break;
			case "w":
				t1.moverArriba();
				break;
			case "s":
				t1.moverAbajo();
				break;
			case "a":
				t1.moverIzquierda();
				break;
			case "m":
				System.out.println("Has salido al menú principal");
				return t1;
			}
			t1.mostrarTablero();
			if (t1.ganador()) {
				System.out.println("\nEnhorabuena, has ganado!");
			}
			if (t1.tableroCompleto()) {
				System.out.println("Tablero lleno, has perdido");
			}
		}
		return null;
	}

	public static void main(String[] args) {

		System.out.println("Bienvenido al juego 2048!");
		Tablero t1 = null;

		while (true) {
			int eleccion = 0;
			MenuPrincipal();
			eleccion = sc.nextInt();
			switch (eleccion) {
			case 1:
				t1 = IniciarJuego();
				break;
			case 2:
				if(t1!=null) {
					t1 = ContinuarPartida(t1);
				}else{
					System.out.println("No hay ninguna partida comenzada");
				}
				break;
			case 3:
				System.out.println("Juego terminado");
				return;
			}
		}
	}

}
