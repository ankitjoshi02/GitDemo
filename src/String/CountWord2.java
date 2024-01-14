package String;

public class CountWord2 {

	public static void main(String[] args) {
		String s1="how are you";
		int count=0;
		char [] a=s1.toCharArray();
		for (int i=0;i<a.length;i++)
		{
			String s="";
			while(i<a.length && a[i]!=' ')
			{
				s=s+a[i];
				i++;
			}
			if(s.length()>0)
			{
				System.out.println(s+" is "+s.length());
			}
		}
	}

}
