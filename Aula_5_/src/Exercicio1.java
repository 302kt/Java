import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		int i = 0;
		int opcao = -1;
		
		do {
		System.out.println("Informe uma cor: ");
		String cor = leia.nextLine();
        cores.add(cor);
		i++;
		
		}while (i < 2);
		
		while (opcao != 0) {
			System.out.println("1 para Listar as cores");
			System.out.println("2 para Listar as cores em ordem crescente");
			System.out.println("0 para Sair");
			System.out.println("----------------------------------------");
			System.out.println("Escolha a opção desejada");
			opcao = leia.nextInt();
		
		switch (opcao) {
		
		case 1 : 
			System.out.println("Cores adicionadas: ");
			for (String cor : cores) {
				System.out.println(cor); }
			
		case 2 : 
			
			Collections.sort(cores);
			System.out.println("Cores adicionadas em ordem crescente: ");
			for (String cor : cores) {
				System.out.println(cor); }
			
		}
		} System.out.println("Você finalizou o programa.");
		
		
		
	}

}
