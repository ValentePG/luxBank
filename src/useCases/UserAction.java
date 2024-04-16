package useCases;

import model.AccountBank;
import model.Password;
import model.Register;
import model.User;


public class UserAction {

	public static void main(String[] args) {

		User usuario = new User("Gabriel");
		Password senha = new Password("909090");
		Register registro = new Register(usuario, senha);
		
		AccountBank account1 = new AccountBank();
		account1.deposit(500.0);
		System.out.println(account1.getBalance());
		account1.withDraw(200.0);
		System.out.println(account1.getBalance());
		account1.getAccountStatus();
		
		
	}

}
