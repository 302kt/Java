package aula_2_;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int num;

		System.out.println("Informe um número");
		num = leia.nextInt();

		if (num < 0 && num %2 == 0 )
			System.out.println("O numero é par e negativo");
		
		else if (num < 0 && num %2 != 0 )
			System.out.println("O numero é impar e negativo");
		
			
		if (num >= 0 && num %2 != 0 )
			System.out.println("O numero é impar e positivo");
		
		else if (num >= 0 && num %2 == 0 )
			System.out.println("O numero é par e positivo");
		
		
	}

}
