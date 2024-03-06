package luxBank;

import java.util.Scanner;

public class LuxBank {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		System.out.print("Digite seu nome abaixo:");
		String nameUser = user.next();
		System.out.print("Digite sua senha abaixo:");
		String passwordUser = user.next();
		System.out.print("Você deseja criar sua conta? use [s/n]");
		String createOrNo = user.next().toLowerCase();
		
		if(createOrNo.equals("s")) {
			AccountBank account1 = new AccountBank(nameUser, passwordUser);
			account1.accountStatus();
		} else {
			System.out.println("Você preferiu não abrir sua conta. Excluindo dados e finalizando programa...");
		}
		
		
		user.close();
	}

}
