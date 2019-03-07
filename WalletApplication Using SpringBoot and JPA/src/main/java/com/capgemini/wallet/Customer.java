package com.capgemini.wallet;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
@Table(name="Customer")
public class Customer {
	 @NotNull
	 @Size(min=3,message="required")  
	 @Column(name="name")
	private String name;
	 
	 @NotNull
	 @Column(name="MobileNo")
	 @Size(min=10,max=10,message="required") 
	 @Pattern(regexp="(^$|[0-9]{10})")
	 @Id
	private String mobileNo;
	
	public Customer(String name, String mobileNo, Wallet wallet) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.wallet = wallet;
	}
	public Customer()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Embedded
	private Wallet wallet;
}
