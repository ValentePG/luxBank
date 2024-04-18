package model.options;

public class AccountStatus extends Options{

	private String name; // Tipo será mudado para objeto de valor User
	private String password; // Tipo será mudado para objeto de valor Password
	private Double balance;

	public AccountStatus(String name, String password, Double balance) {
		this.setID(1);
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
