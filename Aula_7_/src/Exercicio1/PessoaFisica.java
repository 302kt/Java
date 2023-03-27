package Exercicio1;

public class PessoaFisica extends Cliente{
	
		private String numeroDoCpf;

		/**
		 * @param nome
		 * @param idade
		 * @param endereco
		 * @param email
		 * @param nomeDaMae
		 * @param numeroDoCpf
		 */
		public PessoaFisica(String nome, int idade, String endereco, String email, String nomeDaMae,
				String numeroDoCpf) {
			super(nome, idade, endereco, email, nomeDaMae);
			this.numeroDoCpf = numeroDoCpf;
		}

		public String getNumeroDoCpf() {
			return numeroDoCpf;
		}

		public void setNumeroDoCpf(String numeroDoCpf) {
			this.numeroDoCpf = numeroDoCpf;
		}
		
		public void visualizar() {
			super.visualizar();
			System.out.println("Numero do CPF: " + this.numeroDoCpf);
		}
}
