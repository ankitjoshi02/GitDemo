package P1;
import java.util.Scanner;
public class CountOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			int b=num%10;
			if(b%2!=0)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println("count of odd digits is :"+count);
	}

}
