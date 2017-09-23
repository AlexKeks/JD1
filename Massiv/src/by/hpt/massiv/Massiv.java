package by.hpt.massiv;

public class Massiv {
	private int x;
	int[] a;
	int[] b;

	public Massiv(int x) {
		this.x = x;
	}

	public void in() {
		a = new int[x];
System.out.println("исходник");
		for (int i = 0; i < x; i++) {
			a[i] = i + 1;
			 System.out.println(a[i]);
		}

	}

	public void del() {
		for (int i = 0; i < a.length; i++)
			if (i % 2 == 0) {
				a[i] = 0;

				 if(i<24)
				 System.out.println(a[i+1]);

			}
	}

	public void newM(int y) {
		System.out.println("уменьшенный мас");
		b = new int[y];
		int j =0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0){					
				b[j] = a[i];
				//System.out.println("j " +j);
				System.out.println(b[j]);
				j++;
			}			
		}
				
	//}
		/* for (int i = 0; i < a.length; i++) {

			   for (int j = 0; j < b.length; j++) {
			    if (a[i] != 0) {
			     b[j] = a[i];
			     System.out.println(b[j]);
			     break;
			    } else
			     continue;
			   }
		 }*/
		
		
		
		
		
		
	}
	public void v(int y){
		
		System.out.println(b[y]);
		
	}
}

