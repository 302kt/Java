package conta.repository;

import conta.model.conta;

public interface contaRepository {

	// CRUD de Conta
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(conta conta);
	public void atualizar(conta conta);
	public void deletar(int numero);
	
	// Métodos Bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
	
	

