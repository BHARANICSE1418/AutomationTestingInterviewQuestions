package javainterviewprogram;

import java.util.Scanner;

public class findaddoreven {
	
	public static void main (String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Your number");
	int num=input.nextInt();
	if(num%2==0)
	{
		System.out.println("The Number is even");
	}
	else 
	{
		System.out.println("The Number is odd");
	}

}
}