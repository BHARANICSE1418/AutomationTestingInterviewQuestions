package javainterviewprogram;

public class arrayoddandeven 
{

	public void oddeven()
	{
		int a[]= {1,2,3,4,5};
		
		for(int num: a)
		{
			
			if(num%2==0)
			{
				System.out.println(num+"=even ");
			}
			//if(num%2!=0)
			else
			{
				System.out.println(num+"=odd ");

			}
		}
	}
	
	public void oddevenadd()
	{
		int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        int sum = 0;
        for (int numa:a) 
        {
            if (!(numa % 2 == 0)) 
            {
                sum=sum+numa;
            }
        }

        for (int numb :b) {
            if (!(numb % 2 == 0)) 
            {
               sum=sum+numb;
            }
        }
       

        System.out.println("Sum of odd numbers from both arrays: " + sum);
	}
		
		public static void main(String[] args) 
		{
			arrayoddandeven e=new arrayoddandeven();
			e.oddeven();
			e.oddevenadd();
		}
	

}
