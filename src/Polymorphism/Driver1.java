package Polymorphism;

public class Driver1 {

	public static void main(String[] args) 
	{
		debitCard c1=new debitCard();
		SwipingMachine m1=new SwipingMachine();
		m1.SwipeCard(c1); 
		CreditCard c2=new CreditCard();
		m1.SwipeCard(c2);
	}

}
