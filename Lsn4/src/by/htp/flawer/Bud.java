package by.htp.flawer;

public class Bud {

	private double size;
	private String color;
	private Petal[] petals;
	private int lastPetalIndex = 0;
	
	
	public double getSize(){
		return size;
	}
	public Bud(double size, String color) {
		this.size = size;
		this.color = color;
	}
	public Bud(double size, String color, Petal[] petals) {
		this.size = size;
		this.color = color;
		this.petals = petals;
	}
	
	public Bud(double size, String color, int petalCount) {
		this.size = size;
		this.color = color;
		
		if(petalCount>0){
			this.petals = new Petal[petalCount];
		}
		
	}
	
	public Bud() {
	}
	public void setSize(Double size){
		this.size = size;
	}
	public String getcolor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public Petal[] getPetals(){
		return petals;
	}
	public void setPetals(Petal[] petals){
		this.petals = petals;
	}
	public String budInfo(){
		String info;
		String petalInfo = "";
		for(int i =0; i<petals.length; i++){
			petalInfo = petalInfo + petals[i].petalInfo();
		}
		info = "bud size: " + size
				+ ", color: " + color + petalInfo;
		return info;
	}
	
	
	public void addPetal(Petal petal){
		if (petal != null){
			
			if(lastPetalIndex<this.petals.length ){
			this.petals[lastPetalIndex] = petal;
			lastPetalIndex++;
			}
		
		
	}
	}
}

