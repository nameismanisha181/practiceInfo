package CapgeminiIterview;
class A
{
	
}
public class Exception2 {
public static void main(String[] args) {
	try
	{
	A rv1= new A();
	rv1=null;
	System.out.println(rv1.hashCode());
	}
	catch (NullPointerException e) {
		System.out.println("Done");
	}
}
}
