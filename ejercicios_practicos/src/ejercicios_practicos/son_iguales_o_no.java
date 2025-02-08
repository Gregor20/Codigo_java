package ejercicios_practicos;

import java.util.Scanner;
//Pedir dos números y decir si son iguales o no.
public class son_iguales_o_no {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("dime el primer numero");
		int n1=sc.nextInt();
		System.out.println("dime el segundo numero");
		int n2=sc.nextInt();
		
		if (n1==n2) {
			System.out.println("los numeros son iguales"); 
		}else {
			System.out.println("los numeros son distintos");
		}
	}

}
