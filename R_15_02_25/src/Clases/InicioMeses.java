package Clases;

public class InicioMeses {

	public static void main(String[] args) {
		
		Mes a = Mes.JUNIO;
		
		//System.out.println(a.name()+ " "+ (a.ordinal()+1)+" "+ a.getDias());
		
		for (Mes item : Mes.values()) {
			System.out.println(item.name()+ " "+ (item.ordinal()+1)+" "+ item.getDias());
		}
		
	}

}
