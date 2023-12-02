package javainterviewprogram;

public class findduplicatestring {

	public static void main(String[] args) {
		
		String str ="Bharanidharan"; int c=0;
	    char[] chararray = str.toCharArray();
	    System.out.println(chararray.length);
	    
	    System.out.print("Duplicate Characters in above string are: ");
	    for(int i=0; i<chararray.length;i++)
	    {
	    	for(int j=i+1; j<chararray.length;j++)
	    		
	      if (chararray[i] == chararray[j])
	      {
	    	 System.out.print(chararray[i]+" "); 
	    	 c++;
	    	 
	      }	   
	    }
	    System.out.println("Char Count="+c);

	}

}
