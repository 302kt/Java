package Exercicio2;

public class testeFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Funcionario dados = new Funcionario("Katarina", "kpf.freire@gmail.com", "Desenvolvedora Junior", 4200.0f, true);
		Funcionario dados2 = new Funcionario("Diego Ferreira", "diego.ferreira@gmail.com", "Desenvolvedor Junior", 4100.0f, false);
			
			dados.visualizar();
			dados2.visualizar();
		
	}

}
