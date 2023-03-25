package Exercicio1;

public class Cliente {
		
	
	private String nome;
	private int idade;
	private String endereco;
	private String email;
	private String nomeDaMae;
	
	public Cliente(String nome, int idade, String endereco, String email, String nomeDaMae) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.email = email;
		this.nomeDaMae = nomeDaMae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public void visualizar() {
		
		System.out.println("************************************************");
		System.out.println("          DADOS DO CLIENTE        ");
		System.out.println("************************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("E-mail: " + this.email);
		System.out.println("Nome da mãe: " + this.nomeDaMae);
		
	}
	
}
