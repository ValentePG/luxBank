package model.options;

import model.AccountBank;

public class WithDraw implements Options {
	
	private Double withDrawValue;
	private Double balanceBefore;
	private AccountBank account;
	private boolean isValid;
	
	public WithDraw(AccountBank account, Double withDrawValue){	
		this.account = account;
		this.balanceBefore = this.account.getBalance();
		this.withDrawValue = withDrawValue;
		this.isValid = true;
		this.optionAction();
	}


	public Double getWithDrawValue() {
		return withDrawValue;
	}

	public Double getBalanceBefore() {
		return balanceBefore;
	}

	public void setBalanceBefore(Double balanceBefore) {
		this.balanceBefore = balanceBefore;
	}
	
	public boolean isValid() {
		return isValid;
	}
	
	
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	@Override
	public void optionAction() {
		if(this.withDrawValid()) {
			
			this.account.setBalance(this.getBalanceBefore() - this.getWithDrawValue());
			System.out.println("Saque realizado com sucesso \nSALDO ATUAL:" + this.account.getBalance());
			
		}
	}
	
	public boolean withDrawValid() {
		if(this.getBalanceBefore() < this.getWithDrawValue()) {
			System.out.println("Saldo menor que o valor de saque! \nSALDO ATUAL:" + this.getBalanceBefore());
			this.setValid(false);
		} 
		return this.isValid();
	}


}


