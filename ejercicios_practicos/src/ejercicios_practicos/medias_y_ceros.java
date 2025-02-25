package ejercicios_practicos;
// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
// Realizado con matriz
import java.util.Scanner;

public class medias_y_ceros {
static Scanner sc = new Scanner (System.in);

	public static int alea (int li, int ls) {
		return (int)(Math.random() * (ls - li + 1)) + li;
	}

	public static void main(String[] args) {
	
		int matriz []= new int [10];
		int positivos=0,negativos=0,ceros=0;
		int sumpos=0, sumneg=0;
		
			for (int i = 0; i < matriz.length; i++) {
				matriz [i] = alea(-10, 10);
					if(matriz[i] > 0) {
						positivos++;
						sumpos += matriz[i];
					}else if(matriz[i] < 0) {
						negativos++;
						sumneg += matriz[i];
					}else {
						ceros++;
					}
			}
			
			System.out.print("Diez números aleatorios entre el -10 y el 10----> ");
			for (int item : matriz) {
				System.out.print(item + "  ");
			}
			System.out.println();
			System.out.printf("Media de positivos: %.2f\nMedia de negativos: %.2f\nTotal de ceros: %d",(double)sumpos/positivos,(double)sumneg/negativos,ceros);
	
	}

}
