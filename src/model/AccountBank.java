package model;

import model.options.AccountStatus;
import model.options.Deposit;
import model.options.WithDraw;
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
	}
	
	
	
//	public User getUser() {
//		return user;
//	}
//										
//
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//														FUNCIONA
//
//	public Password getPassword() {
//		return password;
//	}
//
//
//
//	public void setPassword(Password password) {
//		this.password = password;
//	}



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
		return new AccountStatus(this.user.getUser(), this.password.getPassword(), this.getBalance());
	}
	
	public void withDraw(Double withDrawAmount) {
		WithDraw withDraw = new WithDraw(this.getBalance(), withDrawAmount);
		this.setBalance(withDraw.getBalanceAfter());
	}
}
