package br.com.arraylistpix;

public class MinhaFila extends EstruturaLinearGenerica {

	public void enqueue(Object obj) {
		addLast(obj);
	}
	
	public Object dequeue() {
		return removeFirst();
	}
}
