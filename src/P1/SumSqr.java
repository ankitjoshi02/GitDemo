package P1;

public class SumSqr {
	public static int sqrsm(int a)
	{
		int sum=0;
		while(a>0)
		{
			int b=a%10;
			int c=b*b;
			sum=sum+c;
			a=a/10;
		}
			return sum;
	}

	public static void main(String[] args) {
		int r=sqrsm(1234);
		System.out.println("Sum of given digit is "+r);
	}

}
