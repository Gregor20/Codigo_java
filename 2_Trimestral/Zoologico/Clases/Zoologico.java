package Clases;
import java.util.Scanner;
import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private ArrayList<Zona>zonas;
	private ArrayList<Instalacion>instalaciones;
	private ArrayList<Animal>animales;
	private ArrayList<Trabajador>trabajadores;
	private ArrayList<Asignacion>asignaciones;
	
	static Scanner sc = new Scanner(System.in);	
	
	public Zoologico(String nombre) {
		super();
		this.nombre = nombre;
		this.zonas = new ArrayList<>();
		this.instalaciones = new ArrayList<>();
		this.animales = new ArrayList<>();
		this.trabajadores = new ArrayList<>();
		this.asignaciones = new ArrayList<>();
	}
	private int alea() {
		return (int) (Math.random() * 10) + 1;
	}
	public String getNombre() {
		return nombre;
	}
	public void añadirZonas(Zona z) {
		this.zonas.add(z);
	}
	public void añadirInstalaciones(Instalacion i) {
		while(codigoRepetido(i.getCodigo_jaula())) {
			i.setCodigo_jaula(alea()); // SI HAY UNA JAULA CON EL MISMO NUMERO GENERA UN NUEVO CODIGO DEL 1 AL 100
		}this.instalaciones.add(i);
	}
	public boolean codigoRepetido(int codigo) {
		for (Instalacion item : instalaciones) {
			if(item.getCodigo_jaula()==codigo) {
				return true;
			}
		}return false;
	}
	public void añadirAnimales(Animal a) {
		while(animalRepetido(a.getCodigo())) {
			System.out.println("Código de animal repetido, introduzca otro:");
			String nuevoCodigo=sc.nextLine();
			a.setCodigo(nuevoCodigo);
		}this.animales.add(a);
	}
	private boolean animalRepetido(String codigo) {
		for (Animal item : animales) {
			if(item.getCodigo().equals(codigo)) {
				return true;
			}
		}return false;
	}
	public void añadirTrabajadores(Trabajador t) {
		this.trabajadores.add(t);
	}
	public void añadirAsignaciones(Asignacion a) {
		this.asignaciones.add(a);
	}
	public void mostarZonas() {
		for (Zona item : zonas) {
			System.out.println(item);
		}
	}
	public void mostarInstalaciones() {
		for (Instalacion item : instalaciones) {
			System.out.println(item);
		}
	}
	public void mostarAnimales() {
		for (Animal item : animales) {
			System.out.println(item );
		}
	}
	public void mostarZonaTrabajador(String dni) {
		boolean dniEncontrado=false;
		for (Asignacion item : asignaciones) {
			if(item.getTrabajador().getDni().equals(dni)) {
				System.out.printf("Trabajador: %s\nEspecialidad: %s\n%s\nHorario: %s\n\n",item.getTrabajador().getNombreYapellidos(),
						item.getTrabajador().getEspecialidad(),item.getZona(),item.getDiasTrabajo());
				dniEncontrado=true;
			}
		}
		if(!dniEncontrado)System.out.println("El DNI no existe");
	}
	
	
	@Override
	public String toString() {
		return "ZOOLOGICO " + nombre +"\n" + zonas +"\n"+ "INSTALACIONES:"+ instalaciones + "Animales:"+"\n"
	+ animales+"\n"+ "Trabajadores=" + trabajadores + ", Asignaciones=" + asignaciones ;
	}
	
	
	
	
}
