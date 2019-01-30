package com.capgemini.Lab3;
import java.util.Scanner;

public class PositiveString {

		public static void main(String[] args) {
			PositiveString p=new PositiveString();
			p.Check();
			
	                                            }

		void Check() {
		int j,k=0;
		
		String str;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
			char charr[]=str.toCharArray() ;
			int l=charr.length;
			for(int i=0;i<l;i++)
			{
				j=(int)charr[i];
				k=(int)charr[i+1];
				if(k>j)
				{
					
				}
				else {System.out.println("Not Positive");
					break;}
			}
		
		
		
		
		}
	}

