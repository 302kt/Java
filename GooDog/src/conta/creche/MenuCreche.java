package conta.creche;

import java.io.IOException;
import java.util.Scanner;

import conta.cliente.CadastroCliente;
import conta.util.Cores;

public class MenuCreche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao, numero, pagamento = -1;;
		Scanner leia = new Scanner(System.in);
		
		CadastroCliente c1 = new CadastroCliente("Thiago", "Cafu", "Gato", "rua perereca", "thiago.gatinho@");
		c1.visualizar();
		
		while (true) {
			System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println(" #####                ######                \r\n"
					+ "#     #  ####   ####  #     #  ####   ####  \r\n"
					+ "#       #    # #    # #     # #    # #    # \r\n"
					+ "#  #### #    # #    # #     # #    # #      \r\n"
					+ "#     # #    # #    # #     # #    # #  ### \r\n"
					+ "#     # #    # #    # #     # #    # #    # \r\n"
					+ " #####   ####   ####  ######   ####   ####  "        );
			System.out.println(Cores.TEXT_RESET);
			System.out.println("********************************************");
			System.out.println("                 GooDog                     ");
			System.out.println("********************************************");
			System.out.println("1 -> Criar cadastro                         ");
			System.out.println("2 -> Ver pacotes disponíveis                ");
			System.out.println("3 -> Listar planos ativos                   ");
			System.out.println("4 -> Remover planos                         ");
			System.out.println("5 -> Sair                                   ");
			System.out.println("********************************************");
			System.out.println("Digite opção desejada:                      ");
			
			opcao = leia.nextInt();
			
			if (opcao == 5) { 
				System.out.println("GooDog, esperamos te ver em breve!!");
				sobre();
				System.exit(0);
			}
			
			if (opcao > 5) {
				System.out.println("opção inválida!");
					
			}
		
			
		
			switch (opcao) {
			
			case 1:
			System.out.println("**Cadastro cliente\n\n**");
			c1.cadastrar();
					
			keyPress();
			break;
			
			case 2: System.out.println("***********************************************");
					System.out.println("                 GooDog - Menu de combos       ");
					System.out.println("***********************************************"); 
					System.out.println("Pacote 1 - mensal: R$ 800,00");
					System.out.println("Pacote 2 - semestral: R$ 4000,50");
					System.out.println("Pacote 3 - Pacote anual: R$7.400,50 ");
					System.out.println("***********************************************");
					System.out.println("Digite o número do Pacote que desejar: "        );
					numero = leia.nextInt();
					
				switch (numero)	{
				
				case 1:
						System.out.println("Você escolhe o pacote mensal!");
					    System.out.println("1 - Débito" );
					    System.out.println("2 - Crédito");
					    System.out.println("3 - Boleto" );
					    System.out.println("Informe a opção de pagamento:");
					    pagamento =	leia.nextInt();
					    System.out.println("Você escolhe a opção: " + pagamento);
					    System.out.println("Compra finalizada com sucesso!");
				keyPress();	    
				break;
				
				case 2: 
				System.out.println("Você escolhe o pacote mensal!");
			    System.out.println("1 - Débito" );
			    System.out.println("2 - Crédito");
			    System.out.println("3 - Boleto" );
			    System.out.println("Informe a opção de pagamento:");
			    pagamento =	leia.nextInt();
			    System.out.println("Você escolhe a opção: " + pagamento);
			    System.out.println("Compra finalizada com sucesso!");
			    
			    keyPress();
			    break;
				
				case 3: 
					System.out.println("Você escolhe o pacote mensal!");
				    System.out.println("1 - Débito" );
				    System.out.println("2 - Crédito");
				    System.out.println("3 - Boleto" );
				    System.out.println("Informe a opção de pagamento:");
				    pagamento =	leia.nextInt();
				    System.out.println("Você escolhe a opção: " + pagamento);
				    System.out.println("Compra finalizada com sucesso!");
				    keyPress();
				    break;
			    
				}
				
			case 3: System.out.println("Listar planos ativos: ");
				// inserir os metodos
			keyPress();
			break;
			
			case 4: System.out.println("Remover planos");
			keyPress();
			break;
			}
		}
		
	}
	
	public static void sobre() {
		System.out.println("Feito por: Andresa/ Carolina/ Daisy/ Joyce/ Julia/ Katarina");
		System.out.println("Github: github.com/amarcal07; github.com/JuliaValerio; github.com/302kt ");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET +"Pressione ENTER para continuar");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Erro de digitação!");
		}
	}
	
}
