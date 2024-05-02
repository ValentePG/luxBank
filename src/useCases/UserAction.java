package useCases;

import model.AccountBank;
import model.options.MoneyRenderer;
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
		conta1.getAccountStatus(conta1);
		
		
		usuario.setUser("Leandro");
		senha.setPassword("30303030");
		
		
		conta1.deposit(conta1, 300.0);
		
		MoneyRenderer money = new MoneyRenderer(conta1);
		money.run();
		
		conta1.getAccountStatus(conta1);
		
	}

}
