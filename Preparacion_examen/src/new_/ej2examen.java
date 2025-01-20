package new_;

import java.util.Scanner;

public class ej2examen {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ve introduciendo numeros:");
		int suma=0;
		int cantidad=0;
		for(int i=0; i<500; i++) {
			int numero = Integer.valueOf(sc.nextLine());
			suma+=numero;
			cantidad++;
			if(suma>500) {
				suma-=numero;
				cantidad--;
				break;
			}
			
		}
		System.out.printf("Suma=%3d Total numeros=%d Media=%.2f",suma,cantidad,(double)suma/cantidad);
		

	}

}
