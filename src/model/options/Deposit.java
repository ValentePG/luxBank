package model.options;

public class Deposit implements Options {
	
	private Double depositAmount;
	private Double balanceBefore;
	private Double balanceAfter;
	

	public Deposit(Double depositAmount, Double balance) {
		this.depositAmount = depositAmount;
		this.balanceBefore = balance;
		this.optionAction();
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
	public void optionAction() {
		this.setBalanceAfter(this.getBalanceBefore() + depositAmount);
		System.out.println("DEPÓSITO REALIZADO COM SUCESSO!" + "\nSALDO ATUAL: " + this.getBalanceAfter() + 
							"\nSALDO ANTERIOR: " + this.getBalanceBefore());
			
	}
	


}
