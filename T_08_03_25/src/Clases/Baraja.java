package Clases;

import Biblioteca.General;

public class Baraja {
	private Carta cartas[]; // ARRAY PARA TODAS LAS CARTAS
	private int siguienteCarta; // CONOCER LA SIGUIENTE CARTA

public Baraja(){
	cartas=new Carta[40];
	siguienteCarta=0;
	
	crearBaraja();
	barajar();
}
public void crearBaraja() {
	int contador=0;
	for(Palos p: Palos.values()) {
		for(Numeracion n: Numeracion.values()) {
			cartas[contador++] = new Carta (n,p);
		}
	}
}
private void barajar() {
	int n1, n2;
	Carta aux;
	for(int i = 0; i<1000; i++) {
		do {
		n1=General.alea(0, 39);
		n2=General.alea(0, 39);
	}while(n1==n2);
		aux=cartas[n1];
		cartas[n1]=cartas[n2];
		cartas[n2]=aux;
	}
}

public Carta siguienteCarta() {
	if(siguienteCarta==cartas.length) {
		System.out.println("no hay mas cartas");
		return null;
	}
		return cartas[siguienteCarta++];	
}

public int cartasDisponibles() { return cartas.length-siguienteCarta;}

public Carta[] darCartas(int n) {
	if(n>cartasDisponibles()) {
		System.out.println("no tengo suficientes cartas");
		return null;
	}
	Carta matriz[]=new Carta[n];
	for (int i = 0; i < matriz.length; i++) {
		matriz[i]=siguienteCarta();	
	}
	return matriz;
}
}