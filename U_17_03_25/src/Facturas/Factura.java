package Facturas;

public class Factura implements Variaciones, Constantes {

	public static final double IVA=0.16;
	private double totalSinIva;
	
	public double sinIva() {
		return totalSinIva;
	}
	public double conIva() {
		return totalSinIva*(1+IVA);
	}
	
	
	@Override
	public void asignarValor(double x) {
		if(valorMinimo < x) {
			this.totalSinIva=x;
		}else {
			this.totalSinIva=0;
		}
	}
	
	@Override
	public void rebaja(double t) {
		this.totalSinIva *= (1-t/100);

	}

}
