package model;

public class AccountBank {
	
	private String user;
	private String password;
	private Double balance;
	private boolean accountOpen;
	
	public AccountBank() {
		this.balance = 0.0;
		this.setAccountOpen(false);
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
	

}
