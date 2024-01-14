package Selenium;

public class StringOperations {
	public static void main(String[] args) {
		String s="automation";
		String t="automation";
		String a="welcome to selenium Automation testing";
		String b="Back";
		String c="abc@gmail.com";
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.charAt(2));
		System.out.println(s.contains("auto"));
		System.out.println(s.equals(t));
		System.out.println(s.equalsIgnoreCase(t));
		System.out.println(a.replace('e', 'X'));
		System.out.println(a.replace("selenium", "java"));
		String x[]=c.split("@");
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(t.toLowerCase());
		System.out.println(s==t);
		System.out.println(s.equals(t));
		
		String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
