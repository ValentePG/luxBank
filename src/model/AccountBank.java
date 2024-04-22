package model;

import model.options.AccountStatus;
import model.options.WithDraw;
import model.options.ApplicationView;
import model.options.Deposit;
import useCases.userRegister.Password;
import useCases.userRegister.User;

public class AccountBank {
	
	private User user;
	private Password password;
	private Double balance;
	private boolean accountOpen;
	
	public AccountBank(User user, Password password) {
		
		this.user = user;
		this.password = password;
		this.balance = 0.0;
		this.setAccountOpen(true);
		this.showMenu();
		
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
	
	public Deposit deposit(AccountBank account, Double depositAmount) {
		
		return new Deposit(account, depositAmount);
	}
	
	public AccountStatus getAccountStatus() {
		
		return new AccountStatus(this.user.getUser(), this.password.getPassword(), this.getBalance());
	}
	
	public void withDraw(Double withDrawAmount) {
		
		WithDraw withDraw = new WithDraw(this.getBalance(), withDrawAmount);
		this.setBalance(withDraw.getBalanceAfter());
	}
	
	public ApplicationView showMenu() {
		
		return new ApplicationView();
	}
}
