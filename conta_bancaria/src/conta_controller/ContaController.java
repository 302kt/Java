package conta_controller;

import java.util.ArrayList;

import conta.model.conta;
import conta.repository.contaRepository;

public class ContaController  implements contaRepository {

	private ArrayList<conta>listaContas = new ArrayList<conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		if(conta != null)
			conta.visualizar();
		else
			System.out.println("A Conta não foi encontrada!");
		
	}

	public void listarTodas() {
	
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	public void cadastrar(conta conta) {
		
		listaContas.add(conta);
		System.out.println("A Conta " + conta.getNumero() + "foi criada!");
	}

	
	public void atualizar(conta conta) {
		
	}

	
	public void deletar(int numero) {
		
	}

	public void sacar(int numero, float valor) {
		
		
	}

	
	public void depositar(int numero, float valor) {
		
	}

	
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
	
		
	}
	
	
	public int gerarNumero() {
		return ++numero;
	}

	public conta buscarNaCollection(int numero) {
		for(var conta : listaContas) {
			if(conta.getNumero()== numero) {
				
			}
		}
		 return null;
	}
}

