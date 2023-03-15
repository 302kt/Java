package exercicios_aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, nota4;
		String nome_aluno;
		System.out.println("Digite o nome do aluno");
		nome_aluno = leia.nextLine();
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		System.out.println("Média= " + (nota1 + nota2 + nota3 + nota4) / 4);
	}

}
