package _5deNoviembre;

import java.util.Scanner;

public class ejercicio17 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("dime un numero");
		int numero=Integer.valueOf(sc.nextLine());
		
		 if(numero<0) {System.out.println("dime un numero mayor que 0");
		 
		 }else {
			for(int i=1; i<=100; i++) 
				System.out.printf("%d %d\n",i, numero+i);
		 }
	}
}	
		

	


