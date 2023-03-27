package conta.model;

public class ContaPoupança extends conta {
	
	
	private int aniversario;

	public ContaPoupança(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public void visualizar() {
		
	}
}
