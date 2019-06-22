package com.programs.oops;

public class Swap {
	   static int a=10, b=15, x=100, y=200, temp=0;
	   
	public static void main(String[] args) {
        Swap a = new Swap();
        
        a.swappingThroughTemp();
        Swap.bitwiseSwapping();
        Swap.SwappingThroughOperator();
	}
	
	public void swappingThroughTemp() {
		
		  System.out.println("Swapping two variable using temparary varible");
		
		  System.out.println("Before swapping a="+a);
	      System.out.println("Before swapping b="+b);
	      
	      temp=a;
	      a=b;
	      b=temp;
	      
	      System.out.println("After swapping a="+a);
	      System.out.println("After swapping b="+b);
		
	}
	
	public static void bitwiseSwapping() {
		
		  System.out.println("Swapping two variable using bitwise operator");
		
		  System.out.println("Before swapping a="+a);
	      System.out.println("Before swapping b="+b);
	      
	      a = a ^ b;
	      b = a ^ b;
	      a = a ^ b;
	      
	      System.out.println("After swapping a="+a);
	      System.out.println("After swapping b="+b);
	}
	
	public static void SwappingThroughOperator() {
		
		  System.out.println("Swapping two variable using operator (+/-)");
		
		  System.out.println("Before swapping a="+x);
	      System.out.println("Before swapping b="+y);
	      
	      x = x + y;
	      y = x - y;
	      x = x - y;
	      
	      System.out.println("After swapping a="+x);
	      System.out.println("After swapping b="+y);
	}

}
