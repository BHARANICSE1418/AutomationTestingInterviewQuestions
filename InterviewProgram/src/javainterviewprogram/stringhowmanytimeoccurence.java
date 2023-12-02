package javainterviewprogram;



public class stringhowmanytimeoccurence
{

	public void stringhowmanytimespresent()
	{
		String name ="bharanidharan";
		int count = 0;

        for (int i = 0; i < name.length(); i++)
            if (name.charAt(i)=='a') 
            {
                count++;
                System.out.print(name.charAt(i));
            }

        System.out.println(" The character A is occurred " + count +" times in the string.");
    }
	public void givenstringpresentornot(String name)
	{
		
        System.out.println("The String is present="+name.contains("a"));
	}
	public void findstringinsentence()
	{
		   String S = "My Name isbharanidharan";
		  
	        System.out.println("The String is present="+S.contains("dharan"));
	        
	        String friend="bharanidharan and sridharan are good friend";
	       
	        String sub="dharan";
	      //  int count1=StringUtils.countMatches(friend,sub); // its present in stringutils- java apache 2.6 pack
	      // System.out.println("count=="+count1);
	        
	}
	public void  numberofvowels()
	{
		String vowels="bharanidharan murugesan"; int count=0;
		int length = vowels.length();
		System.out.println(length);
		for(int j=0;j<length;j++)
		{
			if(vowels.charAt(j)=='a'||vowels.charAt(j)=='e' || vowels.charAt(j)=='i'||vowels.charAt(j)=='o'||vowels.charAt(j)=='u')
			{
				count++;
			}
		}
		System.out.println("The total vowals is occurred " + count + " times in the string.");
	}
	public void  printallvowels()
	{
		String allvowels="bharanidharan"; 
		int length = allvowels.length();
		System.out.println(length);
		for(int k=0;k<length;k++)
		{
			if(allvowels.charAt(k)=='a'||allvowels.charAt(k)=='e' || allvowels.charAt(k)=='i'||allvowels.charAt(k)=='o'||allvowels.charAt(k)=='u')
			{
				System.out.print(allvowels.charAt(k));
				//System.out.print("The total vowals is occurred " +allvowels.charAt(k) + " times in the string.");
			}
		}
		
	}
		
	 public static void main(String[] args)
	 {
	 stringhowmanytimeoccurence time= new stringhowmanytimeoccurence();
	 time.stringhowmanytimespresent();
	 time.givenstringpresentornot("Bharanidharan");
	 time.findstringinsentence();
	 time.numberofvowels();
	 time.printallvowels();
	
}
}