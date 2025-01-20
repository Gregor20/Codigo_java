package _apartirdel_8_Noviembre;

import java.util.Scanner;

public class _publicstaticvoid {
	static Scanner sc=new Scanner(System.in);
	
	/*************************************************************/
		public static void haciaabajo(int n) {          //----------- He creado un metodo que indica el como hacer una piramide con la punta hacia arriba
		for (int i=n; i>=1; i--) {
			System.out.println(" ".repeat(n-i) + "0".repeat(2*i-1));
			}
		}
	/*************************************************************/
		public static void haciaarriba(int n) {
			System.out.println("dime ");
			for (int i=1; i<=n; i++) {
				System.out.println(" ".repeat(n-i) + "0".repeat(2*i-1));
		}
			}
		/*************************************************************/
		public static void haciaderecha(int n) {
			for (int i=1; i<=n; i++)System.out.println("0".repeat(i));
			for (int i=4; i>=1; i--)System.out.println("0".repeat(i));
		}
		/*************************************************************/
		public static void haciaizq(int n) {
			for (int i=1; i<=n; i++)System.out.println(" ".repeat(n-i)+"0".repeat(i));
			for (int i=4; i>=1; i--)System.out.println(" ".repeat(n-i)+"0".repeat(i));
		}
		
		
		
		/*************************************************************/	
		
		
		public static void main(String[] args) {
			
			 haciaizq(5);    
			haciaderecha(5);                            //---------------- Utilizo el metodo para imprimir la piramide las veces q quiera
			haciaarriba(5);
			haciaabajo(8);
		}
		
		
		

	}


