package useCases;

import model.Options;

public class AccountStatus implements Options{

	private int ID = 1;
	private String name;
	private String password;
	private Double balance;

	public AccountStatus(String name, String password, Double balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.classAction();
	}
	
	@Override
	public int getID(){
		return this.ID;
	}

	@Override
	public void classAction() {
		System.out.println("========================================" +
				"\nNAME: " + name + 
				"\nPASSWORD: " + password + 
				"\nBALANCE: " + balance +
				"\nSTATUS: " + "CONTA ABERTA" +
				"\n========================================");
	}
}
