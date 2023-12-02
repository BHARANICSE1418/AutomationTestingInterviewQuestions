package javainterviewprogram;

import java.util.Scanner;

public class findthegivennumberpresentornotusingarray 
{

	public static void main(String[] args)
	{
	int[] number= {10,12,58,36,96,102,78,3,5,56,6};
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your number: ");
	int givennumber=sc.nextInt();
	boolean found =false ; 	
	for(int i:number)
	{
    if(i==givennumber)
		 found =true;
	}
	System.out.println("number status= "+found);
	
	if(found)
	{
		System.out.println("present");}
	else
	{
		System.out.println("not present");	}
	}		
}
