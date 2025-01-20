package pack;
import java.util.*;
public class ej_hashmap {
	static Scanner sc=new Scanner(System.in);
	
	public static void imprimir(HashMap<String,String> di) {

		for (int i = 0; i < di.size(); i++) {
			System.out.println(i + " " + di.get(i));
		}
	}

	public static void main(String[] args) {
		String palabra,respuesta,word;
		HashMap<String,String> diccionario=new HashMap<String,String>();
		
		
		do {
			System.out.println("palabras en castellano");
			palabra=sc.nextLine();
			if(diccionario.containsKey(palabra)) {
				System.out.println(diccionario.get(palabra));
			}else {
				System.out.println("dime la tradccion en ingles");
				word=sc.nextLine();
				diccionario.put(palabra, word);
			}
			System.out.println("quieres añadri mas palabras?");
			respuesta=sc.nextLine();
		}while(!respuesta.equals("no"));
		
		
			imprimir(diccionario);
			
			
		

	}

}
