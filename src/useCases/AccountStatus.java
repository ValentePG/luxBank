package useCases;

import model.AccountBank;
import model.Options;

public class AccountStatus extends AccountBank implements Options{

  private int ID = 1;

  public int getID(){
    return this.getID();
  }

	public void toDo() {
		System.out.println("========================================" +
				"\nNAME: " + this.getName() + 
				"\nPASSWORD: " + this.getPassword() + 
				"\nBALANCE: " + this.getBalance() +
				"\nSTATUS: " + this.isAccountOpen() +
				"\n========================================");
	}
}
