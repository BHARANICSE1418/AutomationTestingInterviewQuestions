	package javainterviewprogram;

import java.util.Scanner;

public class Swaptwovaluenothirdvariable {

public void usingnumber()
	
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your integer value of a and b value");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Before Swapping "+a+" "+b);//10 20
	    a=a+b;// 10+20===> a=30
	    b=a-b;// 30-20===> b=10
	    a=a-b;// 30-10===> a=20
		System.out.println("After Swapping "+a+" "+b);//20 10
	}
	public void usingstring()
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your String value a and b value");
		String a = input.next();
		String b = input.next();
		System.out.println("Before Swapping "+a+" "+b);
	   
		a=a+b;                                                                      // a= tech(3) b=computer(7) 
		System.out.println("value "+a);                                            //  a=techcomputer(10)
	    b=a.substring(0,a.length()-b.length());                                   //  b= a.substring(0,10-7)===> a.substring(0,3) 
	    System.out.println("value b ="+b);                                       //   b= tech
	    a=a.substring(b.length());                                              //    a= a.substring(7)==>(end of string/last index)
	    System.out.println("value a ="+a);                                     //     a=computer

		System.out.println("After Swapping "+a+" "+b);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swaptwovaluenothirdvariable vari= new Swaptwovaluenothirdvariable();
		vari.usingnumber();
		vari.usingstring();

	}

}
