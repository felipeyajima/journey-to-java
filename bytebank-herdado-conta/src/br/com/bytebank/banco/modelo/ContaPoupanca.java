package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	//quando vc extende uma classe, vc nao herda os contrutores e vc tem que reescrever. Desta maneira quando vc cria
	//uma conta, vc precisa atender os requisitos da criacao da conta da classe mãe
	public ContaPoupanca(int agencia, int numero) {
		//passa os parametros para o construtor especifico
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	
	
}
