package Principal1;

public class InicioDNINIE {
	
	public static int alea(int li, int ls) {
		return (int)Math.random()*(ls-li+1)+li;
	}
	public static String ochocifras() {
		String cadena="";
		for(int i=1; i<=8; i++) {
			cadena+=String.valueOf(alea(0,9));
		}
		return cadena;
		
	}
	
	public static String letra (String n) {
		
		String cadena="TRWAGMYFPDXBNJZSQVHLCKE";
		int numero;
		
		int v="XYZ".indexOf(n.substring(0,1));
		
		if(v>-1) {
			numero=Integer.valueOf(String.valueOf(v)+n.substring(1));
		}
		else {
			numero=Integer.valueOf(n);
		}
		
		int c=numero%23;
		return cadena.substring(c, c+1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(letra("506912376"));
		System.out.println(letra("Y36543369"));

	}

}
