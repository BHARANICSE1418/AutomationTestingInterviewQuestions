package javainterviewprogram;


public class numbersplit {

	public static void main(String[] args) {
		
		int number=54321; 
		
		while (number!=0)   
		{  
		int digit=number%10;  
		//System.out.print(" ");  
		System.out.print(digit); 
		number=number/10;  
		}
		
		
	}

}
