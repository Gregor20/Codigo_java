package Clases;

import java.util.ArrayList;

public class Parking {

	// ATRIBUTOS
	private String nombre;
	private ArrayList<String> matriculas;

	// CONSTRUCTOR PRINCIPAL
	public Parking(String nombre, int nplazas) {
		super();
		this.nombre = nombre;
		this.matriculas = asignarNplazas(nplazas);
	}

	// METODO QUE ASIGNA CANTIDAD DE PLAZAS AL PARKING
	private ArrayList<String> asignarNplazas(int n) {
		ArrayList<String> plazas = new ArrayList<>(n);
		for (int i = 1; i <= n; i++) {
			plazas.add(null);
		}
		return plazas;
	}

	// DEVUELVE EL NOMBRE DEL PARKING
	public String getNombre() {
		return this.nombre;
	}

	// METODO QUE INTRODUCE UN COCHE CON MATRICULA EN UNA PLAZA
	public void entrada(String matricula, int plaza) throws ParkingException {

		
			if (matricula == null || matricula.length() < 4) {
				throw new ParkingException("Matricula incorrecta", matricula);
			}
			if (matriculas.get(plaza-1) != null) {
				throw new ParkingException("Plaza ocupada", matricula);
			}
			if (matriculas.contains(matricula)) {
				throw new ParkingException("La matricula esta repetida", matricula);
			}

			this.matriculas.set(plaza-1, matricula);
			System.out.println("Tu coche ha sido estacionado en la plaza " + plaza);

		
	}
	public int salida (String matricula) throws ParkingException {
	
		if(matriculas.contains(matricula) == false)
			throw new ParkingException("Matricula no existente", matricula);
		
		int plaza=matriculas.indexOf(matricula);
		
		matriculas.set(matriculas.indexOf(matricula), null);
		
		System.out.println("La plaza número " + plaza + " ha sido liberada");
		return plaza;
		
	}
	public int getPlazasTotales() {
		return matriculas.size();
	}
	public int getPlazasOcupadas() {
		int plazasOcupadas=0;
		for (String Ma : matriculas) {
			if(Ma != null) {
				plazasOcupadas++;
			}
		}
		return plazasOcupadas;
	}
	public int getPlazasLibres() {
		int plazasLibres=0;
		for (String Ma : matriculas) {
			if(Ma == null) {
				plazasLibres++;
			}
		}
		return plazasLibres;
	}
	public String imprimirParking() {
		String resultado = nombre + "\n"+"--------------\n";
		for (int i = 0; i < matriculas.size(); i++) {
			resultado += "Plaza " + (i+1) +" "+ (matriculas.get(i) == null ? "(vacía)"
					: matriculas.get(i))+"\n";
		}
		return resultado;
	}

	@Override
	public String toString() {
		return imprimirParking();
	}

}
