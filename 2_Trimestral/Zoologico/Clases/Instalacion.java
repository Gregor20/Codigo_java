package Clases;

import java.util.ArrayList;

public class Instalacion {
	private Zona zona;
	private int codigo_jaula;
	private int año_instalacion;
	private String descripcion;
	private ArrayList<Integer> listaCodigos=new ArrayList<>();

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
			temp = alea();                          //asignará numeros aleaotrios DEL 1 AL 10 hasta que listaCodigos no contenga el numero temp
		} while (listaCodigos.contains(temp));
		listaCodigos.add(temp);                     // cuando no este en listaCodigos, se añade a la lista
		this.codigo_jaula = temp;                   // el codigo de la jaula es IGUAL AL  numero que no esta en la listaCodigos
		return this.codigo_jaula;                   //devuelve el codigo
	}

	public int getCodigo_jaula() {
		return codigo_jaula;
	}
	public void setCodigo_jaula(int codigo) {
		this.codigo_jaula = codigo;
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
