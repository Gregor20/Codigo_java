package ejercicios_practicos;

import java.util.Scanner;

public class circulo_calcula_longitud {
static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		double r;
		
		System.out.println("dime el radio de la circunferencia(cm)");
		r=sc.nextInt();
		
		double longitud =  2*Math.PI*r;
		System.out.printf("La longitud de la circunferencia con radio %.2f(cm) es de %.2f(cm)", r,longitud);

	}

}
