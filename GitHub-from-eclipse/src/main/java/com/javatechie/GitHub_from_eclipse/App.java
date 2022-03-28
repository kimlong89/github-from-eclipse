package com.javatechie.GitHub_from_eclipse;
public class App{
		public static void main(String[] args) {
	//	System.out.println("Hello World");
		 try{
	         int a[]=new int[7];
	         a[4]=30/0;
	         System.out.println("First print statement in try block");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
	     catch(Exception e){
	        System.out.println("Warning: Some Other exception");
	     }
	   System.out.println("Out of try-catch block...");
   
	   //test
			//test1
	}
}
