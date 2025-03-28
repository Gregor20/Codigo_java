package Bebidas;

public class BebidaAzucarada extends Bebida {
	
	private double porcentajeAzucar;
	private boolean promocion;
	
	public BebidaAzucarada(double cantidad, double precio, String marca, double porcentajeAzucar, boolean promocion) {
		super(cantidad, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}

	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	public double getPrecio() {
		double total = this.promocion ? this.getPrecio()*0.9 : this.getPrecio();
		return total;
	}
	
	@Override
	public String toString() {
		return super.toString()+"BebidaAzucarada [porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion + "]";
	}
	
	
	
}
