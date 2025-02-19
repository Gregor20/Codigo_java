package ejercicios_practicos;

public class prueba {

	public static void main(String[] args) {
		
		int num=5;
		
		for (int i=1; i<=5; i++) { 
			for (int j=1; j<=2; j++) {
				System.out.printf("%4d",num*i);
			}
			System.out.println(" ");
		}

	}

}
// i= 1       // i=1
// j= 1       // j=2
// (5*1)=5    // (5*1)=5
// (5*2)=10   // (5*2)=10
// (5*3)=15   // (5*3)=15
// (5*4)=20   // (5*4)=20
// (5*5)=25   // (5*5)=25