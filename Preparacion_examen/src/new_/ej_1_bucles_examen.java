package new_;

public class ej_1_bucles_examen {
	
	public static boolean esprimo(int m) {
		if(m<2) return false;
		
		for(int i=2; i<m; i++) {
			if(m%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Numeros primos entre 10 y 50:");
		for(int i=10; i<=50; i++) {
			if(esprimo(i)) {
				System.out.printf("%3d",i);
			}
		}
		
	}
}
