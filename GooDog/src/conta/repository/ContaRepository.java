package conta.repository;

import conta.cliente.CadastroCliente;
import conta.cliente.Pacote;


public interface ContaRepository {

	
	public void listarTodas();
	public void cadastrar(CadastroCliente cadastro);
	public void deletar (Pacote numero);
}
