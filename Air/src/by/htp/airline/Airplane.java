package by.htp.airline;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Airplane {
	
	private int passengers;
	private int load;
	private int tank;
	private int fuelSpending;
	
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	public int getTank() {
		return tank;
	}
	public void setTank(int tank) {
		this.tank = tank;
	}
	public int getFuelSpending() {
		return fuelSpending;
	}
	public void setFuelSpending(int fuelSpending) {
		this.fuelSpending = fuelSpending;
	}
	public double rangeFlying(){
		double d = (double)tank/fuelSpending;
		double d2 = new BigDecimal(d).setScale(3, RoundingMode.UP).doubleValue();
		return d2;
	}
	
	
	public abstract  void doSmth();
	public abstract String getNamePl();
	

}
