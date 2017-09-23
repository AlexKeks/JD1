package by.htp.airline.run;


import java.util.Scanner;

import by.htp.airline.Airline;
import by.htp.airline.Airplane;
import by.htp.airline.CargoAirpalne;
import by.htp.airline.LargeAirplane;
import by.htp.airline.SmallAirplane;

public class Main {

	public static void main(String[] args) {
		
		Airline a1 = new Airline();
		a1.setNameAirlane("BelAvia");
		
		CargoAirpalne ca= new CargoAirpalne();
		ca.setPassengers(10);
		ca.setLoad(20000);
		ca.setTank(7000);
		ca.setFuelSpending(1000);
		
		SmallAirplane sa=new SmallAirplane();
		sa.setPassengers(20);
		sa.setLoad(3000);
		sa.setTank(500);
		sa.setFuelSpending(100);
		
		LargeAirplane la=new LargeAirplane();
		la.setPassengers(300);
		la.setLoad(8000);
		la.setTank(7000);
		la.setFuelSpending(600);
		
		Airplane[]ap=new Airplane[3];
		ap[0]=ca;
		ap[1]=sa;
		ap[2]=la;
		
		a1.setSumAirplanes(ap);
		System.out.println("Список самолётов авиакомпании "+a1.getNameAirlane());
		for(int i=0;i<ap.length;i++){
			System.out.println((i+1)+"."+ap[i].getNamePl());
		}
		System.out.println("Общее количество пассажиров: "+a1.allPassengers());
		System.out.println("Общая грузоподъёмнасть авиакомпании: "+a1.allLoad());
		a1.listRangeFlying(ap);
		System.out.println("Введите диапозон потребления топлива самолётом, в пределах от 100 до 1000 л/т.км" );
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		
	}

}
