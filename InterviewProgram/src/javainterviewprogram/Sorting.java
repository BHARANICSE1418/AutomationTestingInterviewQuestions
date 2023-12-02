package javainterviewprogram;

import java.util.Arrays;
import java.util.Collections;

public class Sorting 
{
	    public void sortingnumber()
	    {
		int number[] ={90, 23, 5, 109, 12, 22, 67, 34,-9}; 
		Arrays.sort(number); 
		System.out.println(" ");
		for(int a: number)
		{
			System.out.print(a+" ");
		}		
	    }
		
		public void sortalphabet()
		{
		String[] month= {"December","February","March","April","May","June","July",
		            "August","September","October","November","January"};
		Arrays.sort(month);
		for (int i = 0; i < month.length; i++)   
		{       
		System.out.print(month[i]+" ");   
		}  
		
		}
		
		public static void main(String[] args)
		{
			Sorting sort= new Sorting();
			sort.sortalphabet();
			sort.sortingnumber();
			
			
		}	
}
