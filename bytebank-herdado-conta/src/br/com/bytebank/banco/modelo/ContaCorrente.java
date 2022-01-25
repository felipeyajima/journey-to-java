package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta {
	
	//quando vc extende uma classe, vc nao herda os contrutores e vc tem que reescrever. Desta maneira quando vc cria
	//uma conta, vc precisa atender os requisitos da criacao da conta da classe mãe
	public ContaCorrente(int agencia, int numero) {
		//passa os parametros para o construtor especifico
		super(agencia, numero);
		
	}
	
	
	
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}




	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
}
