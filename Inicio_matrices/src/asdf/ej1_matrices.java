package asdf;

public class ej1_matrices {

	public static void imprimir(int n[][]) {  // se crea el metodo "imprimir" 

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("%3d", n[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int num[][] = new int[3][6]; // -------------DECLARAR

		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;

		num[1][0] = 75;
		num[1][4] = 0;

		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		imprimir(num);

		/*
		 * //---------------------------RELLENAR
		 * 
		 * for(int i=0; i<3; i++) { System.out.println(); for (int j=0; j<6; j++) {
		 * //-------------RECORRER
		 * 
		 * if ((i==0 && j==0)||(i==1 && j==4)){
		 * 
		 * System.out.print(num[i][j]+" ");
		 * 
		 * }else if (num[i][j]==0) {
		 * 
		 * System.out.print(" ");
		 * 
		 * }else { System.out.print(num[i][j]+" "); }
		 * 
		 * //-------------------IMPRIMIR
		 * 
		 * }
		 * 
		 * }
		 * 
		 */
	}

}
