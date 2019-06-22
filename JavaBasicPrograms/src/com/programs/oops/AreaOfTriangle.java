package com.programs.oops;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the width of the Triangle:");
       int width=sc.nextInt();
       System.out.println("Enter the height of the Triangle:");
       int height=sc.nextInt();
       int area=(width*height)/2;
       System.out.println("Area of triangle is: "+area);
       sc.close();
	}

}
