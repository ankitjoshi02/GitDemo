package String;

public class Driver1 
{

	public static void main(String[] args) {
		Employee e1=new Employee("Mali",1,5000.0);
		Employee e2=new Employee("savi",2,4000.0);
		Employee e3=new Employee("kali",3,3000.0);
		Employee[]e= {e1,e2,e3};
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Name :"+e[i].name);
			System.out.println("eid :"+e[i].eid);
			System.out.println("Salary :"+e[i].salary);
			System.out.println("---------------------");
		}
	}
}
