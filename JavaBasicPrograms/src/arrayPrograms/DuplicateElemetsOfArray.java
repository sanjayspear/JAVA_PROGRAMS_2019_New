package arrayPrograms;

public class DuplicateElemetsOfArray {
    public static int count=0;
	public static void main(String[] args) {
		int a[] = {10, 10, 20, 30, 40, 40, 60, 70, 70, 80, 90, 100, 100};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
