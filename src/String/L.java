package String;

public class L {

	public static void main(String[] args) {
		String s1="karnataka";
		char[]ch=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
