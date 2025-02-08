package ejercicios_practicos;
// Pedir tres números y mostrarlos ordenados de mayor a menor.
import java.util.Scanner;

public class cual_es_mayor_de_tres {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("dime el primer numero");
		int n1=sc.nextInt();
		System.out.println("dime el segundo numero");
		int n2=sc.nextInt();
		System.out.println("dime el tercer numero");
		int n3=sc.nextInt();
		
		if(n1 != n2 && n1 != n3 && n2 != n3) {
		
		
		if(n1>n2 && n1>n3) {
			if(n2>n3) {
				System.out.printf("ordenados de mayor a menor: %d, %d, %d",n1,n2,n3);
			}else if (n3>n2) System.out.printf("ordenados de mayor a menor: %d, %d, %d",n1,n3,n2);
			
		}else if (n2>n1 && n2>n3) {
			if(n1>n3) {
				System.out.printf("ordenados de mayor a menor: %d, %d, %d",n2,n1,n3);
			}else if(n3>n1)System.out.printf("ordenados de mayor a menor: %d, %d, %d",n2,n3,n1);
			
		}else if (n3>n1 && n3>n2) {
			if(n1>n2) {
				System.out.printf("ordenados de mayor a menor: %d, %d, %d",n3,n1,n2);
			}else if (n2>n1)System.out.printf("ordenados de mayor a menor: %d, %d, %d",n3,n2,n1);
		
		}
		}
		else {
			System.out.println("son numeros iguales");
		}
		
	}

}
