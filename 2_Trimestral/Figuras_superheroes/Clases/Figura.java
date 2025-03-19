package Clases;

public class Figura {
	private String codigo;
	protected double precio;
	private Superheroe superheroe;
	private Dimension dimension;

	public Figura(String codigo, double precio, Superheroe sh, Dimension dm) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.superheroe = sh;
		this.dimension = dm;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Superheroe getSh() {
		return superheroe;
	}

	public void setSh(Superheroe sh) {
		this.superheroe = sh;
	}

	public Dimension getDm() {
		return dimension;
	}

	public void setDm(Dimension dm) {
		this.dimension = dm;
	}
	public void subirPrecio(double cantidad) {
		this.precio = this.precio += cantidad;
	}

	@Override
	public String toString() {
		return "Figura "+ "[codigo=" + codigo + ", precio=" + precio +"]"+ "\n" + superheroe + "\n" + dimension +"\n"+"\n";
	}
	
	

}
