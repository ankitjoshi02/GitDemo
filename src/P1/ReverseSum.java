package P1;
import java.util.Scanner;
public class ReverseSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int b=num%10;
		    num=num/10;
			int c=num%10;
			sum=sum+b*10+c;
		}
		System.out.println("the sum of digits in given number is ;"+sum);
	}

}
