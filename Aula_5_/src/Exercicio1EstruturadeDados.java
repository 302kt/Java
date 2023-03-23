import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1EstruturadeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> Clientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		
			do { 
			System.out.println("1 Adicionar um novo cliente na fila");
			System.out.println("2 Listar todos os clientes na fila");
			System.out.println("3 Chamar (retirar) uma pessoa da fila");
			System.out.println("0 para Sair");
			System.out.println("----------------------------------------");
			System.out.println("Escolha a opção desejada");
			opcao = leia.nextInt();
			
			if (opcao > 3) {
				System.out.println("Opção inválida");
				System.exit(0);
			}
			
		switch (opcao) {
		case 1 :
			System.out.println("Digite o nome do novo cliente: ");
			String nome = leia.next();
	        Clientes.add(nome);
	        break;
	        
		case 2 : 
			System.out.println("Fila: ");
			System.out.println(Clientes); 
		break;
		
		case 3 : 
			if (Clientes.isEmpty()) {
			System.out.println("A Fila está vazia!");
			}
			else {
				String clienteChamado = Clientes.remove();
				System.out.println("Cliente " + clienteChamado + " chamado!");
			}
			
		}	
		}while (opcao != 0) ; 
			System.out.println("Programa finalizado!");
			

	}

}