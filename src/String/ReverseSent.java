package String;

public class ReverseSent {

	public static void main(String[] args) {
		String s1="how are you";
		String s2=" ";
		for (int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		s2=s2.trim();
		System.out.println((s2));
	}

}
