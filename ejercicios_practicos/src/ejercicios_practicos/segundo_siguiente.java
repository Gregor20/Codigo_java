package ejercicios_practicos;
// Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente

import java.util.Scanner;

public class segundo_siguiente {
	static Scanner sc= new Scanner (System.in);
	
	public static double HorasaSegundos (double x) {
		double segs = (x*60)*60;
		return segs;
	}
	public static double MinutosaSegundos (double x) {
		double segs = x*60;
		return segs;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("dime la hora");
		double horas= sc.nextDouble();
		System.out.println("dime los minutos");
		double minutos= sc.nextDouble();
		System.out.println("dime los segundos");
		double segundos= sc.nextDouble();
		
		//System.out.println(HorasaSegundos(horas)+MinutosaSegundos(minutos)+ segundos + 1);
		
		segundos ++;
		
		if (horas >= 24) {
			horas = 0;
		}
		if (minutos >= 60) {
			minutos = 0;
		}
		if (segundos >= 60) {
			segundos = 0;
		}
		
		System.out.println((int)horas + ":"+ (int)minutos+ ":"+(int)segundos );
	
	}

}
