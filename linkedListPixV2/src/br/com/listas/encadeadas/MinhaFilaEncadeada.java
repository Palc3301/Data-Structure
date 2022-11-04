package br.com.listas.encadeadas;

public class MinhaFilaEncadeada extends EstruturaEncadeadaGenerica {

	public void enqueue(Conta conta) {
		addLast(conta);
	}
	
	public Conta dequeue() {
		return removeFirst();
	}
}
