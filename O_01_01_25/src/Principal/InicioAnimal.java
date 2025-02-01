package Principal;

import java.util.ArrayList;

import Poo.Animal;
import Poo.Gato;
import Poo.Perro;

public class InicioAnimal {

	public static void main(String[] args) {
		
		Perro p1 = new Perro("Spyke","Dobberman");
		Gato g1 = new Gato("Michi", "Gris");
		Animal a1 = new Animal("Animalejo");
		Perro p2 = new Perro("Robby", "Bully");
		Gato g2 = new Gato("Lusik", "Blanco");
		/*
		System.out.println(a1);
		System.out.println(p1);
		System.out.println(g1);
		
		a1.hacerSonido();
		p1.hacerSonido();
		g1.hacerSonido();*/
		
		ArrayList <Animal> Animales = new ArrayList<Animal>();
		Animales.add(g1);
		Animales.add(p1);
		Animales.add(a1);
		Animales.add(g2);
		Animales.add(p2);
		
		
		for (Animal animals : Animales) {
			animals.hacerSonido();
		}
		
	}

}
