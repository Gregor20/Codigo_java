package Principal;

import java.util.ArrayList;
import clases.*;

import clases.FigurasGeometricas;

public class Inicio {
	
	public static void imprimir(ArrayList<FigurasGeometricas>li) {
		for(FigurasGeometricas item : li) {
			System.out.println(item +" "+ item.perimetro()+" "+item.area());
				
		}
	}

	public static void main(String[] args) {
		
		ArrayList<FigurasGeometricas> lista = new ArrayList<>();
		lista.add(new Cuadrado(10));
		lista.add(new Rectangulo(33,10));
	
	
		imprimir(lista);
	}
}
