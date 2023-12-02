package javainterviewprogram;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c, n;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mutiplication table number");
		n=input.nextInt();
		
		System.out.println("The multiplication Table= "+n);
		
		for(c=1;c<=10;c++)
		{
			System.out.println(c+"*"+n+" ="+(n*c));
		}
		
		

	}

}
