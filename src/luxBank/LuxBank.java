package luxBank;

//import java.util.Scanner;

public class LuxBank {

	public static void main(String[] args) {

		
		AccountBank account1 = new AccountBank();
		account1.getUserData();
		if(account1.isAccountOpen()){
			account1.applicationView();
			
		} else {
			System.out.println("Você preferiu não abrir sua conta, Finalizando programa...");
		}
	}

}
