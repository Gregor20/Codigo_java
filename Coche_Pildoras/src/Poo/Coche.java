package Poo;

public class Coche {//--------clase

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	public Coche(){ //--------constructor
		
		ruedas=4;
		largo=2000;
		ancho=100;
		motor=1600;
		peso=1000;
	}
	public String dime_largo() { //--metodo getter (tiene q tener RETURN) 
		
		return "El largo del coche es "+largo;
	}
}
