package clases;

public class Lavadora extends Electrodomestico {
	
	private static final double CARGA_DEFECTO = 5;//CONSTANTE DE LAVADORA
	
	protected double carga;//NUEVO ATRIBUTO DE LAVADORA
	
	//CONSTRUCTOR POR DEFECTO(HEREDADO)
	public Lavadora() {
		super();
		this.carga=CARGA_DEFECTO;
	}
	//CONSTRUCTOR CON PRECIO Y PESO (HEREDADO)
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga=CARGA_DEFECTO;
	}
	//CONSTRUCTOR CON LA CARGA Y EL HEREDADO
	public Lavadora(String color, double precioBase, char consumoEnergetico, double peso, double carga) {
		super(color, precioBase, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	public double getCarga() {
		return this.carga;
	}
	@Override
	public double precioFinal() {
		if(carga > 30) {
			precioBase += 50;
		}
		return super.precioFinal();
	}
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", color=" + color + ", precioBase=" + precioBase + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
}
