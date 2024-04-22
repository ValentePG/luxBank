package model.options;

public class AccountStatus implements Options{

	private String name; 
	private String password; 
	private Double balance;

	public AccountStatus(String name, String password, Double balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.optionAction();
	}
	
	@Override
	public void optionAction() {
		System.out.println("========================================" +
				"\nNAME: " + name + 
				"\nPASSWORD: " + password + 
				"\nBALANCE: " + balance +
				"\nSTATUS: " + "CONTA ABERTA" +
				"\n========================================");
	}
}
