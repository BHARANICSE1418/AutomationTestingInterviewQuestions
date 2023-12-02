package javainterviewprogram;

public class LengthConcatenateReplacetoLowerCaseremovespace {

	
	String name="          The People will always change our mind based on stituation";
	
	public void removewhitespace()
	{
		System.out.println("remove white space="+name.trim()+" in the world");
	}
	public void uppercaseandlowercaswe()
	{
		System.out.println("Uppercase="+name.trim().toUpperCase()+" in the world");
		System.out.println("Lowercase="+name.trim().toLowerCase()+" in the world");

	}
	public void lengthandreplace()
	{
		System.out.println("the lenght is= "+name.length());
		System.out.println("the replace is= "+name.trim().replace("mind","Thoughts"));
	}
	public void concatandsubstring()
	{   String s1="/some People";
		System.out.println("the connection is= "+name.trim().concat("in the word"));
		System.out.println("the Substring is= "+name.substring(58,68));
		StringBuffer  name1 = new StringBuffer(name.trim());
	    name1.insert(20,s1);
		System.out.println("The add string middle is = "+name1);		
	}
	public void substring1()
	{
		 String bo="bharani";
			System.out.println(bo.substring(5)); //ni
			System.out.println(bo.substring(0, 7)); //bharani
			System.out.println(bo.subSequence(0, 6)); //bharan
			System.out.println(bo.indexOf("n")); //5
			System.out.println(bo.charAt(5)); //n
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthConcatenateReplacetoLowerCaseremovespace string= new
		LengthConcatenateReplacetoLowerCaseremovespace();
		string.removewhitespace();
		string.uppercaseandlowercaswe();
		string.lengthandreplace();
		string.concatandsubstring();
		string.substring1();
	}

}
