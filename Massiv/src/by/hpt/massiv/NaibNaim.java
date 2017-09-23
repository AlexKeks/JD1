package by.hpt.massiv;

public class NaibNaim {

	int x;
		
	public NaibNaim(int x) {
		this.x = x;
	}
	
		int[] a = new int[]{2,11,3,10,5,12,7};{
		for (int c = 0; c < a.length; ++c) 
			System.out.print(a[c] + " ");
		}
			
	public void poisk() {

		int y;
		int min= a[0];
		int indMin = 0;
		for(int i =0; i!=a.length; i++){
		if (min>a[i]) {
			min = a[i];
			indMin=i;
			}
		} 
				
		int max = 0;
		int indMax = 0;
		for(int j =0; j!=a.length; j++){
		if (max < a[j]) {
			max = a[j];
			indMax = j;
			}
		}
		//перемена мин и макс местами
		System.out.println("\nmax: " + a[indMax]+" min: " + a[indMin]);
		y=a[indMax];
		a[indMax]=a[indMin];
		a[indMin]=y;
		System.out.print("\nmin izmen na max: ");
		for (int c = 0; c < a.length; ++c) {
			System.out.print(a[c] + " ");
		}
	}

}
