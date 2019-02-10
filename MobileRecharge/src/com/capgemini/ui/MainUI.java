package com.capgemini.ui;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.capgemini.beans.Account;
import com.capgemini.dao.AccountDao;
import com.capgemini.dao.AccountDaoImpl;
import com.capgemini.service.AccountServiceImpl;



public class MainUI {
	
	private static Scanner scanner=new Scanner(System.in);
	private static AccountDao accountDao=new AccountDaoImpl(); 
	private static AccountServiceImpl accountService= new AccountServiceImpl(accountDao);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Account Balance Enquiry");
			System.out.println("Recharge Account");
			System.out.println("Exit");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:accountBalanceEnquiry();
				
				break;
			case 2:rechargeAcocunt();
				break;
			case 3:System.exit(0);
				break;
			default:System.out.println("Wrong ip");
				break;
			}
			
			
			
		}
		

	}

	private static void rechargeAcocunt() {
		// TODO Auto-generated method stub
		
		//Input for Phone Number
		System.out.println("Enter the phone number");
		String mobileNumber=scanner.next();
		while(!Pattern.matches("[789]{1}[0-9]{9}",mobileNumber))
		{
			System.out.println("Enter phone number again");
			mobileNumber=scanner.next();
		}
	
		
		//Input for recharges amount
		
		System.out.println("enter the amount");
		double amount=scanner.nextDouble();
		
		double d=0;
		d=accountService.rechargeAccount(mobileNumber, amount);
		System.out.println("available balance"+ d);
		if(d!=0)
		System.out.println("your recharge successful");
		System.out.println("Hello "+accountDao.getAccount(mobileNumber).getCustomerName()+" your recharge success");
		
		}

	private static void accountBalanceEnquiry() {
		// TODO Auto-generated method stub
		
		//Input for Phone Number
		System.out.println("Enter the phone number");
		String mobileNumber=scanner.next();
		while(!Pattern.matches("[789]{1}[0-9]{9}",mobileNumber))
		{
			System.out.println("Enter phone number again");
			mobileNumber=scanner.next();
		}
		
		Account account=accountService.getAccountDetails(mobileNumber);
		
		if(account==null)
		{
			System.out.println("given acc Deos not exist");
		}
		else
			
		System.out.println(" Balance :"+account.getAccountBalance());
		
	}

}
