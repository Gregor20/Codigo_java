package asdf;

public class eje_matrices_internet {
	
	public static boolean esprimo(int m){
		
		if(m<=1)return false;
		for(int i=2; i<m; i++) {
			if (m%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		int matriz[][] = new int[4][4]; // ------------------------------DECLARAR
		double media = 0;
		int suma = 0, total = 0, mayor = -1, menor = 110, ttmayor = 0, ttmenor = 0;
		int primos=0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = (int) (Math.random() * 100) + 1; // --------------RELLENAR
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%2d ", matriz[i][j]); // --------------IMPRIMIR
				suma += matriz[i][j];
				total++;
				media = suma / total;
				
				if (matriz[i][j] > mayor) {
					mayor = matriz[i][j];
				} else if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
				if(esprimo(matriz[i][j])) {
					primos++;
					System.out.printf("%d=primo  ",matriz[i][j]);
					
				}
				
			}	System.out.println();
		}	
			

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == mayor) {
					ttmayor++;
				} else if (matriz[i][j] == menor) {
					ttmenor++;
				}
			}
		}

		System.out.printf("La suma es = %d\n", suma);
		System.out.printf("La media es = %.2f\n", media);
		System.out.printf("El nº mayor es = %d y se repite %d veces\n", mayor, ttmayor);
		System.out.printf("El nº menor es = %d y se repite %d veces\n", menor, ttmenor);
		System.out.printf("Hay %d numeros primos \n", primos);
	}

}
