package com.capgemini.Lab3;
	import java.util.Scanner;
	import java.time.ZoneId;
	import java.time.ZonedDateTime;
	public class Zone {

		public static void main(String args[])
	{
		int n;
	Scanner in=new Scanner(System.in);

		System.out.println("Enter the choice for zone");
		
		System.out.println("print 1 for date and time of America/New_York");
		System.out.println("print 2 for date and time of Europe/London");
		System.out.println("print 3 for date and time of Asia/Tokyo");
		System.out.println("print 4 for date and time of US/Pacific ");
		System.out.println("print 5 for date and time of  Africa/Cairo");
		System.out.println("print 6 for date and time of Australia/Sydney ");
		n=in.nextInt();
		
		switch(n)
		{case 1:
		ZonedDateTime currentTime1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(currentTime1);
		break;
		case 2:
			ZonedDateTime currentTime2 = ZonedDateTime.now(ZoneId.of(" Europe/London"));
			System.out.println(currentTime2);
			break;
		    
		case 3:
			ZonedDateTime currentTime3 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
			System.out.println(currentTime3);
			break;
		case 4:
			ZonedDateTime currentTime4 = ZonedDateTime.now(ZoneId.of("US/Pacific"));
			System.out.println(currentTime4);
			break;
		case 5:
			ZonedDateTime currentTime5 = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
			System.out.println(currentTime5);
			break;
		case 6:
			ZonedDateTime currentTime6 = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
			System.out.println(currentTime6);
			break;
					
		}
		}



	}
