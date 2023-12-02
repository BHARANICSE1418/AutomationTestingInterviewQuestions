package javainterviewprogram;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		
		int fact=1; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
	    int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			 fact=fact*i;
		     System.out.print(" "+fact);
		}
     
	}

}
