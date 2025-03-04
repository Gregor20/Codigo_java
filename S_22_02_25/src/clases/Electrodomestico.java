package clases;

public class Electrodomestico {
	
	//CONSTANTES POR DEFECTO
	protected static final String COLOR_DEFECTO="BLANCO";
	protected static final int PRECIO_DEFECTO=100;
	protected static final char CONSUMO_DEFECTO='F';
	protected static final double PESO_DEFECTO=5;
	
	//ATRIBUTOS
	protected String color;
	protected double precioBase;
	protected char consumoEnergetico;
	protected double peso;
	
	//CONSTRUCTOR POR DEFECTO
	public Electrodomestico() {
		super();
		this.color = COLOR_DEFECTO;
		this.precioBase = PRECIO_DEFECTO;
		consumoEnergetico = CONSUMO_DEFECTO;
		this.peso = PESO_DEFECTO;
	}
	
	//CONSTRUCTOR CON EL PRECIO Y EL PESO. RESTO POR DEFECTO
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFECTO;
		consumoEnergetico = CONSUMO_DEFECTO;
	}
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Electrodomestico(String color, double precioBase, char consumoEnergetico, double peso) {
		super();
		this.color =comprobarColor(color);
		this.precioBase = precioBase;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	private String comprobarColor(String color) {
		
		switch(color.toLowerCase()) {
			case "blanco": 
				return "BLANCO";
			case "negro": 
				return "NEGRO";
			case "rojo": 
				return "ROJO";
			case "azul": 
				return "AZUL";
			case "gris": 
				return "GRIS";
			default :
				//System.out.println("Color por defecto blanco");
				return COLOR_DEFECTO;
			
		}
	}
	
	private char comprobarConsumoEnergetico (char consumo) {
		if (consumo >= 65 && consumo <= 70 || consumo >= 97 && consumo <= 102) 
			return consumo;
		
		return this.CONSUMO_DEFECTO;
	}
	
	public double precioFinal() {
		int matriz[]= {100,80,60,50,30,10};
		double total=this.precioBase;
		int n = Character.toUpperCase(this.consumoEnergetico);
		
		total += matriz [n - 'A'];
		
		if(this.peso>=0 && this.peso<=19) {
			total +=10;
		}else if(this.peso>=20 && this.peso<=49) {
			total +=50;
		}else if(this.peso>=50 && this.peso<=79) {
			total +=80;
		}else if(this.peso>=80 && this.peso<=100) {
			total +=100;
		}
		return total;
	}
	

	public static String getColorDefecto() {
		return COLOR_DEFECTO;
	}

	public static int getPrecioDefecto() {
		return PRECIO_DEFECTO;
	}

	public static char getConsumoDefecto() {
		return CONSUMO_DEFECTO;
	}

	public static double getPesoDefecto() {
		return PESO_DEFECTO;
	}

	public String getColor() {
		return color;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", ConsumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	
	
}
