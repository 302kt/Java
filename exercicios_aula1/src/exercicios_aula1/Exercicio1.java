package exercicios_aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		// variáveis que o sistema precisa ler
		Scanner leia = new Scanner(System.in);
		float salario, abono, novo_salario;
		
		// escreva(como no portugol)
		System.out.println("Digite seu salário: ");
		// comando ler (scanner)
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		// função soma para calcular o abono
		novo_salario = (salario + abono);
		
		// resultado final do programa
		System.out.println("Seu novo salário é: R$" + df.format(novo_salario));
		
	}

}
