package com.capgemini.service;

import com.capgemini.beans.Account;

public interface AccountService {
	
	Account getAccountDetails(String mobileNumber);
	double rechargeAccount(String mobileNumber, double rechargeAmount);

}

