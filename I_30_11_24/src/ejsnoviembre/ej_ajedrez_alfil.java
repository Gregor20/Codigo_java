package ejsnoviembre;

import java.util.*;

public class ej_ajedrez_alfil {
	static Scanner sc = new Scanner(System.in);
	
	public static void imprimir(int m[][]) {
		int contador=m.length+1;
		
		System.out.print("   ");
		for(char c='a'; c<'a'+m[0].length; c++) {
			System.out.printf("%4c",c);
		}System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			contador--;
			System.out.printf("*%d*",contador);
			for (int j = 0; j < m[i].length; j++) {
			System.out.printf("%4d", m[i][j]);
		}System.out.println();
	}System.out.println();
}

	/*public static void tabla(int m[][]) { // -------------------------IMPRIMIR

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2d", m[i][j]);
			}
			System.out.println();
		}
	}*/

	public static void posiciones(int fila, int columna) {
		int i=fila, j=columna;
		while (i-1 >= 0 && j+1 < 8) { //-- ARRIBA DERECHA
			i--;
			j++;
			System.out.print((char) ('a'+j) +""+ (i+1)+", ");
		}
		 i=fila; j=columna;
		while (i-1 >= 0 && j-1 >= 0) { //-- ARRIBA IZQUIERDA
			i--;
			j--;
			System.out.print((char) ('a'+j) +""+ (i+1)+", ");
		}
		 i=fila; j=columna;
		while (i+1 < 8  && j+1 < 8) { //-- ABAJO DERECHA
			i++;
			j++;
			System.out.print((char) ('a'+j) +""+ (i+1)+", ");
		}
		 i=fila; j=columna;
		while (i+1 < 8 && j-1 >= 0) { //-- ABAJO IZQUIERDA
			i++;
			j--;
			System.out.print((char) ('a'+j) +""+ (i+1)+", ");
		}
	}

	public static void main(String[] args) {

		String columnas = "abcdefgh";
		String filas = "12345678";

		int matriz[][] = new int[8][8];
		imprimir(matriz);

		System.out.println();

		System.out.println("Dime la posición");
		String respuesta = String.valueOf(sc.nextLine());

		String columna = String.valueOf(respuesta.charAt(0));
		String fila = String.valueOf(respuesta.charAt(1));

		int ncolumna = columnas.indexOf(columna);
		int nfila = filas.indexOf(fila);
		
		posiciones(nfila,ncolumna);

		

	}

}
