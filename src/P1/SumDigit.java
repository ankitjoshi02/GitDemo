package P1;
import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
	    int num=sc.nextInt();
	    int sum=0;
	    while(num>0)
	    {
	    	int d=num%10;
	    	sum=sum+d;
	    	num=num/10;
	    }
	    System.out.println("in given number the sum of digits is : "+sum);
	}

}
