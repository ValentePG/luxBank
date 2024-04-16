package useCases;

import useCases.userRegister.Password;
import useCases.userRegister.Register;
import useCases.userRegister.User;


public class UserAction {

	public static void main(String[] args) {

		User usuario = new User("Gabriel");
		Password senha = new Password("909090");
		Register registro = new Register(usuario, senha);
		
		System.out.println(usuario.getUser());
		System.out.println(senha.getPassword());
		
		System.out.println(registro.getUser());
		System.out.println(registro.getPassword());
		
//		AccountBank account1 = new AccountBank();
//		account1.deposit(500.0);
//		System.out.println(account1.getBalance());
//		account1.withDraw(200.0);
//		System.out.println(account1.getBalance());
//		account1.getAccountStatus();
		
		
	}

}
