package luxBank;

import java.util.Scanner;

public class AccountBank {
	
	private String name;
	private String password;
	private Double balance;
	private boolean accountOpen;
	
	public AccountBank() {
		this.balance = 0.0;
		this.setAccountOpen(false);
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
	
	public void getUserData() {
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Você deseja criar sua conta? use [s/n]");
		String createAccount = user.next().toLowerCase();
		
		if(createAccount.equals("s")) {
			
			System.out.print("LOGIN:");
			this.name = user.next();
			System.out.print("SENHA:");
			this.password = user.next();
			this.accountOpen = true;
		}
		
		
		
		
		user.close();
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
	
	public void applicationView() {
		System.out.println("===========================");
		System.out.println("[1] INFORMAÇÕES DA CONTA");
		System.out.println("[2] SACAR");
		System.out.println("[3] DEPOSITAR");
		System.out.println("[4] INVESTIR");
		System.out.println("[5] FECHAR CONTA");
		System.out.println("===========================");
	}
	
	public void actionUser(int userChoose) {
		if(userChoose == 1) {
			this.accountStatus();
		}
	}
	
}
