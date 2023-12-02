package javainterviewprogram;

public class firstandsecondhighestarray {

	public void first()
	 {
		int[] array={-10,16,-5,0,5,10,12};
		int Firsthighest=Integer.MIN_VALUE;
		for(int n:array)
		{
			if (n>Firsthighest)
			{
				Firsthighest=n;	
			}
		}
		System.out.println("the First highest number of an array= "+Firsthighest);
	}
	public void firstandsecondhighest()
	 {
		
		int[] array={-10,-5,0,5,10};
		int Firsthighest=Integer.MIN_VALUE; int Secondhighest=0;
		for(int n:array)
		{
			if (n>Firsthighest)
			{
				Secondhighest=Firsthighest;
				Firsthighest = n;	
			}
		}
		System.out.println("the First highest number of an array= "+Firsthighest);
		System.out.println("the Second highest number of an array= "+Secondhighest);
	}
	public void lowest()
	 {
		int[] array={-10,-5,0,5,10};
		int lowest=Integer.MAX_VALUE;
		
		for(int n:array)
		{
			if (n<lowest)
			{
				lowest=n;	
			}
		}
		System.out.println("the lowest number of an array= "+lowest);
	}
	public void firstandsecondlowest()
	 {
		int[] array={-1,-5,0,5,10};
		int firstlowest=Integer.MAX_VALUE;
		int secondlowest=0;
		
		for(int n:array)
		{
			if (n<firstlowest)
			{
				secondlowest=firstlowest;
				firstlowest = n;	
			}
		}
		System.out.println("the lowest number firstlowest of an array= "+firstlowest);
		System.out.println("the lowest number secondlowest of an array= "+secondlowest);

	}
	
	 
	 
	 public static void main(String[] args)
	 {
		 firstandsecondhighestarray find= new firstandsecondhighestarray();
		 find.first();
		 find.firstandsecondhighest();
		 find.lowest();
		 find.firstandsecondlowest();
		 
	 }

}
