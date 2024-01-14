package String;

public class VowelsU 
{
	public static void main(String[] args) 
	{
	String s1="EvEnIng";
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			count++;
		}
	}
	System.out.println(count);
	}
}
