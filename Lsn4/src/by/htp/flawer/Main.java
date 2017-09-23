package by.htp.flawer;

public class Main {

	public static void main(String[] args) {
		
	Flawer f1 = new Flawer();
	//f1.height = 35;
	//f1.title = "Rose";
	//f1.setHeight(35);
	//f1.setTitle("rose");
	Bud bud1 = new Bud();
	bud1.setColor("red");
	bud1.setSize(5.5);
	f1.setBud ( bud1);
	Petal p1 = new Petal ("oval", "white");
	Petal p2 = new Petal ("oval", "white");
	Petal p3 = new Petal ("oval", "white");
	
	Petal[] ps1 = new Petal[3];
	ps1[0] = p1;
	ps1[1] = p2;
	ps1[2] = p3;
	
	bud1.setPetals(ps1);
	
	Flawer f2 = new Flawer();
	//f2.height = -1;
	//f2.title = "Tulip";
	//f2.setHeight(40);
	//f2.setHeight("ttulip");
	Bud bud2 = new Bud();
	bud2.setColor("yellow");
	bud2.setSize(3.2);
	
	Petal[] ps2 = new Petal[10];
	for (int i=0; i<10; i++){
		ps2[i] = new Petal("round", "orange");
	}
		
	f2.setBud(bud2);
	

		
	bud2.setPetals(ps2);
	
	/*System.out.println(f1.height + " " + f1.title + " " + f1.bud.getSize() + " " + f1.bud.getcolor());
	System.out.println(f1.bud.getPetals()[0].getShare() + " " + f1.bud.getPetals()[0].getColor());
	System.out.println(f1.bud.getPetals()[1].getShare() + " " + f1.bud.getPetals()[1].getColor());
	System.out.println(f1.bud.getPetals()[2].getShare() + " " + f1.bud.getPetals()[2].getColor());
	
	System.out.println(f2.height + " " + f2.title + " " + f2.bud.getSize() + " " + f2.bud.getcolor());

	for (int i=0; i<10; i++){
		System.out.println(f2.bud.getPetals()[i].getShare() + " " + f2.bud.getPetals()[i].getColor());
	}
	*/
	}

}
