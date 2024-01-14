package P1;

public class CountEven {
	public static int even(int num)
	{
		int count=0;
		while(num>0)
		{
			int b=num%2;
			if(b%2==0)
			{
				count++;
			}
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args) {

		int r=even(2424);
		System.out.println("count of even digit is "+r);
		

	}

}
