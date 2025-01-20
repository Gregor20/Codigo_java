package asdf;

public class nuevo_ej {

	public static void main(String[] args) {

		int matriz[][] = new int[4][5]; //------------DECLARAR
		
		
		for (int i = 0; i < matriz.length; i++) { //-----------RECORRER FILAS
			
			int suma=0;
			
			for (int k = 0; k < matriz[i].length; k++) {//-----------RECORRER COLUMNAS

				matriz[i][k] = (int)(Math.random()*10)+1;//--------------------RELLENAR
				
				suma += matriz[i][k];

			}
			System.out.print("FILA "+i+"---->> ");
			for (int k = 0; k < matriz[i].length; k++) {
				System.out.print(matriz[i][k]+" ");
			}
			System.out.println("suma = "+ suma);
		}

	}

}
