package Principal2;

import Principal1.Persona;

public class Inicio1 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		System.out.println(p1);
		Persona p2 =new Persona("Grisha","Kobyliakov","50903115K",26,'s',82,182);
		System.out.println(p2);
		p2.setSexo('h');
		System.out.println(p2);

	}

}
