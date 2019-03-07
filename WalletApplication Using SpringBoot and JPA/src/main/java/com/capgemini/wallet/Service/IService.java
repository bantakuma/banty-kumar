package com.capgemini.wallet.Service;

import java.math.BigDecimal;
import java.util.List;

import com.capgemini.wallet.Customer;

public interface IService {
	public Customer createAccount(String mobileNo, String name, BigDecimal initialBalance);
	public Customer showBalance(String mobileNo);
    public Customer depositAmount(String mobileNo,BigDecimal Amount)  ;
    public Customer withdrawAmount(String mobileNo,BigDecimal Amount)  ;
    public Customer fundTransfer(String sourceMobNo,String Target,BigDecimal Amount);
    public List<Customer> getAllCustomer();

}
