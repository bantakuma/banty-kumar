package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.dao.AccountDao;

public class AccountServiceImpl implements AccountService {

	
	
	AccountDao accountDao;
	
	public AccountServiceImpl(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	
	
	@Override
	public Account getAccountDetails(String mobileNumber) {
		// TODO Auto-generated method stub
		Account account=accountDao.getAccount(mobileNumber);
		return account;
	}

	@Override
	public double rechargeAccount(String mobileNumber, double rechargeAmount) {
		
		accountDao.rechargeAccount(mobileNumber, rechargeAmount);
		return 0;
	}

}
