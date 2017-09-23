package by.hpt.massiv;

public class Matrica {

	int[][] a;
	int[] b;
	int d;

	public int[][] randM() {
		a = new int[7][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 20);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		return a;

	}

	public void zamena(int b, int c) {

		for (int i = 0; i < a[b].length; i++) {
			d = a[b][i];
			a[b][i] = a[c][i];
			a[c][i] = d;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void poiskMaxStolbca() {

		d = 0;
		b = new int[5];
		int k=0;
		for (int i = 0; i < a[k].length; i++) {
			for ( int j=0; j < 7; j++) {
				d =a[j][i];
				if(d>b[i]){
					b[i]=d;
				}
			}
			
		}

		System.out.println("MAX iz stolbcov: ");
		for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
		}
		
	}
	
	public int poiskX(int x){
		int amount=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(x==a[i][j]){
					amount++;
				}
			}
		}
		
		return amount;
		
	}
	

}
