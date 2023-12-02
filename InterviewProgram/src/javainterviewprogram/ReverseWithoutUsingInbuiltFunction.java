package javainterviewprogram;

public class ReverseWithoutUsingInbuiltFunction {
	public static void main(String[] args) {
        
		String str ="BHARANIDHARAN";
        int length = str.length();
        for(int i=length-1;i>=0;i--) 
        {
            System.out.print(str.charAt(i));          
        }
       
        
        System.out.println("");
        System.out.println("----------or----------------");
        
        StringBuffer buf=new StringBuffer(str);
        System.out.println(buf.reverse());
        

        System.out.println("");
        System.out.println("----------or----------------");
        
        char[] charlength=str.toCharArray();
        for(int k=charlength.length-1;k>=0;k--)
        {
        	System.out.print(str.charAt(k));
        }
        
        
}
}