package asdf;

import java.util.Random;

public class clase2311 {
	

	public static void main(String[] args) {
		
	
		int tabla[][]=new int [6][10];
		Random random=new Random();
		
		for(int i=0; i<=tabla.length; i++)
			for(int j=0; j<=tabla.length; j++) {
				
				tabla[6][10]=random.nextInt(100)+1;
				
			}
		for (int i = 0; i <= tabla.length; i++) 
			for (int j = 0; j <= tabla.length; j++) {
				
				System.out.print(tabla[i][j]+"\n");
				
			}
		
		
		

	}

}
