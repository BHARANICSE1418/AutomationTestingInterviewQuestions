package javainterviewprogram;

public class findduplicateinarraynumber {
	public static void main(String[] args) {
		
		int number[]= {1,2,3,4,5,6,7,1,2,3,4,5}; int count=0;
		
		for(int i =0; i<number.length;i++)
	    {
	    	for(int j= i+1; j<number.length;j++)
	    		
	        if (number[i] == number[j])
	         {
	    	 System.out.print(number[j]+" ");  
	    	 count++;
	    	 
	          }
	    }
		System.out.println("count=="+count);
	}
}
