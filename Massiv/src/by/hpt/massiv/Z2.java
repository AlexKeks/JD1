package by.hpt.massiv;

public class Z2 {

	
		static int []a= new int[]{327,381,891,918,212,848,770,363,416,736};
		
		public static void pr()
		{
			for (int c = 0; c < a.length; ++c) 
				System.out.print(a[c] + " ");
			}
		//поиск макс
	public void delNaMax(){
		int max = 0;
		int indMax = 0;
		
		for(int j =0; j!=a.length; j++){
		if (max < a[j]) {
			max = a[j];
			indMax = j;
			}
		}
		System.out.println("max: " +a[indMax]);
		//деление на наиб
		double sum = 0;
		for(int i =0;i!=a.length;i++){
			sum =a[i];
			double del = sum/a[indMax];
			System.out.println("деление на макс: "+del);
			}
	
		
		
		
		
	}
		
	}

