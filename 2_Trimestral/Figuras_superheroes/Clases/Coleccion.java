package Clases;

import java.util.ArrayList;

public class Coleccion {
	//ATRIBUTOS
	private String nombreColeccion;
	private ArrayList<Figura>listaFiguras;
	
	//CONSTRUCTOR
	public Coleccion(String nombreColeccion) {
		super();
		this.nombreColeccion = nombreColeccion;
		this.listaFiguras=new ArrayList<>();
	}
	//GETTERS & SETTERS
	public String getNombreColeccion() {
		return nombreColeccion;
	}
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	
	//METODOS AÑADIR FIGURAS Y SUBIR PRECIO
	public void añadirFigura(Figura fig) {
		this.listaFiguras.add(fig);
	}
	public void subirPrecio(double cantidad, String id) {
		for (int i = 0; i < listaFiguras.size(); i++) {
			Figura f1 = listaFiguras.get(i);
			if(f1.getCodigo().equals(id)) {
				f1.setPrecio(cantidad);
			}
		}
		
	}
	//METODO PARA SABER LA FIGURA DE MAYOR PRECIO
	public Figura masValioso() {
		
		Figura masValiosa = listaFiguras.get(0);
		
		for (int i = 0; i < listaFiguras.size(); i++) {
			Figura f1 = listaFiguras.get(i);
			if(f1.getPrecio() > masValiosa.getPrecio()) {
				masValiosa = f1;
			}
		}return masValiosa;
	}
	//METODO PARA SABER EL VALOR TOTAL DE LA COLECCION
	public double getValorColeccion() {
		double total=0;
		for (int i = 0; i < listaFiguras.size(); i++) {
			Figura f1 = listaFiguras.get(i);
			total += f1.getPrecio();
		}return total;
	}
	//METODO PARA SABER EL VOLUMEN TOTAL DE LA COLECCION
	public double getVolumenColeccion() {
		double total=0;
		for (Figura fig : listaFiguras) {
			total += fig.getDm().getVolumen();
		}
		return total + 200;
		
	}
	
	//TO STRING CON CAPA
	public String conCapa() {
		String lista="";
		for (Figura figura : listaFiguras) {
			if(figura.getSh().isCapa()) {
				lista += figura.toString();
			}
		}
		return lista;
	}
	//TO STRING NORMAL
	@Override
	public String toString() {
		String lista="";
		for (Figura figs : listaFiguras) {
			lista += figs.toString();
		}
		System.out.println();
		return lista;		
	}
	
	
}
