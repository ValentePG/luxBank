package useCases;

import model.AccountBank;
import model.Options;

public class Deposit extends AccountBank implements Options {
	
	private int ID = 2;
	private Double depositAmount;
	private Double balanceBefore;
	private Double balanceAfter;
	

	public Deposit(Double depositAmount) {
		this.depositAmount = depositAmount;
		this.classAction();
	}
	
	
	public Double getBalanceAfter() {
		return balanceAfter;
	}
	
	public Double setBalanceAfter(Double balanceAfter) {
		return this.balanceAfter = balanceAfter;
	}

	
	public double getBalanceBefore() {
		return balanceBefore;
	}
	
	public double setBalanceBefore(Double balanceBefore) {
		return this.balanceBefore = balanceBefore;
	}
	
	@Override
	public int getID() {
		return this.ID;
	}


	@Override
	public void classAction() {
		if(this.isAccountOpen()) {
			// Preciso criar uma forma de mudar o balanceBefore e o balanceAfter
			System.out.println("DEPÓSITO REALIZADO COM SUCESSO!" + "\nSALDO ATUAL: " + this.getBalanceAfter() + 
								"\nSALDO ANTERIOR: " + this.getBalanceBefore());
			
		} else {
			System.out.println("Você precisa abrir sua conta para depositar!!");
		}
	}
	


}
