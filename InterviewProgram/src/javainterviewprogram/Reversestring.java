package javainterviewprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Reversestring {

	public void stringrev()
	 {
		// TODO Auto-generated method stub
		
		String str="bharani";
		char[] charlength = str.toCharArray();
		for(int i=charlength.length-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println(" ");
		
	 }
		
		public void integerrev()
		 {
			
			
			int number=123;  
			
						
			while(number!=0)
			{
				int digit=number%10; 
				System.out.print(digit);
				number=number/10; 
			}
			System.out.println();
				
		}
		public void arraynumreverse()
		{
			int num[]= {5,4,3,2,1,0};
			Arrays.sort(num);
			for(int a:num)
			{
				System.out.print(a);
			}
		}
	 
	 public static void main(String[] args)
	 {
		 StringBuffer  rev = new StringBuffer("bharanidharn");
		 rev.reverse();
		 System.out.println("The Reverse is="+rev);
		 
		 Reversestring str1= new Reversestring();
		 str1.stringrev();
		 str1.integerrev();
		 str1.arraynumreverse();
		 
	 }
}