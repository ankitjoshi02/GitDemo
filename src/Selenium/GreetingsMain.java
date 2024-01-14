package Selenium;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings gr=new Greetings();
		gr.greeting1();
		gr.greeting3("John");
		System.out.println(gr.greeting4("how are you"));
	}

}
