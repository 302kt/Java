package aula_4_;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetoresInteiros[] = {1, 6, 7, 3, 2, 4, 8, 9, 10, 5};
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		for (int contador = 0; contador < vetoresInteiros.length; contador++) {
			if (vetoresInteiros[contador] == numero) {
				System.out.println("O número informado está na posição [" + contador + "]");
				System.exit(0);}
			}
		for (int contador = 0; contador < vetoresInteiros.length; contador++) {
		 if (numero != vetoresInteiros[contador]) {
			 System.out.println("Número não encontrado.");
		 	System.exit(0);}
		}
		
	}

}
