package com.programs.oops;

public class ReverseString3 {
	public static void main(String[] args) {
		
		String str = "Nitte Meenakshi Institute", reverse="";
		char token[] = str.toCharArray();
		int size = token.length;
		for(int i=size-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
        		
		
	}
}
