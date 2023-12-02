package javainterviewprogram;

import java.util.Scanner;

public class primenumberornot {
	
	public static void main(String[] args)
	{
        int num=665657;
        boolean Prime = true;
        if (num%2 == 0) 
           Prime = false;   
        if(Prime) 
        {
            System.out.println(num+" number is prime");
        }
        else
        {
          System.out.println(num+" number is not a prime");
        }
        
    }
	}


