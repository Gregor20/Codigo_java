package Bebidas;

public class Almacen {
	
	private Bebida[][] estanteria;

	public Almacen(int nfilas, int ncolumnas) {
		estanteria=new Bebida [nfilas][ncolumnas];
	}
	
	public Almacen() {
		estanteria=new Bebida[6][6];
	}
	
	//metodos
	
	public void agregarBebida(Bebida a) {
		boolean posicionado=false;
		for (int i = 0; i < estanteria.length  &&  !posicionado   ; i++) {
			for (int j = 0; j < estanteria[i].length  && !posicionado; j++) {
				
				if (estanteria[i][j]==null) {
					estanteria[i][j]=a;
					posicionado=true;
				}
				
			}
			
			if(posicionado) {
				System.out.println("bebida añadida");
			}else {
				System.out.println("no hay hueco");
			}
			
		}
		
	}
	
	
}
