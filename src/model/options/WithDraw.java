package model.options;


public class WithDraw extends Options {
	
	private Double withDrawValue;
	private Double balanceAfter;
	private Double balanceBefore;
	private boolean isValid;
	
	public WithDraw(Double balance, Double withDrawValue){	
		this.setID(2);
		this.balanceBefore = balance;
		this.withDrawValue = withDrawValue;
		this.isValid = true;
		this.optionAction();
	}


	public Double getWithDrawValue() {
		return withDrawValue;
	}

	public void setWithDrawValue(Double withDrawValue) {
		this.withDrawValue = withDrawValue;
	}

	public Double getBalanceAfter() {
		return balanceAfter;
	}

	public void setBalanceAfter(Double balanceAfter) {
		this.balanceAfter = balanceAfter;
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
		// TODO Auto-generated method stub
		if(this.withDrawValid()) {
			
			this.setBalanceAfter(this.getBalanceBefore() - this.getWithDrawValue());
			System.out.println("Saque realizado com sucesso \nSALDO ATUAL:" + this.getBalanceAfter());
			
		}
	}
	
	public boolean withDrawValid() {
		if(this.getBalanceBefore() < this.getWithDrawValue()) {
			System.out.println("Saldo menor que o valor de saque! \nSALDO ATUAL:" + this.getBalanceBefore());
			this.setBalanceAfter(getBalanceBefore());
			this.setValid(false);
		} 
		return this.isValid();
	}


}


