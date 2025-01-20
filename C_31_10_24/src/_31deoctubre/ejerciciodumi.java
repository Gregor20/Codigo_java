package _31deoctubre;

public class ejerciciodumi {

	public static void main(String[] args) {
		
		int intentos=0;
		
		int num_adivinar=(int)((Math.random()*100)+1);
		
		int respuesta;
		System.out.println("Dime el numero correcto");
		respuesta=sc.nextInt();
		
		
		for( int i=0; intentos<=4 && !respuesta )
			System.out.println("Dime la clave correcta");
				respuesta=sc.nextInt();
		

	}

}
