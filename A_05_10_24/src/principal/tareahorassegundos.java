package principal;

import java.util.Scanner;

public class tareahorassegundos {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		//----Escribe un programa que dada una hora determinada (horas y minutos) calcule los segundos que faltan para llegar a la medianoche.
		
		
		System.out.println("dime las horas");
		int horas=sc.nextInt();
		System.out.println("dime los minutos");
		int minutos=sc.nextInt();
		
		int horasasegundos=horas *60*60;
		int minutosasegundos=minutos*60;
		
		int segundostranscurridos=horasasegundos + minutosasegundos;
		int segundosenundia=(24*60*60);
		
		
		
		int segundosrestanteshastamedianoche=(segundosenundia - segundostranscurridos);
		
		System.out.println("Faltan " + segundosrestanteshastamedianoche + " " + "segundos " + "para la media noche");
		
		System.out.println("\nFINAL");
		

	}

}
