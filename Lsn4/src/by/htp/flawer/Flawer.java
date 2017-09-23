package by.htp.flawer;

public class Flawer {

	private double height;
	private String title;
	private Bud bud;
	
	public Flawer() {
	}

	public Flawer(double height, String title, Bud bud) {
		this.height = height;
		this.title = title;
		this.bud = bud;
	}

	public Flawer(double height, String title) {
		this.height = height;
		this.title = title;
	}
	
	public String flawerInfo (){
		String info;
		info = " flawer height: " + height 
				+ " title " + title + " ";
		if (bud != null){
			info = info +  bud.budInfo();
		}
		return info;
	}
	
	public void toBloom(){
	if (this.bud == null){
		Bud bud = new Bud(15, "red", 3);
		//bud.setSize(15.0);
		//bud.setColor("red");
		
		Petal p1 = new Petal("oval", "pink");
		Petal p2 = new Petal("oval", "pink");
		Petal p3 = new Petal("oval", "pink");
		Petal p4 = new Petal("oval", "pink");
		
		bud.addPetal(p1);
		bud.addPetal(p2);
		bud.addPetal(p3);
		bud.addPetal(p4);
		
		this.bud = bud;
		
	}
	else {
		double oldSize = this.bud.getSize();
		double newSize = oldSize *2;
		bud.setSize(newSize);
	}

	
}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}
}

