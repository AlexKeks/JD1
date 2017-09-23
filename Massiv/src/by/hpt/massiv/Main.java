package by.hpt.massiv;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
				
		Matrica m = new Matrica();
		m.randM();
		Scanner sc = new Scanner(System.in);
		System.out.println("What strings to change?");
		int b = 0,c = 0;
		if(sc.hasNextInt()){
		b = sc.nextInt();
		c = sc.nextInt();
		}
		m.zamena(b-1, c-1);
		m.poiskMaxStolbca();
		System.out.println("\nEnter the number for counting");
		int x = sc.nextInt();
		System.out.println(m.poiskX(x));
		
		        		   
		
		
		
		/*
		Z3 m = new Z3();
		m.mas();
		*/
		
		
		
		
		/*
		Z2 z = new Z2();
		z.pr();
		z.delNaMax();
		*/
		
		
		
		
		
		/*
		NaibNaim mas = new NaibNaim(7);
		mas.poisk();
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*Massiv m = new Massiv(25);
		m.in();
		m.del();
		m.newM(12);
		m.v(3);
		*/

	}

	
	
	
	
	
	
}
