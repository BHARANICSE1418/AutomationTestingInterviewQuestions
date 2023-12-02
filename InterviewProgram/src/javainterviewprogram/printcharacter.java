package javainterviewprogram;

public class printcharacter {
	
  public void printcharforeach()
  {
	  
	  String a="bharani";
	  int count=0;
	  char[] chararray=a.toCharArray();
	  
	 for(char c:chararray)
	 {
		 count++;
		 System.out.print(c+" ");
	 }
	 System.out.println(count);
	 System.out.println(a.length());
	
	 
  }
  
  public void printcharfor()
  {

	  String a="bharanidharan murugesan";
	  int count1=0;
	 
	 for (int i = 0; i < a.length(); i++)
	 {
		    char character = a.charAt(i);
		    count1++;
		    System.out.print(character + " ");
		}
	 System.out.println(count1);
	 System.out.println("------------------");
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printcharacter character1= new printcharacter();
		character1.printcharforeach();
		character1.printcharfor();
	}

}
