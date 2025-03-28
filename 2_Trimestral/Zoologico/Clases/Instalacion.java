package Clases;

import java.util.ArrayList;

public class Instalacion {
	private Zona zona;
	private int codigo_jaula;
	private int año_instalacion;
	private String descripcion;
	private ArrayList<Integer> listaCodigos=new ArrayList<>();
	
	//metodo alea
	private int alea() {
		return (int) (Math.random() * 10) + 1;
	}
	public Instalacion(Zona zona, String descripcion, int año_instalacion) {
		super();
		this.zona = zona;
		this.codigo_jaula = asignarNumero();
		this.año_instalacion = año_instalacion;
		this.descripcion = descripcion;
	}
	private int asignarNumero() {
		int temp;
		do {
			temp = alea();                          //asigna a temp un numero aleatorio del 1 al 10
		} while (listaCodigos.contains(temp));      //mientras que la lista contenga el numero de temp
		listaCodigos.add(temp);                     //se añade a la lista
		this.codigo_jaula = temp;                   //el codigo de la jaula es IGUAL AL  numero que no esta en la listaCodigos
		return this.codigo_jaula;                   //devuelve el codigo
	}
	public void setCodigo_jaula(int codigo_jaula) {
		this.codigo_jaula = codigo_jaula;
	}
	public int getCodigo_jaula() {
		return codigo_jaula;
	}
	public Zona getZona() {
		return zona;
	}
	@Override
	public String toString() {
		return "Código de jaula: " + codigo_jaula + ", " + "Año de instalacion: " + año_instalacion + ", "
				+ "Descripcion: " + descripcion +", " + "Zona: "+zona.getNombre();
	}

}
