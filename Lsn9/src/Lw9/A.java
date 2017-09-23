package Lw9;

public class A {
	
	public static int aA = 0;
	protected int a=1;

	static{
		System.out.println("Static A");
	}
	
	{
		a=2;
	}
	public A(){
		super();
		a=3;
		//System.out.println("A"+a);
	}
	
	{
		a=4;
	}
	
	public static void doSmth(){
		System.out.println("doSmth in A");
	}
	
	public void doAnyth(){
		System.out.println("doAnyth in A");
	}
}
