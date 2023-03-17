package aula_3_;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int idade, genero, categoria, PB =0, PFM =0, PMH40 =0, PFSM30 =0;
		char resposta = 'S';
		
		
		while( resposta == 'S' ) {
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Categorias: ");
		System.out.println("--------------------- ");
		System.out.println("1\tBackend ");
		System.out.println("2\tFrontend ");
		System.out.println("3\tMobile ");
		System.out.println("4\tFullStack ");
		System.out.println("--------------------- ");
		System.out.println("Informe a categoria: ");
		categoria = leia.nextInt();
		
		
		System.out.println("---------------------- ");
		System.out.println("1(F)/ 2(M)/ 3(T)/ 4(NB)");
		System.out.println("Informe o genêro com o qual se identifica? ");
		genero = leia.nextInt();
		if (genero == 3);{
		System.out.println("Informe qual gênero? 1(F) e 2(M)");}
		genero = leia.nextInt();
		
		
		if (idade > 40 && categoria == 3 && genero == 2)
			PMH40 ++;
		
		System.out.println("Deseja prosseguir para leitura de outro colaboradore? ");
		resposta = leia.next().toUpperCase().charAt(0);
		
	
		

		}
		 
		System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos é: " + PMH40);
		
	}

}
