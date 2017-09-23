package Lw9;

public class C extends B{
	
	
	public static Integer cC=2;
	
	static{
		System.out.println("Static C");
	}
	
public C(){
	super();
	//System.out.println("C");
}

public static void doSmth(){
	System.out.println("doSmth in C");
}

public void doAnyth(){
	System.out.println("doAnyth in C"+cC);
}

}