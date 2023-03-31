package conta.cliente;

public class Pacote {

		int numeroPacote;

		/**
		 * @param numeroPacote
		 */
		public Pacote(int numeroPacote) {
		this.numeroPacote = numeroPacote;
		}

		public int getNumeroPacote() {
			return numeroPacote;
		}

		public void setNumeroPacote(int numeroPacote) {
			this.numeroPacote = numeroPacote;
		}
		 
		public void visualizar() {
			System.out.println("Pacote ativo: " + this.numeroPacote);
		}
		
		
}
