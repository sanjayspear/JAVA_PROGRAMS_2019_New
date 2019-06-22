package arrayPrograms;

import java.util.Arrays;

public class Copy1ArrayToAnother2 {
   
   public static void main(String[] args) {
	   int a[] = {10, 20, 30, 40, 50};
	   int b[] = new int[a.length];
	   
	   //Copying one array to another array
	   b=Arrays.copyOf(a, a.length);
	   
	   for(int i=0; i<a.length; i++) {
		   System.out.println(b[i]+" ");
	   }
   }
}
