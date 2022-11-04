package br.cesed.p3.listas.encadeadas;

public class MeuDequeEncadeada extends EstruturaEncadeadaGenerica {
	
	public void enqueueLast(Conta conta) {
		addLast(conta);
	}

	public void enqueueFirst(Conta conta) {
		addFirst(conta);
	}
	
	public Object dequeueFirst() {
		return removeFirst();
	}
	
	public Object dequeueLast() {
		return removeLast();
	}

}
