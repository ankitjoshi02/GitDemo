package P1;
import java.util.Scanner;
public class P2 {
	public static void printSeries2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(i*i*i+",");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no");
	int num=sc.nextInt();
	printSeries2(num);

	}

}
