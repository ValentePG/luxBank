package domain.options;

import domain.AccountBank;

public class MoneyRenderer implements Runnable{
	
	AccountBank account;
	Double balance;
	Double tax = 10.0;
	
	public MoneyRenderer(AccountBank account) {
		this.account = account;
		this.balance = this.account.getBalance();
	}

	
	@Override
	public void run() {
		
	  	this.account.setBalance(((this.account.getBalance() * tax) / 100) + this.account.getBalance());
		
	}
		
}
	


