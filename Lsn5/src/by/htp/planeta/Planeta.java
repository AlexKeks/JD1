package by.htp.planeta;

public class Planeta {

	private String name;
	private Mainland[] mainland;
	private Island island;
	private Ocean ocean;

	public Mainland[] getMainland() {
		return mainland;
	}

	public void setMainland(Mainland[] mainland) {
		this.mainland = mainland;
	}

	public Island getIsland() {
		return island;
	}

	public void setIsland(Island island) {
		this.island = island;
	}

	public Ocean getOcean() {
		return ocean;
	}

	public void setOcean(Ocean ocean) {
		this.ocean = ocean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Planeta (String name, Mainland[] mainland, Ocean ocean ){
		this.name =  name;
		this.mainland = mainland;
		this.ocean = ocean;
	}
	
	public Planeta (String name){
		this.name = name;
	}
	
	public int amout(Mainland mainland[]){
		int a=0;
		for (int i = 0; i<=a; i++){
			if (mainland[a] != null){
				a++;
			}
		}
		
		return a;
	}
	}
