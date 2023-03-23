import java.util.Scanner;

import aula_6_Calc.Calculos;

public class testeCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Calculos calc = new Calculos();
		
		int opcao;
		double numero1, numero2;
		
		do {
			
			System.out.println("-----------------------");
			System.out.println("1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Multiplicação");
			System.out.println("4-Divisão");	
			System.out.println("0-Sair");
			System.out.println("-----------------------");
			System.out.println("Qual a operação?");
			opcao = input.nextInt();
			
			if (opcao == 0) {
				sobre();
				System.exit(0); }
			
			if (opcao >4) {
				System.out.println("Opção inválida.");
				continue;
			}
			
			System.out.println("Digite o 1º numero");
			numero1 = input.nextDouble();
			
			System.out.println("Digite o 2º numero");
			numero2 = input.nextDouble();
		
			switch(opcao) {
				case 1 -> System.out.println("Soma: " + calc.soma(numero1, numero2));
				case 2 -> System.out.println("Subtração: " + calc.subtracao(numero1, numero2));
				case 3 -> System.out.println("Miltiplicação: " + calc.multiplicacao(numero1, numero2));
				case 4 -> System.out.println("Divisão: " + calc.divisao(numero1, numero2));
				}
			
	} while (opcao != 0);	
	}	
	

	public static void sobre() {
	System.out.println("Calculadora com Métodos");
	System.out.println("Katarina Pereira");
}
}
