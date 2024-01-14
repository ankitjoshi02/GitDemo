package String;

public class S {

	public static void main(String[] args) {
		S obj1=new S();
		S obj2=new S();
		S obj3=new S();
		
		S[]arr=new S[3];
		arr[0]=obj1;
		arr[1]=obj2;
		arr[2]=obj3;
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
