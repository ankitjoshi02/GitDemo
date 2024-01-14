package String;

public class FirstLetter {

	public static void main(String[] args) {
		String s1="tata bye khtm";
		s1=' '+s1;
		String s2="";
		for (int i=0;i<s1.length();i++)
		{
				char a=s1.charAt(i);
				if(a==' ')
				s2=s2+(s1.charAt(i+1));
		}
		System.out.println(s2);
	}
}
