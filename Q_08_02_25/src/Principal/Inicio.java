package Principal;

import clases.CuentaAhorro;

public class Inicio {

	public static void main(String[] args) {
		
		CuentaAhorro ca1 = new CuentaAhorro("Jose", "001", 4000, 3, 21);
		
		ca1.ingreso(300);
		
		ca1.reintegro(300);
		
		System.out.println(ca1);
		
		

	}

}
