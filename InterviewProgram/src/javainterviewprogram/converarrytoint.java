package javainterviewprogram;

import java.util.Arrays;

public class converarrytoint 
{
	
		    int[] array= {5,4,3,7,2,1,6,8};
		    
		    public void convertarraytoint()
		    {
		    	
		    	for(int i=0;i<array.length;i++)
		    	{
		    		System.out.print(array[i]);
		    	}
		    	
		    	System.out.println(" ");
		    }
		    
		    public void convertarraytointsort()
		    {
		    	
		    	System.out.println("----Sorting number is------");
		    	Arrays.sort(array);
               
		    	for(int i:array)
		    	{
		    		System.out.print(i);
		    	}
		    }
		    public void convert()
		    {
		    	for (int number:array)
		    	{
		    		System.out.print(" ");
		    		System.out.print(number);
		    	}
		    }
		    
		    
		    
		    public static void main (String args[])
		    {
		    	converarrytoint ad= new converarrytoint();
		        ad.convertarraytoint();
		        ad.convertarraytointsort();
		        ad.convert();
		    }
		    
	        
	   

}
