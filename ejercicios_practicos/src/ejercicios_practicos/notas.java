package ejercicios_practicos;

// Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
import java.util.Scanner;

public class notas {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		// SE PUEDE HACER CON UN ARRAY
		
		String [] np = {"CERO","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ"};
		
		System.out.println("dime tu nota (del 0 al 10)");
		int nota = sc.nextInt();
		
		if (nota >= 0 && nota <= 10) {
			System.out.println(np[nota]);
		}else {
			System.out.println("tu nota tiene que estar entre 0 y 10");
		}
		
		//SE PUEDE HACER CON SWITCH
		
		/*switch (nota) {
		
		case 1:
			System.out.println("UNO");break;
		case 2:
			System.out.println("DOS");break;
		case 3:
			System.out.println("TRES");break;
		case 4:
			System.out.println("CUATRO");break;
		case 5:
			System.out.println("CINCO");break;
		case 6:
			System.out.println("SEIS");break;
		case 7:
			System.out.println("SIETE");break;
		case 8:
			System.out.println("OCHO");break;
		case 9:
			System.out.println("NUEVE");break;
		case 10:
			System.out.println("DIEZ");break;
		}
		*/

	}

}
