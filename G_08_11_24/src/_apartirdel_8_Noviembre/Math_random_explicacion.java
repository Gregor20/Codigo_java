package _apartirdel_8_Noviembre;

public class Math_random_explicacion {

	public static void main(String[] args) {
		
		
		for(int i=0; i<10;i++) {
		
		//System.out.println(Math.random());  //----- esta funcoin lo que hace es dar un numero aleaotrio del 0 al 1 (ej: 0,56788534)
		
        //System.out.println(Math.random()*100);   //----- si multiplico por 100, muevo la coma, dos posiciones a la derecha (ej: 056,788534)
	
	    System.out.println((int)(Math.random()*100)+1); //---- con"(int) hago q sea entero y con "+1" incluyo el 100
	}
	
	}
	

}
