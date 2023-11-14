package CapgeminiIterview;

public class Exception1 {
public static void main(String[] args) {
	
	int a=10;
	try 
	{
		System.out.println("From try block");
		int b=a/0;
		System.out.println("Done from try block");
		System.out.println(b);
		
		
	} catch (ArithmeticException e) 
	{
		System.out.println("Done");
	}
	finally {
		System.out.println("Close finally block");
	}
}
}
