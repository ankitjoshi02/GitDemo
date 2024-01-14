package P1;
import java.util.Scanner;
public class Position {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int k=1;
		while(num>0)
		{
			int b=num%10;
			System.out.println(b*k);
			k=k*10;
			num=num/10;
		}
	}

}
