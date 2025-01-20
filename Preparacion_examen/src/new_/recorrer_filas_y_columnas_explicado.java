package new_;

public class recorrer_filas_y_columnas_explicado {

	public static int alea(int li, int ls) {

		return (int) (Math.random() * (ls - li + 1) + li);
	}
	
	public static void mediaAlumnos(int m[][]) {
		int masig[]=new int [m[0].length];
		
		for (int i = 0; i < m.length; i++) {
			int suma=0;
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("     %3d",m[i][j]);
				suma+=m[i][j];
				masig[j]+=m[i][j];
			}
			System.out.printf(" ---> %.1f\n",(double)suma/m[i].length);
		}
		for(int i = 0; i < masig.length; i++) System.out.printf("   %.1f ",(double)masig[i]/m.length);
		
	}
	
	public static void imprimir(int m[][]) { //-----metodo imprimir
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%4d", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void rellenar(int m[][]) {
		for (int i = 0; i < m.length; i++) {  //--------"m.length" significa----->cantidad/longitud de las filas que hay
			for (int j = 0; j < m[i].length; j++) { //---"m[i].length significa----->¿¿¿¿¿¿¿¿¿cuantas columnas tiene la fila?????????????
				m[i][j] = alea(0, 100);
				//System.out.printf("%4d", m[i][j]); //-------se puede rellenar e imprimir con el mismo metodo
			}
		}
	}

	public static void main(String[] args) {

		int array[][] = new int[5][5];
		
		rellenar (array);
		//imprimir (array);
		mediaAlumnos(array);
		
		
		
		
		
	}
}
