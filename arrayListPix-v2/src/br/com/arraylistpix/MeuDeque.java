package br.com.arraylistpix;

public class MeuDeque extends EstruturaLinearGenerica {

	public void enqueueLast(Object obj) {
		addLast(obj);
	}

	public void enqueueFirst(Object obj) {
		addFirst(obj);
	}
	
	public Object dequeueFirst() {
		return removeFirst();
	}
	
	public Object dequeueLast() {
		return removeLast();
	}
}
