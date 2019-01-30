
	package com.capgemini.Lab3;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;

	import java.util.Scanner;
	import java.time.*;
	public class DatePr {

		String dt;
		Scanner in =new Scanner(System.in);
		
		public static void main(String args[]) {
		
			DatePr d=new DatePr();
		}
		
		DatePr()
		{
			System.out.println("Enter date");
			dt=in.nextLine(); 
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDate ld=LocalDate.now();
			LocalDate usd=LocalDate.parse(dt,formatter);
			Period pd=ld.until(usd);
			System.out.println(pd);
		}
		
		
		
		
		

}
