package Clases;

public enum Mes { // CLASE ENUMERACION
	ENERO(31),
	FEBRERO(28),
	MARZO(31),
	ABRIL(30),
	MAYO(31),
	JUNIO(30),
	JULIO(31),
	AGOSTO(31),
	SEPTIEMBRE(30),
	OCTUBRE(31),
	NOVIEMBRE(30),
	DICIEMBRE(31);
	
	private int dias; // ATRIBUTO
	Mes(int n) {this.dias=n;} // CONSTRUCTOR
	
	public int getDias() {return this.dias;} // --METODO DEVUELVE LOS DIAS
	
}
