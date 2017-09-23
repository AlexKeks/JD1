package by.htp.flawer;

public class Petal {
	
	private String share;
	private String color;
	
	public Petal(String share, String color){
		this.share = share;
		this.color = color;
	}
public String getShare(){
	return share;
}
public String getColor (){
	return color;
}

public String petalInfo(){
	String info;
	info = " petal share: " + share
			+ ", color: " + color + " ";
	return info;

}
}
