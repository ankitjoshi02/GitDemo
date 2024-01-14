package Extra;

public class ifNested {

	public static void main(String[] args) {
		if(false) 
		{
			if(false) 
			{
				System.out.println("if is excecuted");
			}
			else {
			
				System.out.println("Else is excecuted");
			}
		}
		else
		{
			if(true)
			System.out.println("Xyz");
		}
	}
}
