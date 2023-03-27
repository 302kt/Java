package Exercicio1;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente dados = new Cliente("Katarina", 22, "rua Carvalho, 302", "katarina@gmail.com", "Maria");
		Cliente dados2 = new Cliente("Thiago", 21, "rua Alfredo, 43", "thiagoa@gmail.com", "Maria");
		PessoaFisica dados3 = new PessoaFisica("Mariana", 4, "rua Brendon, 302", "mariana@gmail.com", "Katarina Pereira", "10987654321");
		PessoaFisica dados4 = new PessoaFisica("Marta", 15, "rua Ciello, 302", "marta@gmail.com", "Katarina Pereira", "12345678910");		
				dados.visualizar();
				
				dados2.visualizar();
				
				dados3.visualizar();
				
				dados4.visualizar();
		PessoaJuridica dados5 = new PessoaJuridica("Marta", 15, "rua Ramos, 302", "marta@gmail.com", "Katarina Pereira", "12345678910");
		dados5.visualizar();
		
		PessoaJuridica dados6 = new PessoaJuridica("Mariana", 4, "rua Ciello, 302", "marta@gmail.com", "Katarina Pereira", "3456271927");
		dados6.visualizar();
	}

}
