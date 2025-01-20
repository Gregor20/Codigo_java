package pack;
import java.util.Scanner;
public class array_diagonal {
	static Scanner sc=new Scanner(System.in);
	
	public static int alea(int nm, int m) {
		return (int) (Math.random() * (m - nm + 1) + nm);
	}

	public static void rellenar(int m[][]) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j]=alea(10,20);
			}
		}
	}

	public static void imprimir(int m[][]) {
		int contador=m.length+1;
		
		System.out.print("   ");
		for(char c='a'; c<'a'+m[0].length; c++) {
			System.out.printf("%4c",c);
		}System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			contador--;
			System.out.printf("*%d*",contador);
			for (int j = 0; j < m[i].length; j++) {
			System.out.printf("%4d", m[i][j]);
		}System.out.println();
	}System.out.println();
}
	
	public static void pide_posicion(int m[][]) {
		int posicion;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				posicion=Integer.valueOf(sc.nextLine());
			}
	}
}
	public static void diagonalprincipal(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%3d ",m[i][i]);
			}
		System.out.println();
	}
	public static void diagonalinversa(int m[][]) {
		int c=m[0].length-1;
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%3d ",m[i][(c-i)]);
		}
		System.out.println();
	}
	
	
		
	public static void main(String[] args) {
		//int arraysize = alea(0, 10);
		//System.out.println("vector de " + arraysize + " posiciones:\n");
		int n=8;
		int tb[][] = new int[n][n];
		rellenar(tb);
		imprimir(tb);
		
		
		diagonalprincipal(tb);
		diagonalinversa(tb);
		
		
	}
}
