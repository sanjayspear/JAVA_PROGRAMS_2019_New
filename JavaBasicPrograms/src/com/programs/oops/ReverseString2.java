package com.programs.oops;

public class ReverseString2 {

	public static void main(String[] args) {
		String str = "Sanjay";
		String split[] = str.split("");
		int size = split.length;
		
		for(int x=size-1; x>=0; x--) {
			System.out.print(split[x]);
		}

	}

}
