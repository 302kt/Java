import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int numero; 
		
		 	numeros.add(34);
	        numeros.add(100);
	        numeros.add(20);
	        numeros.add(21);
	        numeros.add(24);
	        numeros.add(200);
	        numeros.add(300);
	        numeros.add(500);
	        numeros.add(400);
	        numeros.add(8);
	        
	        
		System.out.println("Informe um número");
		numero = leia.nextInt();
		
		if (numeros.contains(numero))
			System.out.println("Número encontrado.");
		
		else 
			System.out.println("Número não encontrado.");
		
		
		
	}

}
