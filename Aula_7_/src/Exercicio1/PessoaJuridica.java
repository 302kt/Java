package Exercicio1;

public class PessoaJuridica extends Cliente{

	private String numeroDoCnpj;

	/**
	 * @param nome
	 * @param idade
	 * @param endereco
	 * @param email
	 * @param nomeDaMae
	 * @param numeroDoCnpj
	 */
	public PessoaJuridica(String nome, int idade, String endereco, String email, String nomeDaMae,
			String numeroDoCnpj) {
		super(nome, idade, endereco, email, nomeDaMae);
		this.numeroDoCnpj = numeroDoCnpj;
	}

	public String getNumeroDoCnpj() {
		return numeroDoCnpj;
	}

	public void setNumeroDoCnpj(String numeroDoCnpj) {
		this.numeroDoCnpj = numeroDoCnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Número do CNPJ: " + numeroDoCnpj);
	}
}
