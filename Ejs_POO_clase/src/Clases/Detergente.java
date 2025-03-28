package Clases;

public class Detergente implements conDescuento, esLiquido {
	
	private String marca;
	private double precio;
	
	private double descuento;
	private float volumen;
	private String envase;
	
	//CONSTRUCTOR CON MARCA Y PRECIO
	public Detergente(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	//GETTERS & SETTERS DE DETRGENTE
	public String getMarca() { return marca;}
	public void setMarca(String marca) { this.marca = marca;}
	public double getPrecio() { return precio;}
	public void setPrecio(double precio) { this.precio = precio;}


	@Override
	public void setvolumen(double v) {this.volumen=(float)v;}
	@Override
	public double getVolumen() {return this.volumen;}
	@Override
	public void setTipoEnvase(String env) {this.envase=env;}
	@Override
	public String getTipoenvase() {return this.envase;}
	@Override
	public void setDescuento(double des) {this.descuento = des;}
	@Override
	public double getDescuento() {return this.descuento;}
	@Override
	public double getPrecioDescuento() {
		double total = this.precio - this.descuento;;
		return total;
	}
	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", descuento=" + descuento + ", volumen=" + volumen
				+ ", envase=" + envase + "]";
	}
	

}
