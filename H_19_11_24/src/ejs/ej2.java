package ejs;

import java.util.Scanner;

public class ej2 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Dime un numero");
		int numero=Integer.valueOf(sc.nextLine());
			
	
		for(int i=1; i<=10; i++)
				System.out.printf("%d * %d = %d\n",i,numero,i*numero);
		
	}

}
