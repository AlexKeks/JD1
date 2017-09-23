package by.htp.planeta;

public class Main {

	public static void main(String[] args) {
		
		Planeta planeta1 = new Planeta("Mars");
		
		Ocean ocean1 = new Ocean ("MilkOcean", "colorWhite");
		planeta1.setOcean(ocean1);
		
		Mainland mainland1 = new Mainland("Australia", 500);
		Mainland mainland2 = new Mainland("Africa", 600);
		
		Mainland[] mainlands = new Mainland[5];
		mainlands [0] = mainland1;
		mainlands [1] = mainland2;
				
		Island island1 = new Island ("Madagaskar", 100);
		planeta1.setIsland(island1);
		
		System.out.println("Name planet: " + planeta1.getName() + ",\nname mainlands of planet: " + mainland1.getName() + ", " + mainland2.getName());
		
		int count = planeta1.amout(mainlands);
		System.out.println("Amout mainland: " + count);
		
		/*int a=0;
		for (int i = 0; i<=a; i++){
			if (mainlands[a] != null){
				a++;
			}
		}
		System.out.println("Amout mainland: " + a);
		
		*/
		
		
	}
}

