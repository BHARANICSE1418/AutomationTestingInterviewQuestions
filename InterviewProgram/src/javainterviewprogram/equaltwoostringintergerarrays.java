package javainterviewprogram;

import java.util.Arrays;
import java.util.Scanner;

public class equaltwoostringintergerarrays {

	public static void main(String[] args) {
		int number1=10; int number2=10;
		int[] array1= {1,2,3};  int[] array2= {1,2,3};
		
		if(number1==number2) //Number
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("not ok");
		}
		if(Arrays.equals(array1, array2)) //Array
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("not ok");
		}
		Scanner sc= new Scanner(System.in);
		System.out.print("Ente your s1= ");String s1=sc.next();
		System.out.print("Ente your s2= ");String s2=sc.next();
		if(s1.equals(s2)) //String
		{
			System.out.println("ok");
		}
		else 
		{
			System.out.println("not ok");
		}
		
		

	}

}
