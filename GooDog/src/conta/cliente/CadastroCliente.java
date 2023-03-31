package conta.cliente;

public class CadastroCliente {
		
			private String nomeDono;
			private String nomePet;
			private String raca;
			private String endereco;
			private String email;
			/**
			 * @param nomeDono
			 * @param nomePet
			 * @param raca
			 * @param endereco
			 * @param email
			 */
			public CadastroCliente(String nomeDono, String nomePet, String raca, String endereco, String email) {
				this.nomeDono = nomeDono;
				this.nomePet = nomePet;
				this.raca = raca;
				this.endereco = endereco;
				this.email = email;
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
			public String getRaca() {
				return raca;
			}
			public void setRaca(String raca) {
				this.raca = raca;
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
			
			public void visualizar() {
				System.out.println("Nome completo do Dono: " + this.getNomeDono());
				System.out.println("E-mail: " + this.getEmail());
				System.out.println("Informe o nome do Pet: " + this.getNomePet() );
				System.out.println("Informe a raça do Pet: " + this.raca);
				System.out.println("Informe o seu endereço" + this.getEndereco());
				
			}
			
			
			
	}

