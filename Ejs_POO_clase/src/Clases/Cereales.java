package Clases;

import java.time.LocalDate;

public class Cereales implements esAlimento {
	
	private String marca;
	private double precio;
	private String tipoCereal;
	private LocalDate caducidad;
	
	public Cereales(String marca, double precio, String tipoCereal) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.tipoCereal = tipoCereal;
	}
	
	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	public String getTipoCereal() {return tipoCereal;}
	public void setTipoCereal(String tipoCereal) {this.tipoCereal = tipoCereal;}

	@Override
	public void setCaducidad(LocalDate fc) {this.caducidad=fc;}
	@Override
	public LocalDate getCaducidad() {return this.caducidad;}
	@Override
	public int getCalorias() {
		if(tipoCereal.equalsIgnoreCase("espelta")) {
			return 5;
		}else if(tipoCereal.equalsIgnoreCase("maiz")) {
			return 8;
		}else if(tipoCereal.equalsIgnoreCase("trigo")) {
			return 12;
		}else {
			return 15;
		}
	}

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", tipoCereal=" + tipoCereal + ", caducidad="
				+ caducidad + "]";
	}
	

}
