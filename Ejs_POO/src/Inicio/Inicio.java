package Inicio;

import Clases.Persona;

public class Inicio {

	public static void main(String[] args) {
		
		
		Persona p3 = new Persona();
		Persona p1= new Persona("Grisha", 26, 'h');
		Persona p2=new Persona("Juan", 23, "654456765K",'h', 56.7, 1.59);
		Persona p4 =new Persona ("Maria", 30,'m', 56.5, 1.62);
		Persona p5 =new Persona ("Benito", 46, 'h');
		
		System.out.printf("PESO_IDEAL = -1 \nPESO_BAJO = 0\nPESO_ALTO = 1\n\n");
		
		
		p2.setNombre("Pepito");
		System.out.println(p2);
		System.out.println(p2.getImc());
		
		System.out.println(p4);
		System.out.printf("IMC = %.0f\n",p4.getImc());
		
		//System.out.printf("Nombre:%s Edad:%d Sexo:%c\n IMC= %.0f\n",p5.getNombre(),p5.getEdad(),p5.getSexo(),p5.getImc());
		p1.setSexo('g');
		System.out.println(p1);
		
		

	}

}
