package com.programs.oops;

public class CountWordInString {

	public static void main(String[] args) {
		String str = "Nitte Meenakshi Institute of Technology";
		String strArr[] = str.split(" ");
		int size = strArr.length;
		System.out.println("Total number of words in the given string are "+size);
	}

}
