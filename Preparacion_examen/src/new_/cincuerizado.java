package new_;

public class cincuerizado {
	
	public static int alea (int li, int ls) {
		return (int)(Math.random()*(ls-li+1)+li);
	}
	
	public static void rellenarImprimir(int m[]) {
		for(int i=0; i<m.length; i++) {
			m[i]=alea(0,500);
				System.out.printf("[%d]%3d\n",i,m[i]);
		}
	}
	
	public static void cincuerizado(int m[]) {
		for(int i=0; i<m.length; i++) {
			m[i]=alea(0,500);
			System.out.printf("[%d]%3d ",i,m[i]," ");
			
			while(m[i]%5!=0)m[i]++;
			System.out.printf("[%d]%3d \n",i,m[i]);
		}
	}

	public static void main(String[] args) {
		
		int array[]=new int[15];
		
		cincuerizado(array);
		//rellenarImprimir(array);

	}

}
