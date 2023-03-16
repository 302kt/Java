package aula_1_;

import java.util.Scanner;

public class Aula_1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
				double numero1, numero2;
		String nome;
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Olá, " + nome + ".");
		System.out.println("Digite o primeiro número: ");
		numero1= leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2= leia.nextDouble();
		System.out.println("Soma= " + (numero1 + numero2));
		System.out.println("Diferença= " + (numero1 - numero2));
		System.out.println("Divisão= " + (numero1 / numero2));
		System.out.println("Potência= " + (Math.pow(numero1, numero2)));
		System.out.println("Raiz quadrada= " + (Math.sqrt(numero1)));
		
	}

}
