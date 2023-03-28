
public class NovoCliente extends Usuário {
	
	private String nomeDono;
	private String nomePet;
	private String raça;
	private String endereço;
	
	public NovoCliente(String email, String senha) {
		super(email, senha);
		// TODO Auto-generated constructor stub
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void visualizar() {
		System.out.println("Informe o nome completo do Dono: ");
		System.out.println("Informe o nome do Pet: " );
		System.out.println("Informe a raça do Pet: ");
		System.out.println("Informe o seu endereço");
	}
}