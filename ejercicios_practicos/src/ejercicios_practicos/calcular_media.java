package ejercicios_practicos;
// Pedir números hasta que se introduzca uno negativo, y calcular la media.

import java.util.Scanner;

public class calcular_media {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		int contador=0;
		
		System.out.println("dime numeros y calcularé la media");
		while (num >= 0) {
			num = sc.nextInt();
			if(num < 0) {
				System.out.println("Has introducido un número negativo, se termina el bucle");
				//contador--;//no es necesario que reste ya que está el break
				break;
			}
			sum += num;
			contador++;
			
				System.out.println("siguiente número: ");
		}
		if(contador > 0) {
			System.out.printf("La media es: %.2f ",(double)sum/contador);
		}else {
			System.out.println("No puedo calcular la media");
		}
	}

}
