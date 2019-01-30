package com.capgemini.Lab3;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Warrenty {
	

		public static void main(String args[])
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter date of purchase in dd/mm/yyyy");
			String p_date=sc.next();
			System.out.println("Enter months and years of warranty");
			int m=sc.nextInt();
			int y=sc.nextInt();
		DateTimeFormatter frm=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld=LocalDate.parse(p_date,frm);
		System.out.println("Expiry date "+ld.plusMonths(m).plusYears(y));
		


		}
		
		
	}

