package useCases.userRegister;

import model.AccountBank;

public class Register implements UserRegister {
	
	private User user;
	private Password password;
	
	
	public Register(User user, Password password) {
		this.user = user;
		this.password = password;
	}
	
	public User getUser() {
		return user;
	}
	
	@Override
	public AccountBank createAccount() {
		return new AccountBank(user, password);
	}


}
