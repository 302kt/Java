
public class Usuário {

	private String email;
	private String senha;
	
	public Usuário(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * @param email
	 * @param senha
	 */
	
	public void visualizar() {
		System.out.println("Digite o E-mail: " + this.email);
		System.out.println("Digite a sua senha: " + this.senha);
	}
}
