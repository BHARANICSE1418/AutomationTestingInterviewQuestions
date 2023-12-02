package javainterviewprogram;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		      String str1 = "eat";
		      String str2 = "ate";
		    
		      char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();
		      
		      Arrays.sort(charArray1); //aet
		      Arrays.sort(charArray2); //aet
		      
		      if(Arrays.equals(charArray1,charArray2)) 
		      {
		        System.out.println(str1 + " and " + str2 +" are anagram.");
		      }
		      else
		      {
		        System.out.println(str1 + " and " + str2 + "are not anagram.");
		      }
	}

}
