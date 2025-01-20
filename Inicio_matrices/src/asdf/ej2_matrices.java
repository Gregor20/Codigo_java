package asdf;

import java.util.*;

public class ej2_matrices {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void rellenar(int m[][]) {  //-----------------RELLENAR
		
		for (int j = 0; j < m.length; j++) {
			for (int k = 0; k < m[j].length; k++) {
				System.out.printf("[%d][%d]",j,k);
				m[j][k] = Integer.valueOf(sc.nextLine());
			}

		}
	}
	public static void imprimir(int m[][]) {  //----------------IMPRIMIR
		
		for (int j = 0; j < m.length; j++) {
			for( int k=0; k<m[j].length; k++) {
				System.out.printf("%3d",m[j][k]);
			}
			System.out.println(); // --------------el salto de linea va al terminar el primer bucle for y haber rellenado la primera fila (0,1,2,3,4)
		}
		
	}
	

	public static void main(String[] args) {

		int matriz[][] = new int[4][5]; //------------- DECLARAR
		rellenar(matriz);
		imprimir(matriz);

		
		

	}

}
