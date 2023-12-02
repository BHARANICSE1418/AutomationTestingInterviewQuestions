package javainterviewprogram;

import java.util.Scanner;

public class palindrome {
	
	
	public void lengthway()
	
	{
		String str="opo", reverse ="";     
		int strlength = str.length();
        
		for (int i=strlength-1;i>=0; i--)
		{
	   reverse = reverse + str.charAt(i);
        }
        System.out.println("reverse using lenth is:" +reverse);
         
        if(str.equals(reverse)) 
            System.out.println("The String is palindrome");
        else
            System.out.println("The String number is not a palindrome");
         
    }
   public void Chararrayway()
	
	{
		String str="oppo", reverse ="";     
        char[] chararray=str.toCharArray();
       
		for (int i=chararray.length-1;i>=0; i--)
		{
	   reverse = reverse + str.charAt(i);
        }
        System.out.println("reverse using lenth is:" +reverse);
         
        if(str.equals(reverse)) 
            System.out.println("The String is palindrome");
        else
            System.out.println("The String number is not a palindrome");
         
    }
	
	public static void main(String[] args) 
	{ 	
		palindrome poli = new palindrome();
		poli.lengthway();
		poli.Chararrayway();
		
	}

}
