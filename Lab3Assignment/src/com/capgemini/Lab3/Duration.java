package com.capgemini.Lab3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Duration {
public static void main(String args[])
{String d1,d2;
Scanner s=new Scanner(System.in);
	System.out.println("Enter date 1");
	d1= s.nextLine();
	System.out.println("Enter date 2");
	d2=s.nextLine();
DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy/MM/dd");
LocalDate ld1=LocalDate.parse(d1,formatter);
LocalDate ld2=LocalDate.parse(d2,formatter);
Period pd=ld1.until(ld2);
System.out.println(pd.getDays());
System.out.println(pd.getMonths());
System.out.println(pd.getYears());}
}

