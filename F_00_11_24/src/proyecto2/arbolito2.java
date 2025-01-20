package proyecto2;

public class arbolito2 {

	public static void main(String[] args) {
		
		
		
		int altura=5;  // ----------------------declarar la altura del arbolito	
		
		for (int fila=0; (fila<altura); fila++) {
			
		for (int espacio=0; espacio<(altura-fila-1); espacio++) {
				
			System.out.print(" ");
		}
			
		for (int asterisco = 0; asterisco<(fila*2)+1; asterisco++) {
				
			System.out.print("*");
		}
			System.out.println("");
		
		}
	}
}
		
		  // --------------- bucle para recorrer todas las filas (altura)
			
		
			
		 //--------bucle para los espacios
	                              //   4  - 0 -1= 3
			                      //   4  - 1 -1= 2
			                      //   4  - 2 -1= 1
			                      //   4  - 3 -1= 0
			
		  //------------bucle para los asteriscos
			
		
		
		 //-------------------------------salto de linea
		
		
			
			
		
	//   *	
	//  ***	
	// *****
	//*******	

	


