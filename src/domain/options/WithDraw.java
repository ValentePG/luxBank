package domain.options;

import java.util.Scanner;

import domain.AccountBank;

public class WithDraw implements Options {
	
	private Double withDrawValue;
	private Double balanceBefore;
	private boolean isValid;
	private Scanner input = new Scanner(System.in);
	
	public WithDraw(){	
		
		this.isValid = true;

	}

	public void setWithDrawValue() {
		System.out.println("Digite o valor de saque");
		this.withDrawValue = input.nextDouble();
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
	public void optionAction(AccountBank account) {
		this.setBalanceBefore(account.getBalance());
		this.setWithDrawValue();
		if(this.withDrawValid()) {
			
			account.setBalance(this.getBalanceBefore() - this.getWithDrawValue());
			System.out.println("Saque realizado com sucesso \nSALDO ATUAL:" + account.getBalance());
			
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


