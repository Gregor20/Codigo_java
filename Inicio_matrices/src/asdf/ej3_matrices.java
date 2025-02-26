package asdf;

import java.util.*;

public class ej3_matrices {

	static Scanner sc = new Scanner(System.in);

	public static int aleatorio(int li, int ls) { //-----------------------METODO ALEATORIO

		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void maximominimo(int m[][]) { //---------------------METODO MAXIMO Y MINIMO

		int maximo = -1, minimo = 1050;
		int imaximo = 0, iminimo = 0;
		int jmaximo = 0, jminimo = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] > maximo) {
					maximo = m[i][j];
					imaximo = i;
					jmaximo = j;
				}
				if (m[i][j] < minimo) {
					minimo = m[i][j];
					iminimo = i;
					jminimo = j;
				}
			}
		}
		System.out.printf("Posición:[%d][%d]-->Número máximo=%d\n", imaximo, jmaximo, maximo);
		System.out.printf("Posición:[%d][%d]-->Número mínimo=%d", iminimo, jminimo, minimo);
	}

	public static void rellenar(int m[][]) { //--------------------------------METODO RELLENAR

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = aleatorio(0, 1000);
			}
		}
	}

	public static void imprimir(int m[][]) { //-------------------------------METODO IMPRIMIR

		for (int i = 0; i < m.length; i++) {
for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%d  ", m[i][j]);
			}
				System.out.println();
		}
	}

	public static void main(String[] args) { //-----------------------------METODO MAIN

		int matriz[][] = new int[6][10];
		rellenar(matriz);
		imprimir(matriz);
		maximominimo(matriz);

	}

}
