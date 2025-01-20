package fechas;
import java.util.Scanner;
public class enero_06_01_2025 {
	//un numero primo es aquel que se puede dividir entre el mismo y 1
static Scanner sc=new Scanner (System.in);

	public static boolean esprimo (int numero) {
		
		for(int i=2; i<numero; i++) {
			if(numero<=1) 
				return false;
			if(numero%i==0) 
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(esprimo(i)) {
				System.out.println(i);
			}
		}
		
		
	}

}
