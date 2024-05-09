package domain.options;

import domain.AccountBank;

public class AccountStatus implements Options{

	
	@Override
	public void optionAction(AccountBank account) {
		System.out.println("========================================" +
				"\nNAME: " + account.getUser() + 
				"\nPASSWORD: " + account.getPassword() + 
				"\nBALANCE: " + account.getBalance() +
				"\nSTATUS: " + account.isAccountOpen() +
				"\n========================================");
	}
}
