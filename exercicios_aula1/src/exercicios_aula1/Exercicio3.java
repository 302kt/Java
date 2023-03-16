package exercicios_aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, Descontos, salarioLiquido;
		
		System.out.println("Informe seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Informe o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Informe as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Informe o valor dos descontos: ");
		Descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - Descontos;
		
		System.out.println("O valor do salário líquido é: " + df.format(salarioLiquido));
		
		
	}

}
