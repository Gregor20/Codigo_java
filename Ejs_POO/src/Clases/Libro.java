package Clases;

public class Libro extends Publicacion {
	private int numero_paginas;

	public Libro(String titulo, String autor) {
		super(titulo, autor);
		
	}

	public int getNumero_paginas() {
		return numero_paginas;
	}

	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}

	@Override
	public void mostrarInformacion() {
		
		super.mostrarInformacion(); 
		System.out.println("Este libro tiene " + getNumero_paginas() + " páginas" + "\n") ;
	}
	

	
	
	

}
