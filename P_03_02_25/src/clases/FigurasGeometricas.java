package clases;

public abstract class FigurasGeometricas {
	protected double lado1;

	public FigurasGeometricas(double lado1) {
		super();
		this.lado1 = lado1;
	}

	@Override
	public String toString() {
		return "FigurasGeometricas [lado1=" + lado1 + "]";
	}
	
	public abstract double perimetro();
	public abstract double area();
}
