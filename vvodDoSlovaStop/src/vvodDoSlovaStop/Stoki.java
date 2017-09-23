package vvodDoSlovaStop;
import java.util.Scanner;
public class Stoki {

	public static void main(String[] args)
	{
		
		System.out.println("Введите слово.");
				scan ();
	}
	
	public static void scan () 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while (1>0){
			String stroka = sc.nextLine();
			String s= new String("stop");
			
		if (s.equals(stroka)) 
		{
			break;
		}
		else {
			System.out.println("Вы ввели: " + stroka);
			System.out.println("Введите слово.");
			}
		}
		
	}

}
