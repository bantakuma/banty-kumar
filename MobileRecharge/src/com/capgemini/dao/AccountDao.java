package com.capgemini.dao;

import com.capgemini.beans.Account;

public interface AccountDao {
	
	Account getAccount(String mobileNumber);
	double rechargeAccount(String mobileNumber, double rechargeAmount);
}
