import java.util.Scanner;
public class Power10 {
	static void check(int n)
	{
		while(n>10)
		{
			if(n>10)
			{
				n=n/10;
			}
		}
		
		if(n<10)
			System.out.println("not power of 10");
			else 
			System.out.println("power of 10");
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number to be check");
		
		int num=scan.nextInt();
		check(num);

	}

}
