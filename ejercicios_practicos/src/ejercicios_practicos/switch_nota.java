package ejercicios_practicos;
// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
import java.util.Scanner;

public class switch_nota {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("dime una nota");
		int nota = sc.nextInt();
		
		
		if(nota < 0 || nota > 10) {
			System.out.println("La nota es entre 0 y 10");
		}else {
			
			switch (nota) {
		
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;
		case 5:
			System.out.println("APROBADO");
			break;
		case 6:
		case 7:
			System.out.println("BIEN");
			break;
		case 8:
		case 9:
			System.out.println("NOTABLE");
			break;
		case 10:
			System.out.println("SOBRESALIENTE");
			break;
		}
	}
}

}
