package br.com.arraylistpix;

public class MinhaPilha extends EstruturaLinearGenerica {

	public void push(Object obj) {
		addLast(obj);
	}

	public Object pop() {
		return removeLast();
	}

	public Object top() throws PosicaoInvalidaException {
		return super.get(size()-1);
	}

	public Object peek() throws PosicaoInvalidaException {
		return top();
	}

}
