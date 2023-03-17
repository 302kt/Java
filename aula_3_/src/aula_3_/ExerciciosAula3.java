package aula_3_;

import java.util.Scanner;

public class ExerciciosAula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int num1, num2;
	
		
		System.out.println("Informe o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Informe o segundo número do intervalo: ");
		num2 = leia.nextInt();
			if (num2 <= num1) {
			System.out.println("Intervalo incorreto.");
			System.exit(0);}
		
		System.out.println("No intervalo entre os número: " + num1 + " e " + num2);
		
		for(int multi = num1; multi <= num2; multi++)
			if(multi % 3==0 && multi % 5 ==0)
				System.out.println("São multiplos de 3 e 5: " + multi);
		
		
		
		

	}

}
