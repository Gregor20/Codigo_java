package principal;

import java.util.Scanner;

public class nuevoejscanner {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("dime la hora(0-24)");
		
		int hora=sc.nextInt();
		
		if (hora>=6&&hora<=12) {
			System.out.println(" Buenos dias ");
		}else if(hora>12&&hora<=20) {
			System.out.println(" Buenas tardes ");
		}else if(hora>20&&hora<=24) {
			System.out.println(" Buenas noches ");
		}
	     else if(hora>0&&hora<6) {
		System.out.println(" Buenas noches ");
	}

	}

}
