package P1;
import java.util.Scanner;
public class A {
	public static void printSeries(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i+",");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int terms=sc.nextInt();
		printSeries(terms);
	}

}
