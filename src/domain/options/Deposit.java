package domain.options;

import java.util.Scanner;

import domain.AccountBank;

public class Deposit implements Options {
	
	private Double depositAmount;
	private Double balanceBefore;
	private Scanner input = new Scanner(System.in);
	
	public double getBalanceBefore() {
		return balanceBefore;
	}
	
	public double setBalanceBefore(Double balanceBefore) {
		return this.balanceBefore = balanceBefore;
	}
	
	public double getDepositAmount() {
		return depositAmount;
	}
	
	public void setDepositAmount() {
		System.out.println("Digite o valor de depósito");
		this.depositAmount = input.nextDouble();
	}
	
	public void optionAction(AccountBank account) {
		this.setDepositAmount();
		this.setBalanceBefore(account.getBalance());
		account.setBalance(this.getBalanceBefore() + this.getDepositAmount());
		System.out.println("DEPÓSITO REALIZADO COM SUCESSO!" + "\nSALDO ATUAL: " + account.getBalance() + 
							"\nSALDO ANTERIOR: " + this.getBalanceBefore());
			
	}
	


}
