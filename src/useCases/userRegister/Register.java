package useCases.userRegister;

import model.AccountBank;

public class Register implements UserRegister {
	
	
	@Override
	public AccountBank createAccount(User user, Password password) {
		return new AccountBank(user, password);
	}


}
