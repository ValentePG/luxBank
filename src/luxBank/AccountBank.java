package luxBank;

public class AccountBank {
	
	private String name;
	private String password;
	private Double balance;
	private boolean accountOpen;
	
	public AccountBank(String name, String password) {
		this.name = name;
		this.password = password;
		this.balance = 0.0;
		this.setAccountOpen(true);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public boolean isAccountOpen() {
		return accountOpen;
	}

	public void setAccountOpen(boolean accountOpen) {
		this.accountOpen = accountOpen;
	}
	
	public void accountStatus() {
		System.out.println("========================================" +
				"\nNAME: " + this.getName() + 
				"\nPASSWORD: " + this.getPassword() + 
				"\nBALANCE: " + this.getBalance() +
				"\nSTATUS: " + this.isAccountOpen() +
				"\n========================================");
	}
	
	public void deposit(int depositAmount) {
		this.setBalance(this.getBalance() + depositAmount);
		System.out.println("DEPÓSITO REALIZADO COM SUCESSO!" + "\nSALDO ATUAL: " + this.getBalance());
	}
	
	public void withdraw(int withdrawAmount) {
		if(this.getBalance() >= withdrawAmount) {
			this.setBalance(this.getBalance() - withdrawAmount);
			System.out.println("SAQUE CONCLUÍDO." + "\nSALDO ATUAL: " + this.getBalance());
		} else {
			System.out.println("NÃO PODE SACAR, SALDO INSUFICIENTE." + "\nSALDO ATUAL: "+ this.getBalance());
		}
	}
	
	
}
