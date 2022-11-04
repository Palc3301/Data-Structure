package br.com.arraylistpix;

public abstract class EstruturaLinearGenerica {

	private static final int ALOCACAO_INICIAL = 3;
	
	private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];
	
	private int inseridos;
	
	public void addLast(Object novoElemento) {

		verificarTamanhoMaximo();
		
		arrayInterno[inseridos] = novoElemento;
		inseridos++;
	}

	public void addFirst(Object novoElemento) {

		verificarTamanhoMaximo();
		
		if(isEmpty()) {
			arrayInterno[inseridos] = novoElemento;
			
		} else {
			
			for (int i = inseridos; i > 0; i--) {
				arrayInterno[i] = arrayInterno[i-1]; 
			}
			
			arrayInterno[0] = novoElemento;
		}
		
		inseridos++;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}

	private void verificarTamanhoMaximo() {
		
		if(arrayInterno.length == inseridos) {
			
			Object[] arrayMaior = new Object[inseridos * 2];
			
			for (int i = 0; i < arrayInterno.length; i++) {
				arrayMaior[i] = arrayInterno[i];
			}
			
			arrayInterno = arrayMaior;
		}
	}
	
	public Object removeLast() {
		
		Object last = null;

		if(inseridos > 0) {
			last = arrayInterno[inseridos - 1];
			arrayInterno[inseridos - 1] =  null;
			inseridos--;
		}
		
		return last;
	}
	
	public Object removeFirst() {
		
		Object first = arrayInterno[0];
		
		if(inseridos == 0 || inseridos == 1) {
			arrayInterno[0] = null;
			inseridos = 0;
		} else {
			
			for (int i = 0; i < inseridos - 1; i++) {
				arrayInterno[i] = arrayInterno[i+1];	
			}
			
			arrayInterno[inseridos - 1] = null;
			inseridos--;
		}
		
		return first;
	}
	
	public void clear() {
		inseridos = 0;
		arrayInterno = new Object[ALOCACAO_INICIAL];
	}
	
	public Object get(int indice) throws PosicaoInvalidaException {
		
		if(indice < 0 || indice >= inseridos) {
			throw new PosicaoInvalidaException();
		}
		
		return arrayInterno[indice];
	}
	
	public int size() {
		return inseridos;
	}
	
	
	
}
