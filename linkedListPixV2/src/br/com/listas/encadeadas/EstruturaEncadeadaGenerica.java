package br.com.listas.encadeadas;


public abstract class EstruturaEncadeadaGenerica {
	
	private Conta cabeca;
	private int inseridos;
	
	public void clear() {
		cabeca = null;
		inseridos = 0;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
	public void addFirst(Conta novaConta) {
		
		if(cabeca == null) {
			cabeca = novaConta;
		} else {
			Conta temp = cabeca;
			cabeca = novaConta;
			cabeca.proximo = temp;
		}
		
		inseridos++;
	}
	
	public void imprimir() {
		
		Conta temp = cabeca;
		
		System.out.println(temp.getTitular());
		
		while(temp.proximo != null) {
			temp = temp.proximo;
			System.out.println(temp.getTitular());
		}
	}

	public void addLast(Conta novaConta) {
		
		if(cabeca == null) {
			cabeca = novaConta;
		} else {
			
			Conta temp = cabeca;
			
			while(temp.proximo != null) {
				temp = temp.proximo;
			}
			
			temp.proximo = novaConta;
		}
		
		inseridos++;
	}
	
	public Conta removeFirst() {

		Conta first = null;

		if(cabeca != null) {
			cabeca = cabeca.proximo;
			inseridos--;
		}
		
		return first;
	}

	public Conta removeLast() {
		
		Conta last = null;
		
		if(inseridos == 0 || inseridos == 1) {
			last = cabeca; //guardar pra retornar
			cabeca = null;
			inseridos = 0;
			
		} else {

			Conta temp = cabeca;
			
			for (int i = 0; i < inseridos - 2; i++) {
				temp = temp.proximo;
			}
	
			last = temp.proximo; //guardar pra retornar 
			temp.proximo = null;
			inseridos--;
		}
		
		return last;
	}
	
	public Conta get(int indice) {
		
		Conta elementoBuscado = null;
		
		if(inseridos == 0) {
			elementoBuscado = cabeca;
		} else {
			
			Conta temp = cabeca;
			
			for (int i = 0; i < inseridos - 1; i++) {
				temp = temp.proximo;
			}
			
			elementoBuscado = temp;
		}
		
		return elementoBuscado;
	}
	
	public int size() {
		return inseridos;
	}
	

}
