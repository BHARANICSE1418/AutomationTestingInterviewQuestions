package javainterviewprogram;



public class Splitwithoutusingsubstring 
{
	public void splitstring1()
	{

		String input = "bha123rani456sha789lini";
		char[] chararray=input.toCharArray();
		System.out.println(chararray);
       
		StringBuffer number= new StringBuffer();
		StringBuilder character= new StringBuilder();
		
        for (char c: chararray ) 
        {
            if (Character.isDigit(c))
            {
               number.append(c);
            }
            if (Character.isAlphabetic(c))
            {
            	character.append(c);
            }
        }
        System.out.println("Number--"+number); 
        System.out.println("Character--"+character);
     }
	public void splitstring2()
	{
		String str="Manual Testing, Automation Testing, Selenium, Cucumer, TestNG";
		String[] parts=str.split(" ");
		for(String part:parts )
		{
			System.out.println(part);
		}	
		
		System.out.println("----------------------------------------------------");
		String str1="ManualTesting AutomationTesting Selenium Cucumer TestNG";
		String[] parts1=str1.split(" ");
		for(String part1:parts1 )
		{
			System.out.println(part1);
		}
	}
		public void concatethreestring()
		{
			System.out.println("----------------------------------------------------");
			String s1="ABC"; String s2="DEF"; String s3="GHI";
			String s4=s1.concat(s2);
			String s5=s4.concat(s3);
			System.out.println(s5);
			
			System.out.println("----------------------------------------------------");
			String s6=s1.concat(s2).concat(s3);
			System.out.println(s6);
			
		}
	
	
	
	public static void main(String[] args) 
	{
		
		Splitwithoutusingsubstring Public= new Splitwithoutusingsubstring();
		Public.splitstring1();
		Public.splitstring2();
		Public.concatethreestring();
		
	}
}