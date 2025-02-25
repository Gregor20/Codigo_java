package ejercicios_practicos;
//Pedir un número y calcular su factorial. SE PUEDE HACER PIDIENDO EL NUMERO CON SC SCANNER
public class factorial {

	public static void main(String[] args) {
		
		int num = 12;
		
		for (int i = num; i > 0; i--) {
			System.out.printf("%d * %d = %2d\n",num,i,num * i);
		}

	}

}


