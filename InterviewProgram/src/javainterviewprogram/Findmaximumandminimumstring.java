package javainterviewprogram;



public class Findmaximumandminimumstring 
{
	public static void main(String[] args)
	{
    
	int[] array= {56,-3,6,-2,-1,-25,0,1,2,-5,30};
		int highest=Integer.MIN_VALUE;
		int lowest=Integer.MAX_VALUE;	
		 
		for(int i: array )
		 {   
		if(i>highest) 
		   {
			highest=i;
		   }
			 
		if(i<lowest)
		  {
			lowest=i;

		  }	 
	    }
		System.out.println("maximum= "+highest+" minimum= "+lowest);		 
     }
	
}
