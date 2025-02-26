package asdf;

import java.util.*;

public class ej2_matrices2 {
	static Scanner sc = new Scanner(System.in);

	public static int alea(int mn, int m) {

		return (int) (Math.random() * (m - mn + 1)) + mn;
	}

	public static void rellenaraleatorio(int m[][]) { // -----------------RELLENAR

		for (int j = 0; j < m.length; j++) {
			for (int k = 0; k < m[j].length; k++) {
				m[j][k] = alea(0, 10);
			}
		}
	}

	public static void imprimir(int m[][]) { // ----------------IMPRIMIR

		for (int j = 0; j < m.length; j++) {
			for (int k = 0; k < m[j].length; k++) {
				System.out.printf("%4d", m[j][k]);
			}
			System.out.println(); // --------------el salto de linea va al terminar el primer bucle for y haber
									// rellenado la primera fila (0,1,2,3,4)
		}
	}

	public static void imprimirResultados(int m[][]) { // ----------------IMPRIMIR

		int suma = 0;// --------------------------- variable para sumar las filas
		int sumaColumnas[] = new int[m[0].length]; // variable para sumar las columnas(tiene la longitud de las filas)

		for (int j = 0; j < m.length; j++) {
			for (int k = 0; k < m[j].length; k++) {
				System.out.printf("%4d", m[j][k]);
				suma += m[j][k]; // -----------------------al terminar cada columna, se suma, la siguiente
									// columna, (EN LA MISMA FILA).
				sumaColumnas[k] += m[j][k]; // --------al terminar cada fila, se suma la columna, a la columna anterior.
			}

			System.out.printf("%5d ", suma);// -----imprimir suma de las filas
			System.out.println();
		}
		suma = 0;
		for (int i = 0; i < sumaColumnas.length; i++) {
			System.out.printf("%4d", sumaColumnas[i]);
			suma += sumaColumnas[i];
		}
		System.out.printf("%5d", suma);
	}

	public static void main(String[] args) {

		int matriz[][] = new int[4][5]; // ------------- DECLARAR
		rellenaraleatorio(matriz);
		imprimirResultados(matriz);

	}

}
