package com.capgemini.wallet;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class Wallet {
@NotNull
@Size(min=3,message="required")  
@Column(name="Balance")
private BigDecimal balance;

public BigDecimal getBalance() {
	return balance;
}

public void setBalance(BigDecimal balance) {
	this.balance = balance;
}

public Wallet(BigDecimal balance) {
	super();
	this.balance = balance;
}
public Wallet()
{
	
}
}
