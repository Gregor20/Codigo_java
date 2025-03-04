package clases;

public class Television extends Electrodomestico {
	
	private static final int RESOLUCION_DEFECTO = 20;
	private static final boolean SINTONIZADOR_TDT_DEFECTO = false;
	
	protected int resolucion;
	protected boolean sintonizador_tdt;
	
	//CONSTRUCTOR POR DEFECTO
	public Television() {
		super();
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizador_tdt=SINTONIZADOR_TDT_DEFECTO;
	}
	
	//CONSTRUCTOR PRECIO Y PESO
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizador_tdt=SINTONIZADOR_TDT_DEFECTO;
	}
	

	public Television(String color, double precioBase, char consumoEnergetico, double peso, int resolucion, boolean sintonizador_tdt) {
		super(color, precioBase, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizador_tdt=sintonizador_tdt;
	}
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizador_tdt() {
		return sintonizador_tdt;
	}
	@Override
	public double precioFinal() {
		if(resolucion > 40) {
			precioBase += (0.3 * precioBase);
		}
		if(sintonizador_tdt = true) {
			precioBase += 50;
		}
		return super.precioFinal();
	}
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador_tdt=" + sintonizador_tdt + ", color=" + color
				+ ", precioBase=" + precioBase + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}
	

}
