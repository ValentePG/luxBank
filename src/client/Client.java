package client;

import model.AccountBank;

public class Client {

	public static void main(String[] args) {

		
		AccountBank account1 = new AccountBank();
		account1.deposit(500.0);
		System.out.println(account1.getBalance());
		account1.deposit(1000.0);
		System.out.println(account1.getBalance());
		account1.viewAccountStatus();
	}

}
