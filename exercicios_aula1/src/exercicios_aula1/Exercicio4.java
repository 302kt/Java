package exercicios_aula1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, diferença;
		
		System.out.println("Insira o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o quarto número: ");
		n4 = leia.nextFloat();
		
		diferença = (n1 * n2) - (n3 * n4);
		
		System.out.println("O produto do primeiro número e o segundo é: "+ (n1 * n2));
		System.out.println("O produto do primeiro número e o segundo é: " + (n3 * n4));
		System.out.println("A diferença entre os produtos é: " + diferença);
		
		
		
	}

}
