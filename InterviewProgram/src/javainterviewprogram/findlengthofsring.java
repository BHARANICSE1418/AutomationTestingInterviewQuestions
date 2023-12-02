  package javainterviewprogram;

public class findlengthofsring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number[]= {1,2,3,4,5};
		System.out.println("Number length="+number.length);
		
		String name="BHARANI";
		System.out.println("Name length="+name.length());
		
		int strlength=name.length();
		for(int i=0;i<strlength;i++)
		{
	         System.out.println(name.charAt(i));

		}
		for(int j:number)
		{
			System.out.print(j);
		}
		
		
	}

}
