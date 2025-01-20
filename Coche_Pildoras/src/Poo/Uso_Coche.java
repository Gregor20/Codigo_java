package Poo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche Renault = new Coche(); // --- INSTANCIAR UNA CLASE / EJEMPLAR DE CLASE.
		
		//Renault.motor=1200;----> ESTO NO SE PUEDE VARIAR PORQUE ESTA EN PRIVATE
		
		System.out.println(Renault.dime_largo());
		
		//System.out.println("El coche tiene un motor "+Renault.motor);

	}

}
