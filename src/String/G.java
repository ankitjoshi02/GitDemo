package String;

public class G 
{
	public static void main(String[] args) 
	{
		String s1="evening";
		String s2=new String("evening");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
