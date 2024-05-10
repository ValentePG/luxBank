package useCases.userAction;

import java.util.ArrayList;

import domain.AccountBank;
import domain.options.MenuInitializer;
import domain.options.Options;
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
		MenuInitializer menu = new MenuInitializer();
		ArrayList<Options> options = menu.createList();

		options.get(0).optionAction(conta1);
		
		options.get(1).optionAction(conta1);
		
		options.get(2).optionAction(conta1);
		
		
		
		
		
	}

}
