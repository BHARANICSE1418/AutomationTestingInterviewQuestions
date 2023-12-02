package javainterviewprogram;

public class printallalphabetonly {

	public static void main(String[] args) {
		for(char alphabet='A' ;alphabet<='Z';alphabet++)
		{
			System.out.print(" "+alphabet);
		}
		for(char alphabet='a' ;alphabet<='z';alphabet++)
		{
			System.out.print(" "+alphabet);
		}
		for(int integer = 0;integer<=5;integer++)
		{
			System.out.print(" "+integer);
		}
		System.out.println(" ");
		for(char alphabet = 'Z' ;alphabet>='A';alphabet--)
		{
			System.out.print(" "+alphabet);
		}
		for(char alphabet = 'z' ;alphabet>='a';alphabet--)
		{
			System.out.print(" "+alphabet);
		}
		for(int integer = 5 ;integer>=0;integer--)
		{
			System.out.print(" "+integer);
		}
	}

}
