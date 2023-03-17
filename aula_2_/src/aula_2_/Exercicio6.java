package aula_2_;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		String nome;
		int codigo;
		float salario;
		
		System.out.println("Informe o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Informe o número correspondente ao cargo: ");
		System.out.println("1\t para Gerente");
		System.out.println("2\t para Vendedor");
		System.out.println("3\t para Supervisor");
		System.out.println("4\t para Motorista");
		System.out.println("5\t para Estoquista");
		System.out.println("6\t para Técnico de TI");
		
		codigo = leia.nextInt();
		
		System.out.println("Informa o salário atual: ");
		
		salario = leia.nextFloat();
		
		switch (codigo){
		case 1: 
			System.out.println(nome + ", cargo: Gerente " + "\tNovo salario: " + df.format(salario + (salario * 1.10)));
			break;
			
		case 2:	
			System.out.println(nome + ", cargo: Vendedor " + "\tNovo salario: " + df.format(salario + (salario * 0.07)));
			break;
		
			
		case 3:	
			System.out.println(nome + ", cargo: Supervisora " + "\tNovo salario: " + df.format(salario + (salario * 0.09)));;
			break;
			
			
		case 4:	
			System.out.println(nome + ", cargo: Motorista " + "\tNovo salario: " + df.format(salario + (salario * 0.06)));
			break;
			
			
		case 5:	
			System.out.println(nome + ", cargo: Estoquista " + "\tNovo salario: " + df.format(salario + (salario * 0.05)));
			break;
			
			
		case 6:	
			System.out.println(nome + ", cargo: Tecnico de TI" + "\tNovo salario: " + df.format(salario + (salario * 0.08)));
			break;
			
		}
		
	}

}