package useCases;

import model.AccountBank;
import useCases.userRegister.Password;
import useCases.userRegister.Register;
import useCases.userRegister.UserRegister;
import useCases.userRegister.User;


public class UserAction {

	public static void main(String[] args) {

		User usuario = new User("Gabriel");
		Password senha = new Password("909090");
		UserRegister registro = new Register(usuario, senha);
		AccountBank conta1 = registro.createAccount();
		
		conta1.getAccountStatus();
//		
//		usuario.setUser("Leandro");
//		senha.setPassword("3030303030");
//		
//		conta1.getAccountStatus();
//		
//		conta1.deposit(500.0);
//		
//		System.out.println(conta1.getBalance());
//		
//		conta1.withDraw(200.0);
//		
//		System.out.println(conta1.getBalance());
//		
//		conta1.getAccountStatus();
		
		
	}

}
