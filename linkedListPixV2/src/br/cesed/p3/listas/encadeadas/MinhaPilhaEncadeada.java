package br.cesed.p3.listas.encadeadas;



public class MinhaPilhaEncadeada extends EstruturaEncadeadaGenerica {


	public void push(Conta conta) {
		addLast(conta);
	}

	public Conta pop() {
		return removeLast();
	}

	public Conta top() throws PosicaoInvalidaException {
		return super.get(size()-1);
	}

	public Conta peek() throws PosicaoInvalidaException {
		return top();
	}
}
