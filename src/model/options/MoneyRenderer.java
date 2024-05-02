package model.options;

//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;

import model.AccountBank;

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
	


