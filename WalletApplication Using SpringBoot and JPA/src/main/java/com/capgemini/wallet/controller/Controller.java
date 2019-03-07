package com.capgemini.wallet.controller;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.wallet.Customer;
import com.capgemini.wallet.Service.IService;

@RestController
public class Controller {
@Autowired
IService service;
@RequestMapping("/getBalance/{mobileNo}")
public Customer getBalance(@PathVariable String mobileNo)
{
	return service.showBalance(mobileNo);	
}
@RequestMapping(value="/addCustomer/{mobileNo}/{name}/{initialBalance}",method=RequestMethod.POST)
public void addCustomer( @PathVariable String mobileNo,@PathVariable String name,@PathVariable BigDecimal initialBalance)
{
            service.createAccount(mobileNo, name, initialBalance);	
}
@RequestMapping(value="/depositAmount/{mobileNo}/{Amount}",method=RequestMethod.GET)
public void depositBalance(@PathVariable String mobileNo,@PathVariable BigDecimal Amount)
{
	service.depositAmount(mobileNo, Amount);
}
@RequestMapping(value="/withdrawAmount/{mobileNo}/{Amount}",method=RequestMethod.GET)
public void withdrawBalance(@PathVariable String mobileNo,@PathVariable BigDecimal Amount)
{
	service.withdrawAmount(mobileNo, Amount);
}
@RequestMapping(value="/fundTransfer/{sourceMobNo}/{Target}/{Amount}",method=RequestMethod.GET)
public void fundTransfer(@PathVariable String sourceMobNo,@PathVariable String Target,@PathVariable BigDecimal Amount)
{
	service.fundTransfer(sourceMobNo, Target, Amount);
}
@GetMapping(value="/fetchAll")
 public List<Customer> getAllCustomer(){
	return service.getAllCustomer();
}
}
