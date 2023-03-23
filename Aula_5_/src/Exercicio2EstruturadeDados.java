import java.util.Scanner;
import java.util.Stack;

public class Exercicio2EstruturadeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> Pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		do { 
			System.out.println("1 Adicionar um novo livro na fila");
			System.out.println("2 Listar todos os livros da fila");
			System.out.println("3 Chamar (retirar) um livro da fila");
			System.out.println("0 para Sair");
			System.out.println("----------------------------------------");
			System.out.println("Escolha a opção desejada");
			opcao = leia.nextInt();
			
			if (opcao > 3) {
				System.out.println("Opção inválida");
			}

			switch (opcao) {
			
			case 1 : 
				System.out.println("Digite o nome do livro");
				String nome = leia.next();
				Pilha.push(nome);
				break;
				
			case 2 : 
				System.out.println("Fila: ");
				System.out.println(Pilha);
				break;
				
			case 3 : 
				if (Pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");}
				else {
					String LivrosRemovidos = Pilha.pop();
					System.out.println("o Livro" + LivrosRemovidos + " foi removido da lista!");
				}
			
			}
			
		}while (opcao != 0);	
			System.out.println("Programa finalizado!");
	}

}
