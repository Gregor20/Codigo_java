package Clases;

public class Principal {

	public static void main(String[] args) {
		
		Sexo a=Sexo.HOMBRE;
		
		for (Sexo s : Sexo.values()) {
			System.out.println(s.toString()+" "+s.ordinal());
		}
		
		String cadena ="MUJER";
		
		Sexo b = Sexo.valueOf(cadena);
		System.out.println();
		System.out.println(b.toString()+" "+b.ordinal()+" "+b.name());
	}

}
