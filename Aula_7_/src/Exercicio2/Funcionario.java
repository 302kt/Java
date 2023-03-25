package Exercicio2;

public class Funcionario {

	
	private String nome;
	private String email;
	private String cargo;
	private float salario;
	private boolean ativo;
	public Funcionario(String nome, String email, String cargo, Float salario, boolean ativo) {
		this.salario = salario;
		this.email = email;
		this.cargo = cargo;
		this.nome = nome;
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void nome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void visualizar() {
		
		System.out.println("************************************************");
		System.out.println("       DADOS DO FUNCIONÁRIO     ");
		System.out.println("************************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário " + this.salario);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ativo: " + this.ativo);
		
	}
}
