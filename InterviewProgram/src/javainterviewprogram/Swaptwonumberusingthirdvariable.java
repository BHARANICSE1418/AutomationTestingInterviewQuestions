package javainterviewprogram;

import java.util.Scanner;

public class Swaptwonumberusingthirdvariable {

	public void usingnumber()
	
	{
		int a, b, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your int a and b value");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("Before Swapping "+a+" "+b);  // a=10  b=20
	    temp=a;   //temp=10
		a=b;   //a=20
		b=temp; //b=10
		System.out.println("After Swapping "+a+" "+b); //a=20  b=10
	}
	public void usingstring()
	{
		String a, b, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string a and b value");
		a = input.next();
		b = input.next();
		System.out.println("Before Swapping "+a+" "+b); //a=bha b=sha
	    temp=a; //temp=bha
		a=b; //a=sha
		b=temp; //b=bha
		System.out.println("After Swapping "+a+" "+b); // a=sha b=bha
	
	}

	public static void main(String[] args)
	{
		Swaptwonumberusingthirdvariable swap = new Swaptwonumberusingthirdvariable();
		swap.usingnumber();
		swap.usingstring();
	}
}
