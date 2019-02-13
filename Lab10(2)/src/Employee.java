
import java.io.Serializable;
import java.util.*;
import java.util.Scanner;

public class Employee implements Serializable

{
	int id;
	String name,desig;
    float salary;
    
	Employee() {
		
	           }
	
	public static void main(String args[])
	{
		int id;
		String name,desig;
        float salary;

	Scanner sc=new Scanner(System.in);
	Employee em=new Employee();
	System.out.println("Enter no of employees");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
	System.out.println("Enter id");
	    id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Salary");
		salary=sc.nextFloat();
		System.out.println("Designation");
		 desig=sc.next();
		try {
			if(salary<3000)
				throw new ExceptionCheck();
			
			
			Employee e=new Employee(id,name,desig,salary);
			
			
			//em.inputFile(e);
			
		     }
	catch(ExceptionCheck a)
		{
		System.out.println(a);
		}
		
		
}
	//Employee e=new Employee();
//em.outFile();	
		

}
	
	public Employee(int id, String name, String desig, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
}