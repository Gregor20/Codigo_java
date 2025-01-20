package asdf;

public class clase_9 {

	public static int alea(int li, int ls) {
		
		return ((int)Math.random()*(ls-li+1))+li;
	}
	
	public static void rellenar(int m[]) {
		for (int i = 0; i < m.length; i++) {
			m[i]=alea(0,10);
		}
	
	}
	
	public static void main(String[] args) {
		int tb[]=new int [5];
		rellenar(tb);
		
		for(int i=0; i< tb.length; i++) 
			System.out.println(i+" "+tb[i]);
	}

}
