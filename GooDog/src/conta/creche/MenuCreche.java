package conta.creche;

import java.util.Scanner;

public class MenuCreche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao, numero;
		Scanner leia = new Scanner(System.in);
		boolean S = true;
		boolean N = false;
		
		String nomeDono, nomePet, raca, email, senha;
		String formaDePagamento;
		
		do {
			System.out.println("***********************************************");
			System.out.println("                 GooDog                        ");
			System.out.println("***********************************************");
			System.out.println("1 -> Criar cadastro                            ");
			System.out.println("2 -> Ver pacotes disponíveis                   ");
			System.out.println("3 -> Listar pacotes ativos                     ");
			System.out.println("4 -> Sair                                      ");
			System.out.println("***********************************************");
			System.out.println("Digite opção desejada: ");
			opcao = leia.nextInt();
			
			if (opcao > 4) {
				System.out.println("opção inválida!");
				continue;
			}
		
		}while (opcao != 4);
			System.out.println("GooDog, o melhor para o seu filho!!");
		
			switch (opcao) {
			
			case 1: System.out.println("Informe seu nome: ");
					nomeDono = leia.next();
					System.out.println("Informe o nome do Pet: ");
					nomePet = leia.next();
					System.out.println("Informe a raça: ");
					raca = leia.next();
					System.out.println("Informe seu e-mail: ");
					email = leia.next();
					System.out.println("Crie uma senha: ");
					senha = leia.next();
			break;
			
			case 2: System.out.println("***********************************************");
					System.out.println("                 GooDog - Menu de combos       ");
					System.out.println("***********************************************"); 
					System.err.println("Pacote 1 - mensal: R$ 800,00");
					System.out.println("Pacote 2 - semestral: R$ 4000,50");
					System.out.println("Pacote 3 - Pacote anual: R$7.400,50 ");
					System.out.println("***********************************************");
					System.out.println("Digite o número do Pacote que desejar: ");
					numero = leia.nextInt();
					
				switch (numero)	{
				
				}
			}	
	}

}
