package Exercicio2;

public class Gerente extends Funcionario{
	
	private int tempoDeEmpresa;

	/**
	 * @param nome
	 * @param email
	 * @param cargo
	 * @param salario
	 * @param ativo
	 * @param tempoDeEmpresa
	 */
	public Gerente(String nome, String email, String cargo, Float salario, boolean ativo, int tempoDeEmpresa) {
		super(nome, email, cargo, salario, ativo);
		this.tempoDeEmpresa = tempoDeEmpresa;
	}
	
	
}
