package com.capgemini.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



import com.capgemini.beans.Account;


public class AccountDaoImpl implements AccountDao {

	Map<String, Account> userData=new HashMap<String, Account>();
	
	
	
	
	@Override
	public Account getAccount(String mobileNumber) {
		Account ctemp=null;
		Iterator<Entry<String, Account>> dataTrav=userData.entrySet().iterator();
		while(dataTrav.hasNext())
		{
			Map.Entry<String, Account> data=(Map.Entry<String, Account>)dataTrav.next();
				if(data.getValue().getMobileNumber().equals(mobileNumber))
				{
					ctemp=data.getValue();
					return data.getValue();
				}	
		}			
		
		//if(ctemp!=null)
			return ctemp;
//		else
//			throw new PhoneNumberDoesNotExistException();
//		
//			}
		
	}

	@Override
	public double rechargeAccount(String mobileNumber, double rechargeAmount) {
		// TODO Auto-generated method stub
		Account account=getAccount(mobileNumber);
		account.setAccountBalance(account.getAccountBalance()+rechargeAmount);
		return account.getAccountBalance();
	}

}
