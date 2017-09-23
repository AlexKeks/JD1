package by.htp.flawer;

public class Main2 {

	public static void main(String[] args) {
		
		//Flawer f1 = new Flawer(35,"Rose");
		Bud bud1 = new Bud(5.5,"RED");
		//f1.setBud(bud1);
		Petal p1 = new Petal ("oval", "white");
		Petal p2 = new Petal ("oval", "white");
		Petal p3 = new Petal ("oval", "white");
		
		Petal[] ps1 = new Petal[3];
		ps1[0] = p1;
		ps1[1] = p2;
		ps1[2] = p3;
		
		bud1.setPetals(ps1);
		
	//	Flawer f2 = new Flawer(40, "Tulip");
		Bud bud2 = new Bud(3.2, "Yellow");
				
		Petal[] ps2 = new Petal[10];
		for (int i=0; i<10; i++){
			ps2[i] = new Petal("round", "orange");
		}
			
		//f2.setBud (bud2);
		bud2.setPetals(ps2);
		
		
		
		
		
		
		//System.out.println(f1.flawerInfo());
		
		
		
		
		Flawer f3 = new Flawer (25, "Camomile");
		System.out.println(f3.flawerInfo());
		f3.toBloom();
		System.out.println(f3.flawerInfo());

		/*System.out.println(f2.height + " " + f2.title + " " + f2.bud.getSize() + " " + f2.bud.getcolor());

		for (int i=0; i<10; i++){
			System.out.println(f2.bud.getPetals()[i].getShare() + " " + f2.bud.getPetals()[i].getColor());
		}
	*/
	}

}
