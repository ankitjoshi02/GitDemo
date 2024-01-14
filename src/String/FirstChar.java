package String;

public class FirstChar {

	public static void main(String[] args) {
		String s1="how are you";
		String [] a=s1.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String s=a[i];
			System.out.println("The first letter of "+(i+1)+" word is "+s.charAt(0));
		}

	}

}
