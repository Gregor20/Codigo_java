package Clases;

import java.util.Random;

public class Persona {
	
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	
	
	public String getNombre() { //------------ GETTER Y SETTER
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo=comprobarSexo(sexo);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	private static final int PESO_IDEAL = -1;
	private static final int PESO_BAJO = 0;
	private static final int PESO_ALTO = 1;
	
	public double getImc() {
		double imc = peso / Math.pow(altura, 2);
		if(imc<20) {
			return PESO_IDEAL;
		}
		else if (imc >=20 && imc <=25) {
			return PESO_BAJO;
		}
		else if(imc > 25) {
			return PESO_ALTO;
		}
		return Math.round(imc*100.0)/100.0;
	}
	
	public boolean mayordeEdad (int edad) {
		return edad>=18;
	}
	
	private char comprobarSexo(char sexo) {
		if (sexo!='h'&&sexo!='H' && sexo!='m' && sexo!='M')return 'H';
			return sexo;
	}
	private String generaDni() {
		int num=(int)(Math.random()*(100000000+1));
		String cadena=Integer.toString(num);
		this.dni=cadena;
		return cadena;
	}
	private String letraDni() {
		Random letraRandom=new Random(); //---------------------CREANDO LA INSTANCIA
		char letra=(char)(letraRandom.nextInt(26)+('a'));
		String cadena=Character.toString(letra);
		return cadena;
	}
	public String inventaDni() {
		return generaDni();
	}
	public String añadirLetra() {
		String i=generaDni();
		String j=letraDni();
		this.dni=i+j;
		return i+j;
	
	}

	
	
	public Persona() {
		nombre="Vacío";
		edad=0;
		dni=" ";
		sexo='h';
		peso=0;
		altura=0;
	}
	
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) { //-------CONSTRUCTOR
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.dni=añadirLetra();
	}
	public Persona(String nombre, int edad, String dni, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	

}
