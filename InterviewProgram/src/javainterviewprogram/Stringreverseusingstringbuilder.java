package javainterviewprogram;

public class Stringreverseusingstringbuilder 
{

	 Stringreverseusingstringbuilder (String b)
     {
    	 StringBuffer bu= new StringBuffer(b);
    	 bu.reverse();
    	 System.out.println(bu);
     }
	 public void stringbuffer(String str)
	{
		
		StringBuffer  str1 = new StringBuffer(str);
		str1.reverse();
		System.out.println("String Reverse Using StringBuffer = "+str1);			
	}
	 
	 public void stringbuilder()
	 {    
		 StringBuilder  st = new StringBuilder("bharanidharan");
		 st.reverse();
		 System.out.println("String Reverse Using StringBuilder= "+st);		 
	 }
	 
	 public void addstringend()
	 
	 {      String str ="Bharanidharan";    
	        StringBuffer  str1 = new StringBuffer(str);
		    str1.append(" Murugesan");
			String str2=str.concat(" Murugesan");
			System.out.println("The Append last is = "+str1);
			System.out.println("The Concat last is=  "+str2);	 
	 }
     public void addstringfirst()
	 
	 {      String str ="Bharanidharan";  
	        String s1="Thill ";
	        StringBuffer  str1 = new StringBuffer(str);
            str1.insert(0,s1);
			System.out.println("The add string first is = "+str1);			 
	 }
     public void addstringmiddle(String str, String s1)
	 
	 {      
	        StringBuffer  str1 = new StringBuffer(str);
            str1.insert(7,s1);
			System.out.println("The add string middle is = "+str1);			 
	 }
     
    
     
	 
	 
	 public static void main(String[] args)
	 {
	
	 Stringreverseusingstringbuilder stringbufandbul= new Stringreverseusingstringbuilder("inarahb");
	 stringbufandbul.stringbuffer("Bharanidharan");
	 stringbufandbul.stringbuilder();
	 stringbufandbul.addstringend();
	 stringbufandbul.addstringfirst();
	 stringbufandbul.addstringmiddle("Bharanidharan"," good ");
	 

	 }
	 
}
