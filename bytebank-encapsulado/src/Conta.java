public class Conta {
	// atributo da instancia
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// atributo da classe | atributo compartilhado
	private static int total;
	
	// vc quer criar uma conta? vc precisa passar isso isso e isso
	// Construtor padrão - quando vc nao escreve, ele cria invisivelmente e executa sempre que constroi uma conta
	// ele nao é um metodo, sim uma rotina de execucao. funciona somente quando dá um New
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;	
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("nao pode valor igual ou menor 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor igual menor a zero");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}