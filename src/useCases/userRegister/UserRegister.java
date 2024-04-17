package useCases.userRegister;

import model.AccountBank;

public interface UserRegister {

	public AccountBank createAccount(User user, Password password);
	
	
}
