package Lw9;




public class B extends A{
	
	public static int bB=1;
	
	static{
		System.out.println("Static B");
	}
	
	{
		super.a=8;
	}
	
	public B(){
		super();
		//System.out.println("B"+a);
	}
	public B(int a){
		this();
		//super();
		//System.out.println("B int a");
	}
	/*public void doAnyth(){
		System.out.println("doAnyth in B");
	}*/
}
