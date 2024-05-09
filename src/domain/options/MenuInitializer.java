package domain.options;

import java.util.ArrayList;

public class MenuInitializer {
	
	Options options;
	ArrayList<Options> arrayOptions = new ArrayList<Options>();
	
	public ArrayList<Options> createList(){
		
		arrayOptions.add(new Deposit());
		arrayOptions.add(new WithDraw());
		arrayOptions.add(new AccountStatus());
		
		return arrayOptions;
	}
}
