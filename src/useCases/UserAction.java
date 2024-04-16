package useCases;

import model.AccountBank;


public class UserAction {

	public static void main(String[] args) {

		
		AccountBank account1 = new AccountBank();
		account1.deposit(500.0);
		System.out.println(account1.getBalance());
		account1.withDraw(200.0);
		System.out.println(account1.getBalance());
		account1.getAccountStatus();
		
		
	}

}
