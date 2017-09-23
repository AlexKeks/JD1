package by.htp.planeta;

public class Island {
	private String name;
	private int area;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	public Island (String name, int area){
		this.name = name;
		this.area = area;
	}
	

}
