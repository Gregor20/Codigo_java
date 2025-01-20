package new_;
import java.util.Scanner;
//Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe de dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
public class ej5_bucles_examen {
static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Dime un numero");
		String numero=sc.nextLine();
		System.out.println("Dime un digito");
		int digito=sc.nextInt();
		
		if(digito<0 || digito>9)System.out.println("Dime un digito entre 0 y 9");
		
		String dig=String.valueOf(digito);
		boolean encontrado = false;
		
		for(int i=0; i<numero.length(); i++) {
			if(numero.charAt(i)==dig.charAt(0)) {
				System.out.printf("El digito %s ocupa la posicion %d\n",dig,(i+1));
				encontrado=true;
			}
		}
		if(!encontrado)System.out.println("No encuentro el dígito");
	}

}
