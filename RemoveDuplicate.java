import java.util.Scanner;
public class RemoveDuplicate {

	public static void main(String[] args) {
		String str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str1=sc.nextLine();
		String[] words=str1.split(" ");
		for(int i=0;i<words.length;i++)	
		{
			if(words[i]!=null)
			{
			
			for(int j=i+1;j<words.length;j++)
			{
				
			if(words[i].equals(words[j]))	
				{
					words[j]=null;			
				}
			}
			}
		}
		for(int k=0;k<words.length;k++)		
		{
			if(words[k]!=null)
			{
				System.out.print(words[k]+" ");
			}
			
		 }  

	   
		
		

	}

}



