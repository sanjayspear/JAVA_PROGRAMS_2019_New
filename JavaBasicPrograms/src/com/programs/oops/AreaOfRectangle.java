package com.programs.oops;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the width of rectangle");
      int width=sc.nextInt();
      System.out.println("Enter the height of rectangle");
      int height=sc.nextInt();
      int area=width*height;
      System.out.println("Area of rectangle is: "+area);
      sc.close();

	}

}
