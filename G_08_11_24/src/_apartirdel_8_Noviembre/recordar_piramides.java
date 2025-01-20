package _apartirdel_8_Noviembre;

import java.util.Scanner;

public class recordar_piramides {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++)
			System.out.println(" ".repeat(5 - i) + "0".repeat((2 * i) - 1));

	}

}
