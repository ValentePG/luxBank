package domain.options;

import domain.AccountBank;

public class Deposit implements Options {
	
	private Double depositAmount;
	private Double balanceBefore;
	private AccountBank account;
	
	public Deposit(AccountBank account, Double depositAmount) {
		this.depositAmount = depositAmount;
		this.account = account;
		this.balanceBefore = this.account.getBalance();
		this.optionAction();
	}
	
	public double getBalanceBefore() {
		return balanceBefore;
	}
	
	public double setBalanceBefore(Double balanceBefore) {
		return this.balanceBefore = balanceBefore;
	}
	
	public void optionAction() {
		this.account.setBalance(this.getBalanceBefore() + this.depositAmount);
//		this.setBalanceAfter(this.getBalanceBefore() + depositAmount);
		System.out.println("DEPÓSITO REALIZADO COM SUCESSO!" + "\nSALDO ATUAL: " + this.account.getBalance() + 
							"\nSALDO ANTERIOR: " + this.getBalanceBefore());
			
	}
	


}
