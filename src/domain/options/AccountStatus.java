package domain.options;

import domain.AccountBank;

public class AccountStatus implements Options{

	private AccountBank account;
	
	public AccountStatus(AccountBank account) {
		this.account = account;
//		this.optionAction();
	}
	
	@Override
	public void optionAction() {
		System.out.println("========================================" +
				"\nNAME: " + this.account.getUser() + 
				"\nPASSWORD: " + this.account.getPassword() + 
				"\nBALANCE: " + this.account.getBalance() +
				"\nSTATUS: " + this.account.isAccountOpen() +
				"\n========================================");
	}
}
