package useCases;

import java.util.ArrayList;
import model.UserOption;

public class UserAction{
	
	// Injetar UserOption
	private UserOption option = new UserOption();
	private ArrayList<Integer> action = option.getOptions();
	
	
	public void chooseOne(int choice) {
		action.forEach((option) -> System.out.println("Teste"));
	}
	
	
}
