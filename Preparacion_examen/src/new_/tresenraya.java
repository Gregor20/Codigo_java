package new_;

import java.util.Scanner;

public class tresenraya {
	static Scanner sc = new Scanner(System.in);

	public static boolean ganar(String array[],String simbolo) {

		return (array[0].equals(simbolo) && array[1].equals(simbolo) && array[2].equals(simbolo)) ||   // Fila 1
				(array[3].equals(simbolo) && array[4].equals(simbolo) && array[5].equals(simbolo)) ||  // Fila 2
				(array[6].equals(simbolo) && array[7].equals(simbolo) && array[8].equals(simbolo)) ||  // Fila 3
				(array[0].equals(simbolo) && array[3].equals(simbolo) && array[6].equals(simbolo)) ||  // Columna 1
				(array[1].equals(simbolo) && array[4].equals(simbolo) && array[7].equals(simbolo)) ||  // Columna 2
				(array[2].equals(simbolo) && array[5].equals(simbolo) && array[8].equals(simbolo)) ||  // Columna 3
				(array[0].equals(simbolo) && array[4].equals(simbolo) && array[8].equals(simbolo)) ||  // Diagonal 1
				(array[2].equals(simbolo) && array[4].equals(simbolo) && array[6].equals(simbolo));    // Diagonal 2
	}
	
	public static boolean tablero_lleno(String array[]) {
		
		for(String casilla : array) {
			if (casilla.equals("[ ]")){
				return false;
			}
		}
		return true;
	}
	public static void imprimir_tablero(String array[]) {
		System.out.println(array[0] + array[1] + array[2]);
		System.out.println(array[3] + array[4] + array[5]);
		System.out.println(array[6] + array[7] + array[8]);
	}

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al juego del 3 en raya!!\n");
		String array[] = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };
		// imprimir_tablero(array);
		boolean turnox = true;
		
		while (true) {
			System.out.println("Dime la posicion (de 1 a 9):");
			imprimir_tablero(array);
			int posicion = sc.nextInt();
			
			if (posicion >= 1 && posicion <= 9) {
				if (!array[posicion - 1].equals("[ ]")) {
					System.out.println("Lo siento, esta ocupado");
					turnox=!turnox;
				} 
				else {
					String simbolo = turnox ? "[x]" : "[o]";
					array[posicion - 1] = simbolo;
					
					if (ganar(array, simbolo)) {
						imprimir_tablero(array);
						System.out.println("¡¡¡¡ El jugador " + (turnox ? "[x]" : "[o]") + "ha ganado !!!!");
						break;
					}
					else if(tablero_lleno(array)) {
						imprimir_tablero(array);
						System.out.println("EMPATE!");
						break;
					}
				}
				turnox=!turnox;
			} 
			else {
				System.out.println("la posicion es incorrecta");
				}
		}
	}
}
