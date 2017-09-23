package by.htp.classWork;

public class KillTarget extends AbstractTarget {

	public KillTarget(String value) {
		super(value);
		
	}
	public void show(){
		System.out.println("Kill: " + super.value);
	}
	

}
