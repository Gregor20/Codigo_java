package ejercicios_practicos;
// Pedir dos números y mostrarlos ordenados de mayor a menor
import java.util.Scanner;

public class cual_es_mayor {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("dime el primer numero");
		int n1=sc.nextInt();
		System.out.println("dime el segundo numero");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.printf("ordenados de mayor a menor: %d, %d",n1,n2);
		}else {
			System.out.printf("ordenados de mayor a menor: %d, %d",n2,n1);
		}
		

	}

}
