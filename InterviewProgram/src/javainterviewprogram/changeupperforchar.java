package javainterviewprogram;

public class changeupperforchar {

	public void changesinglechar()
	 {
		// String = ‘AaBbCcDD’, In that change a lowercase ‘a’ to uppercase
		
		String str="AaBbCcDd";
		System.out.println("Original String= "+str);
		char[] con=str.toCharArray();
		for(int i=0;i<con.length;i++)
		{
			if(con[i]=='a')
			{
				con[i]='A';	
			}
				
		}
		System.out.print(con);	
	 }
	public void changeallchar()
	 {
		// String = ‘AaBbCcDD’, In that change all lowercase AABBCCDD to uppercase
		
		String str="AaBbCcDd";
		System.out.println(" ");
		System.out.print("All uppercase= "+str.toUpperCase());
	 }
	public void changesingleandsamechar()
	 {
		// String = ‘AaBbCcDD’, In that change AaBaCaDa
		
		String str="AaBbCcDd";
		System.out.println("Original String= "+str);
		char[] con=str.toCharArray();
		for(int i=0;i<con.length;i++)
		{
			if(con[i]=='a'|con[i]=='b'|con[i]=='c'|con[i]=='d')
			{
				con[i]='A';	
			}
				
		}
		System.out.print(con);
	 }
	
	 
	 public static void main(String[] args)
	 {
		 changeupperforchar k=new changeupperforchar();
		 k.changesinglechar();
		 k.changeallchar();
		 k.changesingleandsamechar();
	 }

}
