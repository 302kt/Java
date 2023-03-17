package aula_2_;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("Digite um valor para A: ");
		A = leia.nextInt();
		
		System.out.println("Digite um valor para B: ");
		B = leia.nextInt();
		
		System.out.println("Digite um valor para C: ");
		C = leia.nextInt();
		
		if ( (A + B) > C) 
		System.out.println("A soma entre A e B é maior que C");
		
		else if ( (A + B) < C)
		System.out.println("A soma entre A e B é menor que C");
		
		else if ( (A + B) == C)
		System.out.println("A soma entre A e B é igual a C");
		
	}

}
