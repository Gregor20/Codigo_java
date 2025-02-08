package clases;

public abstract class Cuenta { // CLASE ABSTRACTA; DE AQUI NACERAN LAS DEMÁS
	
	protected String nombre; // TODOS LOS ATRIBUTOS QUE TIENE STA CLASE Y TENDRÁN LAS DEMÁS HERENCIAS
	protected String cuenta;
	protected double saldo;
	protected double tipoDeInteres;
	
	public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) { // CONSTRUCTOR POR DEFECTO
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.saldo = saldo;
		this.tipoDeInteres = tipoDeInteres;
	}
	public Cuenta(String nombre, String cuenta, double tipoDeInteres) { // CONSTRUCTOR CUENTA SIN SALDO
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.saldo = 0;
		this.tipoDeInteres = tipoDeInteres;
	}
	public String getNombre() { // ------GETTERS Y SETTERS
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTipoDeInteres() {
		return tipoDeInteres;
	}
	public void setTipoDeInteres(double tipoDeInteres) {
		this.tipoDeInteres = tipoDeInteres;
	}
	
	public void ingreso (double euros) { // CADA VEZ QUE SE HACE UN INGRESO ( QUE OCURRE? SUMA EUROS )
		this.saldo += euros;
	}
	public void reintegro (double euros) { // CADA VEZ QUE HACE UN REINTEGRO ( QUE OCURRE? RESTA EUROS )
		if (euros<=this.saldo) {
		this.saldo -= euros;
		}else {
			System.out.println("no tienes saldo suficiente");
		}
}
	public abstract void comisiones();	// DOS METODOS ABSTRACTOS QUE SOLO ESTAN DECLARADOS PERO SIN INICIAR
	public abstract double intereses();
	
	@Override
	public String toString() { // TO STRING
		
		return "Cuenta [nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoDeInteres="
				+ tipoDeInteres + "]";
	}	
	
	

}
