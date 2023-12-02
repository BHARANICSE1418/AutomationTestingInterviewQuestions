package javainterviewprogram;

public class findfirstlargestnumber 
{
	public void  MAXfindFirst_number()
	 {
		int[] numbers = {-3,-2,9,-1,0,1,2,3,-5};
        int highest = Integer.MIN_VALUE;
        System.out.println(highest);
        for (int num: numbers)
        {
            if (num > highest) 
            {
                highest=num;
            }
        }
        System.out.println("The first highest number is: " + highest);

       int lowest = Integer.MAX_VALUE;
       System.out.println(lowest);
       for (int num: numbers) 
       {
           if (num < lowest) 
           {
        	    lowest=num;
           }
       }
       System.out.println("The first highest number is: " + lowest);

     }
	 public static void main(String[] args)
	 {
		 findfirstlargestnumber n= new findfirstlargestnumber();
		 n.MAXfindFirst_number();
		 
	 }
}