package P1;
import java.util.*;
public class FcatSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
			System.out.println("enter a number");
			int a=in.nextInt();
			int count=1;
			int sum =0;
			while(count<a)
			{
				if(a%count==0)
				{
					sum=sum+count;
				}
				count++;
			}
			if(sum==a)
			
				{System.out.println(a+" is a perfect number");}
				else
				{System.out.println(a+" is not a perfect number");}
		}
	}
	


