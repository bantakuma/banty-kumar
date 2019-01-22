import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i,fact=1;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);

	}

}
