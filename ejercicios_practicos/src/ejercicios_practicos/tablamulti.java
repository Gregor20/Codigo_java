package ejercicios_practicos;

public class tablamulti {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" tabla del %d "+"   " , i);
		}
		System.out.println();
		for(int tabla=1; tabla<=10; tabla++) {
			for(int i=1; i<=10; i++) {	
				System.out.printf("%2d x %2d = %2d    ", i,tabla, tabla*i);
			}
				System.out.println();
		}

	}

}
