package by.htp.airline;

public class Airline  {

	private String nameAirlane;
	private Airplane[] airplanesAirlane;
	

	public String getNameAirlane() {
		return nameAirlane;
	}

	public void setNameAirlane(String nameAirlane) {
		this.nameAirlane = nameAirlane;
	}

	public Airplane[] getSumAirplanes() {
		return airplanesAirlane;
	}

	public void setSumAirplanes(Airplane[] sumAirplanes) {
		this.airplanesAirlane = sumAirplanes;
	}
	
	public int allPassengers(){
		int allPassengers=0;
		for(int i=0;i<airplanesAirlane.length;i++){
			allPassengers+=airplanesAirlane[i].getPassengers();
		}
		return allPassengers;
	}
	
	public int allLoad(){
		int allLoad=0;
		for(int i=0;i<airplanesAirlane.length;i++){
			allLoad+=airplanesAirlane[i].getLoad();
		}
		return allLoad;
		
	}
	public void listRangeFlying(Airplane[]airplanesAirlane){
		for(int i=airplanesAirlane.length-1;i>=0;i--){
			for(int j=0;j<i;j++) {
				if(airplanesAirlane[j].rangeFlying() > airplanesAirlane[j+1].rangeFlying()){
					Airplane t =airplanesAirlane[j];
					airplanesAirlane[j]=airplanesAirlane[j+1];
					airplanesAirlane[j+1]=t;
				}
				
			}
		}
		for(int i=0;i<airplanesAirlane.length;i++){
			System.out.println("Дальность полёта самолёта\""+airplanesAirlane[i].getNamePl()+"\": "+airplanesAirlane[i].rangeFlying()+" т.км.");
		}
		
	}
	
	public void searchOnFuelSpending(int a,int b){
		
	}

}
