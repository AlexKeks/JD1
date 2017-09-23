package by.htp.airline;

public class CargoAirpalne extends Airplane {
	
	private String namePl="Грузовой";
	public String getNamePl() {
		return namePl;
	}
	@Override
	public void doSmth() {
		System.out.println("Грузовой самолёт");
		
	}


	
	

}
