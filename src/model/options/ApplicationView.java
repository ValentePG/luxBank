package model.options;

public class ApplicationView {
	
	public ApplicationView() {
		this.showMenu();
		
	}
	
	//Criar um list<Options>,correr pela lista e buscar o ID de cada um, se o ID for igual ao inteiro que o usuário digitou, 
	//reproduz a função da Opção.
	
	public void showMenu() {
		
		System.out.println("===========================");
		System.out.println("[1] INFORMAÇÕES DA CONTA");
		System.out.println("[2] SACAR");
		System.out.println("[3] DEPOSITAR");
		System.out.println("[4] INVESTIR");
		System.out.println("[5] FECHAR CONTA");
		System.out.println("===========================");
	}
}


