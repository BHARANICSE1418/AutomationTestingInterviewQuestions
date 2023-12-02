package javainterviewprogram;

import java.util.Scanner;

public class FahrenheittoCelsius {
	
	
	public void Polindrom()
	{
		int[] num= {2,3,4,-5};
		
		int high=Integer.MIN_VALUE; int shigh=0;
		
		for(int n:num)
		{
			if(n>high)
			{
				shigh=high;
				high=n;
			}
		}
		System.out.println(high);
		System.out.println(shigh);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float temp = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Temparature");
		temp= input.nextFloat();
		
		temp=((temp-32)*5)/9;
		System.out.println(temp);
		
		FahrenheittoCelsius rev=new FahrenheittoCelsius();
		rev.Polindrom();
	
	
	}

}
