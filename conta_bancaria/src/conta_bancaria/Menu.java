package conta_bancaria;

import java.util.Scanner;

import conta.model.conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leia = new Scanner(System.in); 
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		conta c1 = new conta(1, 123, 1, "Katarina Pereira", 100000.00f);
		c1.visualizar();
		
		c1.sacar(500000.0f);
		
		
		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + "************************************************");
			System.out.println("\t\t\t\t\t\t");
			System.out.println("\t BanKt! Mais facilidade para você       ");
			System.out.println("\t\t\t\t\t\t");
			System.out.println("************************************************");
			System.out.println("\t 1 - Criar Conta\t\t\t");
			System.out.println("\t 2 - Listar todas as contas\t\t");
			System.out.println("\t 3 - Buscar conta por numero\t\t");
			System.out.println("\t 4 - Atualizar Dados da Conta\t\t");
			System.out.println("\t 5 - Apagar Conta\t\t\t");
			System.out.println("\t 6 - Sacar\t\t\t\t");
			System.out.println("\t 7 - Depositar\t\t\t\t");
			System.out.println("\t 8 - Transferir valores entre contas\t");
			System.out.println("\t 9 - Sair\t\t\t\t");
			System.out.println("************************************************");
			System.out.println("Escolha a opção desejada:                       " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao >9) {
				System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Opção inválida!\t\t\t\t\t");
				continue;
			}
			if (opcao == 9) {
				System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_BLACK_BOLD + "\nBanKt! Mais facilidade para você!               ");
				leia.close();
				sobre();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1 -> {
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca
				}
				}
			}
			case 2 -> {
				System.out.println("Digite o número da conta: ");
				aniversario = leia.nextInt();
			}

			case 3 -> {
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				// criar o objeto conta poupanca
			}
			case 4 -> {
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
				}
				}

			}

			case 5 -> {
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Depósito\n\n ");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				System.out.println("Digite o valor do saque: ");
				valor = leia.nextFloat();
			}
			case 7 -> {
				System.out.println("Depósito\n\n ");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				System.out.println("Digite o valor do deposito: ");
				valor = leia.nextFloat();
			}
			case 8 -> {
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);
			}

			}
		}	
			
	
}
	public static void sobre(){
		System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_BLACK_BOLD + "Katarina Pereira                                ");
		System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_BLACK_BOLD + "kpf.freire@gmail.com                            ");
		System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_BLACK_BOLD + "github.com/302kt                                ");
	}
}
