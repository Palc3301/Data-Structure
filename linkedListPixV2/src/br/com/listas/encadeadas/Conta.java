package br.com.listas.encadeadas;

public class Conta {

	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	
	Conta proximo;

	public Conta(int agencia, int conta, String titular, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
