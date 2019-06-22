package com.programs.oops;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
      //Formula for Volume of Sphere is: (4/3)*pi*(r*r*r)
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter radius");
	  int r=sc.nextInt();
	  double pie=3.14285714286;
	  double volume=(4.0/3.0)*pie*(r*r*r);
	  System.out.println("Volume of Sphere is: "+volume);
	  sc.close();
	}

}
