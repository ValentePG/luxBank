package domain;

import domain.options.ApplicationView;
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
	
	public String getUser() {
		return this.user.getUser();
	}
	
	public String getPassword() {
		return this.password.getPassword();
	}
	
	public ApplicationView showMenu() {
		
		return new ApplicationView();
	}
}
