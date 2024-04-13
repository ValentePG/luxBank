package model;

import model.options.AccountStatus;
import model.options.Deposit;
import model.options.WithDraw;

public class AccountBank {
	
	private String user = "Gabriel";
	private String password = "90909090";
	private Double balance;
	private boolean accountOpen;
	
	public AccountBank() {
		this.balance = 0.0;
		this.setAccountOpen(true);
	}

	public String getName() {
		return user;
	}
	
	public void setName(String name) {
		this.user = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public boolean isAccountOpen() {
		return accountOpen;
	}

	public void setAccountOpen(boolean accountOpen) {
		this.accountOpen = accountOpen;
	}
	
	public void deposit(Double depositAmount) {
		if(this.isAccountOpen()) { // Bloco IF pode ser removido!
			Deposit deposit = new Deposit(depositAmount, this.getBalance());
			this.setBalance(deposit.getBalanceAfter());
		} else {
			System.out.println("Não foi possível realizar o depósito. \nVocê deve abrir sua conta para depositar!");
		}
	}
	
	public AccountStatus getAccountStatus() {
		return new AccountStatus(this.getName(), this.getPassword(), this.getBalance());
	}
	
	public void withDraw(Double withDrawAmount) {
		WithDraw withDraw = new WithDraw(this.getBalance(), withDrawAmount);
		this.setBalance(withDraw.getBalanceAfter());
	}
}
