package javainterviewprogram;

public class Test 
{
	
	public static void main(String args[])
	{  //duplicate char
		
		String s="bharani"; int count=0;
		
		int length=s.length();
		
		for(int i=0;i<length;i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
	}
	

}
