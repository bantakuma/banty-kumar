package com.capgemini.Lab3;
import java.util.Scanner;

public class StringOddDuplicate {
	public static void main(String args[])
		{
			String str;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter string");
			str=in.nextLine();
			System.out.println("Add string to itself");
			String str1=str+str;
			System.out.println(str1);
			
			System.out.println("Replace odd places");
			
			char arr[]=str.toCharArray();
			int l=arr.length;
			for(int i=1;i<=l;i++)
			{
				if(i%2!=0)
					arr[i]='#';
			}
			System.out.println(arr);
			
			System.out.println("Remove duplicate char");
			char arr1[]=str.toCharArray();
			l=arr.length;
			char min;
			for(int i=1;i<=l;i++)
			{
				min=arr1[i];
				for(int j=i+1;j<=l;j++)
				{
					if(min==arr[j])
						arr1[j]=arr1[j+1];
				}
			}
			System.out.println(arr1);
			
			System.out.println("odd chars to uppercase");
			l=arr.length;
			for(int i=1;i<=l;i++)
			{
				if(i%2!=0)
					arr[i]=Character.toUpperCase(arr[i]);
			}
			System.out.println(arr);
			
			
			
			in.close();
			
		}
		
	}

