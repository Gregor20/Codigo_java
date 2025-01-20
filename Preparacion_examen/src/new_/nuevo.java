package new_;
import java.util.Scanner;
public class nuevo {
	
	static Scanner sc=new Scanner(System.in);
	 
	public static int alea(int min, int max) {
	        return (int) (Math.random() * (max - min + 1)) + min;
	    }
	 
	 public static void rellenar(int m[]) {
		 for(int i=0; i<m.length;i++) {
			 m[i]=alea(0,100);
		 }
		 
	 }
	 public static void imprimir(int m[]) {
		 System.out.println();
		 for(int i=0; i<m.length;i++) {
			 System.out.printf("%4d",m[i]);
		 }
		 
	 }

	public static void main(String[] args) {
	        System.out.println("Número aleatorio n: ");
	        int n=Integer.valueOf(sc.nextLine());
	        		int tb[]=new int [n];
	        		rellenar(tb);
	        		imprimir(tb);
	        		

	        
	        

	        
	    }

	   
	}