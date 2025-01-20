package Clases;

import java.util.ArrayList;

public class Familia {
	
	private Persona Padre;
	private Persona Madre;
	private ArrayList<Persona> Hijos=new ArrayList<Persona>();
	
	public Familia(Persona padre, Persona madre) {
		Padre = padre;
		Madre = madre;
	}

	public Familia(Persona padre, Persona madre, ArrayList<Persona> hijos) {
		Padre = padre;
		Madre = madre;
		Hijos = hijos;
	}

	public Persona getPadre() {
		return Padre;
	}

	public void setPadre(Persona padre) {
		Padre = padre;
	}

	public Persona getMadre() {
		return Madre;
	}

	public void setMadre(Persona madre) {
		Madre = madre;
	}
	
	public ArrayList<Persona> ObtenerHijos(){
		return Hijos;
	}
	public void AñadirHijo (Persona p) {
		Hijos.add(p);
	}

	@Override
	public String toString() {
		String cadena="Padre="+Padre+"\n"+"Madre="+Madre;
		cadena += "\n";
		
		for(Persona a:Hijos) {
			
			cadena+=a+"\n";
			
		}
		return cadena;
	}
	
	
	
}
