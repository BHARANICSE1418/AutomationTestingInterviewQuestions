 package javainterviewprogram;

public class fibanocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=0,b=1,c,i,number=5;
		
		System.out.print(a+" "+b);
		for(i=1;i<number;i++)
		{
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	    }

}
}