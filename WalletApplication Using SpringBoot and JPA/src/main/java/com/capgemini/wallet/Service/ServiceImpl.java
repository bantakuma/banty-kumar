package com.capgemini.wallet.Service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.wallet.Customer;
import com.capgemini.wallet.Wallet;
import com.capgemini.wallet.Repo.IRepo;
@Service
public class ServiceImpl implements IService {
	@Autowired
  IRepo repo;
	@Override
	public Customer createAccount(String mobileNo, String name, BigDecimal initialBalance) {
		Customer cust=new Customer();
		Wallet wall=new Wallet();
		wall.setBalance(initialBalance);
		cust.setMobileNo(mobileNo);
		cust.setName(name);
		cust.setWallet(wall);
		return repo.save(cust);
	}

	@Override
	public Customer showBalance(String mobileNo) {
		return repo.findById(mobileNo).get();	
	}

	public ServiceImpl(IRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Customer depositAmount(String mobileNo,BigDecimal Amount) {
		Customer cust=repo.findById(mobileNo).get();
		{
			cust.getWallet().setBalance(cust.getWallet().getBalance().add(Amount));
		}
		repo.save(cust);
		return cust;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal Amount) {
		Customer cust=repo.findById(mobileNo).get();
		{
			cust.getWallet().setBalance(cust.getWallet().getBalance().subtract(Amount));
			repo.save(cust);
		}
		return cust;
	}


	@Override
	public Customer fundTransfer(String sourceMobNo, String Target, BigDecimal Amount) {
		Customer cust1=repo.findById(sourceMobNo).get();
	    Customer cust2=repo.findById(Target).get();
	    cust1.getWallet().setBalance(cust1.getWallet().getBalance().subtract(Amount));
	    cust2.getWallet().setBalance(cust2.getWallet().getBalance().add(Amount));
	    repo.save(cust2);
	    repo.save(cust1);
		return cust2;
	}


	public List<Customer> getAllCustomer(){  
		  List<Customer>user = new ArrayList<>(); 
	      repo.findAll().forEach(user::add); 
	        return user;  
	    }  

}
