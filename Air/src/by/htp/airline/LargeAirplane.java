package by.htp.airline;

public class LargeAirplane extends Airplane{

	private String namePl="Пассажирский";
	public String getNamePl() {
		return namePl;
	}
	@Override
	public void doSmth() {
		System.out.println("Большой пассажирский");
		
	}

}
