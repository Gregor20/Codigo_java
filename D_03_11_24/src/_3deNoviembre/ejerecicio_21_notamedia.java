package _3deNoviembre;

import java.util.Scanner;

public class ejerecicio_21_notamedia {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		double nota_1;
		double nota_2;
		
		System.out.println("Dime la nota del primer examen");
		nota_1=sc.nextDouble();
		System.out.println("Dime la nota del segundo examen");
		nota_2=sc.nextDouble();
		
		double nota_media=(nota_1+nota_2)/2;
		
		
		if (nota_media>=5) {
			System.out.println("Muy bien, has aprobado. Tu nota media es: "+ nota_media);
		} else { 
			System.out.println("¿Cual ha sido el resultado de la recuperación? (apto/no apto) ");
			String resultadorecuperacion=sc.next();
			
		if (resultadorecuperacion.equalsIgnoreCase("apto")) {
			System.out.println("Tu nota media es de 5");
			}else {
					System.out.printf( "Tu nota media es: %.2f", nota_media);
			
			}
		}
		
		

	}

}
