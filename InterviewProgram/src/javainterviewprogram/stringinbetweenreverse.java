package javainterviewprogram;

public class stringinbetweenreverse {
	
	public void reverseusingloop()
	{
		String str="hellow world! program java.";
		//output= "!dlrow wolleh .avaj margorp";
		
		String word1=str.substring(0, 13);
		
		char[] chararray1=word1.toCharArray();
		for(int i1=chararray1.length-1;i1>=0;i1--)
		{
			System.out.print(word1.charAt(i1));
		}
        
		String word2=str.substring(14, 27);
		
		char[] chararray2=word2.toCharArray();
		for(int i2=chararray2.length-1;i2>=0;i2--)
		{
			System.out.print(word2.charAt(i2));
		}
		System.out.println();
		
	}
	public void reverseusingbuffer()
	{
		String str="hellow world! program java.";
		String word1=str.substring(0, 13);
		StringBuffer buf1=new StringBuffer(word1);
		System.out.print(buf1.reverse());
		String word2=str.substring(14, 27);
		StringBuffer buf2=new StringBuffer(word2);
		System.out.print(buf2.reverse());	
	}
	
	
	public void reverhalf()
	{
		String str="i like java programming ";
		System.out.println("-------------------");
		String word1=str.substring(7, 24);
		String word2=str.substring(0, 6);
		System.out.println(word1.concat(word2));
		
		
	}
	
	public void phonenumber()
	{
        int j=0; String vowels="9788813367"; 
	    String v=vowels.substring(0);
		if(v.charAt(j)=='9'||v.charAt(j)=='8' || v.charAt(j)=='7'||v.charAt(j)=='6')
		{
			System.out.println("valid number "+vowels);
		}
		else
		{				
		    System.out.println("invalid "+vowels);
		}
	
	
   }
	
	

public static void main (String args[])
{
	stringinbetweenreverse j= new stringinbetweenreverse();
    j.reverseusingloop();
    j.reverseusingbuffer();
	j.reverhalf();
	j.phonenumber();
}
}