package by.hpt.massiv;

public class Z3 {
	
	
	double sum=0;
	
	public void mas(){
		double []a=  { -1.49,0.50,-4.70,-1.08,-4.95,1.14,-2.46,2.61,-3.14 , 4.35,0.52,1.24,4.29,-2.39,-3.95,-4.91,-4.35,3.60,2.50,-0.21 };
		{
		for (int c = 0; c < a.length; ++c) 
			System.out.print(a[c] + " ");
	}
	double[]b = new double[6];
	int j = 0;
			for(int i=1;i<a.length; i+=2){
			if(a[i]>0){
				b[j]=a[i];
				j++;
				sum = sum+ Math.pow(a[i], 2) ; 
			}
		}
		System.out.println(" ");
			for (int c = 0; c < b.length; ++c) 
				System.out.print(b[c] + " ");
			System.out.println("Summa: " + sum);
		
		
	}
	

	

}
