package domain;

import domain.options.AccountStatus;
import domain.options.ApplicationView;
import domain.options.Deposit;
// import domain.options.MoneyRenderer;
import domain.options.WithDraw;
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
	
	public Deposit deposit(AccountBank account, Double depositAmount) {
		
		return new Deposit(account, depositAmount);
	}
	

	public AccountStatus getAccountStatus(AccountBank account) {
		
		return new AccountStatus(account);
	}
	
	public WithDraw withDraw(AccountBank account, Double withDrawAmount) {
		
		return new WithDraw(account, withDrawAmount);
	}
	
//	public MoneyRenderer moneyRenderer(AccountBank account) {
//		
//		return new MoneyRenderer(account);
//	}
	
	public ApplicationView showMenu() {
		
		return new ApplicationView();
	}
}
