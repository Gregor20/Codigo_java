package ejercicios_practicos;
// Pedir dos números y decir si uno es múltiplo del otro
import java.util.Scanner;

public class si_es_multiplo_del_otro {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("dime el primer numero");
		int n1=sc.nextInt();
		System.out.println("dime el segundo numero");
		int n2=sc.nextInt();
		
		if(n1%n2==0) {
			System.out.printf("El numero %d y el numero %d, SI son multiplos",n1,n2);
		}else {
			System.out.println("NO son multiplos");
		}
		

	}

}
