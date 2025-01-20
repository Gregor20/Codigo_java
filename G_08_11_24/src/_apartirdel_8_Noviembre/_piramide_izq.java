package _apartirdel_8_Noviembre;

import java.util.Scanner;

public class _piramide_izq {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)System.out.println(" ".repeat(5-i)+"0".repeat(i));
		
		for(int i=4; i>=1; i--)System.out.println(" ".repeat(5-i)+"0".repeat(i));
		
		

	}

}
//    0
//   00
//  000 
// 0000
//00000
// 0000
//  000
//   00
//    0