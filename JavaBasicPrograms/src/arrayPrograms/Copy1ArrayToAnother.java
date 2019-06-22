package arrayPrograms;

public class Copy1ArrayToAnother {

	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
		
		int c[] = {100, 200, 300, 400, 500};
		
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		
	
		System.out.println("Values of B After copying from Arra A[] to Array B[]"); 
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]+" ");
		}
		
		System.out.println("Values of C Before copying"); 
		for(int i=0; i<b.length; i++) {
			System.out.println(c[i]+" ");
		}
		
		System.out.println("Values of C After copying from Array A[] to Array C[], Here old content is replaced by new content"); 
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(c[i]+" ");
		}
	}

}
