package ejercicios_practicos;

import java.util.Scanner;

public class adivina_num_aleatorio {
	static Scanner sc= new Scanner (System.in);
	
	public static int alea (int li, int ls) {
		
		return (int) (Math.random() *  (ls-li+1)) +li ;
		
	}
	
	public static void main(String[] args) {
		
		int x = alea(0,100);
		
		System.out.println("Adivina el número");
		int j = 0;
		
		while (x != j) {
			j = sc.nextInt();
			if(x > j) {
				System.out.println("MAYOR");
			}else if (x < j) {
				System.out.println("MENOR");
			}else {
				System.out.println("HAS ACERTADO");
			}
		}
		
		

	}

}
