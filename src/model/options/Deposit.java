package model.options;

import model.AccountBank;

public class Deposit implements Options {
	
	private Double depositAmount;
	private Double balanceBefore;
	private AccountBank conta1;
	
	public Deposit(AccountBank conta1, Double depositAmount) {
		this.depositAmount = depositAmount;
		this.conta1 = conta1;
		this.balanceBefore = conta1.getBalance();
		this.optionAction();
	}
	
	public double getBalanceBefore() {
		return balanceBefore;
	}
	
	public double setBalanceBefore(Double balanceBefore) {
		return this.balanceBefore = balanceBefore;
	}
	
	@Override
	public void optionAction() {
		this.conta1.setBalance(this.getBalanceBefore() + depositAmount);
//		this.setBalanceAfter(this.getBalanceBefore() + depositAmount);
		System.out.println("DEPÓSITO REALIZADO COM SUCESSO!" + "\nSALDO ATUAL: " + this.conta1.getBalance() + 
							"\nSALDO ANTERIOR: " + this.getBalanceBefore());
			
	}
	


}
