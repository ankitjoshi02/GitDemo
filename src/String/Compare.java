package String;

public class Compare {

	public static void main(String[] args) {
		String s1="hi";
		String s2=new String("hi");
		System.out.println(s1.compareTo(s2));
		String s3="hello";
		String s4=new String("Hello");
		System.out.println(s3.compareTo(s4));
		String s5="Bye";
		String s6=new String("bye");
		System.out.println(s5.compareTo(s6));
	}

}
