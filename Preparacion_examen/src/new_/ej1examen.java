package new_;

public class ej1examen {
	//Muestre por pantalla todos los números primos entre el 10 y el 50, ambos incluidos.
	
	public static boolean primo(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		
		for(int i=10; i<=50; i++) {
			if(primo(i)) System.out.println(i);
		}
	}

}
