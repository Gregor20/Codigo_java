package Principal1;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private char sexo='H';
	private double peso;
	private double altura;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Persona () {};
	
	public Persona(String nombre, String apellido, String dni, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.sexo = compruebaSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	private char compruebaSexo(char sexo) {
		if (sexo!='h' && sexo!='H' && sexo!='m' && sexo!='M')return 'H';
		return sexo;
		
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", sexo="
				+ sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	
	
	
	
	
	
	

}
