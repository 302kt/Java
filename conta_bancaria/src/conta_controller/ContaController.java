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
		var buscaConta = buscarNaCollection(conta.getNumero());
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			
	}else
		System.out.println("A Conta não foi encontrada!");
	}
	
	public void deletar(int numero) {
			
		    var conta = buscarNaCollection(numero);
			if(conta != null) {
			if (listaContas.remove(conta) == true);
			System.out.println("A Conta foi excluída!");
			}else
			System.out.println("A Conta não foi encontrada!");
		
	}

	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		if (conta != null) {
			if (conta.sacar(valor) == true) {
				System.out.println("Saque efetuado com sucesso!");
			}
		} else {
			System.out.println("A conta não foi encontrada!");
		}
		
	}

	
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.depositar(valor);
			System.out.println("Deposito efetuado com sucesso!");
		} else {
			System.out.println("A conta não foi encontrada!");
		}
	}

	
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);

		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("Transferencia efetuads!");
			}

		} else {
			System.out.println("A conta não foi encontrada!");
		}
		
	}
	
	
	public int gerarNumero() {
		return ++numero;
	}

	public conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}}return null;
	}
	
	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}}return 0;
	}
}

