package by.htp.classWork;

public abstract class Terminator {
	
	private Target target;

	public Terminator(Target target){
		this.target = target;
	}
	
	public void showTarget() {
		this.target.show();
		
	}
}
