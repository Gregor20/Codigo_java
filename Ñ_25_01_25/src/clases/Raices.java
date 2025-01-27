package clases;

public class Raices {
	
	private int a;
	private int b;
	private int c;
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	private void obtenerRaices() {
		double sol1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
		double sol2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
		System.out.println("Raiz 1 ="+sol1);
		System.out.println("Raiz 2 ="+sol2);
	}
	private void obtenerRaiz() {
		double unicsol = -b/(2*a);
		System.out.println("Raiz unica ="+unicsol);
	}
	private double getDiscriminante() {
		return Math.pow(b, 2) - (4*a*c);
	}
	private boolean tieneRaices() {
		return getDiscriminante() >= 0;
	}
	private boolean tieneRaiz() {
		return getDiscriminante()==0;
	}
	public void calcular() {
		if(tieneRaices()) {
			obtenerRaices();
		}
		else if (tieneRaiz()) {
			obtenerRaiz();
		}
		else {
			System.out.println("no tiene soluciones");
		}
	}
	
	
	
	
}
