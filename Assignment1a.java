import java.util.Scanner;
public class Assignment1a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the students's marks");
		int a=sc.nextInt();
		
		if(a==50) 
		{
			System.out.println("student is pass in the examination");
		}
		else if(a>60 && a<74) 
		{
			System.out.println("first class");
		}
		else if(a>75)
		{
			System.out.println("distiction");
		}
		else
		{
			System.out.println("fail in the exam");
		}
		

	}

}
