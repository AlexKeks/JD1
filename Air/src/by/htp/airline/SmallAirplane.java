package by.htp.airline;

public class SmallAirplane extends Airplane{

	private String namePl="Кукурузник";
	public String getNamePl() {
		return namePl;
	}
	@Override
	public void doSmth() {
		System.out.println("Кукурузник");
		
	}

}
