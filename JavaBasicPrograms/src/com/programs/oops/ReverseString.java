package com.programs.oops;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = str;
		
		char split[] = s.toCharArray();
		
		int size = split.length;
		
		for(int i=size-1; i>=0; i--) {
			System.out.print(split[i]);
		}
		
		sc.close();
	}

}
