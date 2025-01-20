package pack;

import java.util.ArrayList;

public class intento_arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(100); 
		lista.add(200); //-------PARA AÑADIR ELEMENTOS AL CONJUNTO/LISTA
		lista.add(300);
		lista.add(400);
		lista.add(500);
		//System.out.println(lista.get(2));
		
		
		for (int i = 0; i < lista.size(); i++) { //-------LISTA.SIZE == LISTA.LENGTH
			System.out.println(lista.get(i)); //--------------------------LISTA.GET ES PARA DARTE EL QUE ELIGAS
		}
		
		lista.set(2, 1998); //-------------CON LISTA.SET INTERCAMBIAS UN ELEMENTO POR OTRO
		
		System.out.println();
		for(Integer elementos : lista) {
			System.out.println(elementos);
		}
		
	}

}
