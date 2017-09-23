package com.it.l2hw2;
//import java.util.Scanner;
public class SummaNaibNaim {

	public static void main(String[] args) 
	{
		System.out.println(sum (poiskMin(2,4,1), poiskMax(2,4,1)));
	}
		
	public static int sum(int a, int b)
	{
		int sum = a+b;
		return sum;
				
	}
			
	public static int poiskMin(int a, int b, int c)
	{
		int min = 0;
		if (a<=b&&a<=c)
		{
			min=a;
		}
		else if (b<=a&&b<c)
		{
			min=b;
		}
		else if (c<=a&&c<=b)
		{
			min=c;
		}
		return min;
	}
	
	public static int poiskMax(int a, int b, int c)
	{
		int max=0;
		if (a>=b&&a<=c)
		{
			max=a;
		}
		else if (b>=a&&b>=c)
		{
			max=b;
		}
		else if(c>=a&&c>=b)
		{
			max=c;
		}
		return max;
	}
	
}
	
	



