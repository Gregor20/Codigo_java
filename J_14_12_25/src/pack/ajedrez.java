package pack;
import java.util.Scanner;
public class ajedrez {
	static Scanner sc=new Scanner(System.in);
	
	public static void posicion(String m[][]) {
		
		
		System.out.println("dime la posicion");
		String posicion=String.valueOf(sc.nextLine());
		
	}
	
	public static void rellenar(String m[][]) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j]="[ ]";
			}
		}
	}
	public static void imprimir(String m[][]) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]);
			}System.out.println();
		}
	}
	

	public static void main(String[] args) {
		String array[][]=new String[8][8];
		
		rellenar(array);
		imprimir(array);

	}

}
