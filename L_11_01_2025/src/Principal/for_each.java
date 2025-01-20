package Principal;

public class for_each {

	public static void main(String[] args) {
		
		
		int[]a= {1,2,3};
		
		for (int i=0; i<a.length; i++) {
			System.out.println(i+" "+a[i]);
		}
		
		
		for (int item :a)System.out.println(item);
	}

}
