package ejercicios_practicos;
//Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
//alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
import java.util.Scanner;
public class alturas {
static Scanner sc = new Scanner (System.in);

public static double alea (double li, double ls) {
	return (Math.random() * (ls - li + 1)) + li;
}

	public static void main(String[] args) {
		int sumEdad=0, totalEdades=0; 
		double sumAlturas=0, totalAlturas=0;
		
		int matriz[] = new int [5];
		double matriz2[] = new double [5];
		
		
		for(int i = 0; i<matriz.length; i++) {
			matriz[i]=(int)alea(18,30);
			
			if (matriz[i] == 26) {
		        throw new IllegalArgumentException("26 años, ya es un cuarto de tu supuesta vida");
		    }
			
				totalEdades++;
				sumEdad += matriz[i];
			matriz2[i]=alea((1.5),(1));
				totalAlturas++;
				sumAlturas += matriz2[i];
			
			System.out.printf("Edad alumno %d: %d años / " ,i, matriz[i]);
			System.out.printf("Altura alumno %d: %.2f cm",i,matriz2[i]);
			System.out.println();			
			
		}
		System.out.printf("\nEdad media: %d años\nAltura media: %.2fcm",sumEdad/totalEdades,sumAlturas/totalAlturas);

	}

}
