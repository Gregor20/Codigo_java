package pack;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

	static Scanner sc = new Scanner(System.in);

	public static void imprimir(ArrayList<String> di) {

		for (int i = 0; i < di.size(); i++) {
			System.out.println(i + " " + di.get(i));
		}
	}

	public static void main(String[] args) {
		String cadena;
		ArrayList<String> diccionario = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {

			while (true) {
				System.out.println("indique la plabara");
				cadena = sc.nextLine();
				if (!diccionario.contains(cadena)) {
					diccionario.add(cadena);
					break;
				}else {System.out.println("esta palabra ya existe");}
			}

		}
		imprimir(diccionario);
		diccionario.remove(0);
		System.out.println();
		diccionario.remove("blanco");
		imprimir(diccionario);
	}

}
