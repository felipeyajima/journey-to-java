
// abstract ngn consegue instanciar essa classe.. apenas corrente e poupanca
public abstract class Conta {
	// atributo da instancia
	
	// visivel para os filhos
	protected double saldo;
	private int agencia;
	private int numero;
	// relacionamento entre classes - Composição
	private Cliente titular;
	// atributo da classe | atributo compartilhado
	private static int total = 0;
	
	// vc quer criar uma conta? vc precisa passar isso isso e isso
	// Construtor padrão - quando vc nao escreve, ele cria invisivelmente e executa sempre que constroi uma conta
	// ele nao é um metodo, sim uma rotina de execucao. funciona somente quando dá um New
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("estou criando uma conta" + this.numero);
	}
	
	
	public abstract void deposita(double valor); // é comum as excessoes serem lancadas no inicio, desta forma o if inverte para testar o falso primeiro
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor sacar: " + valor);
		} 
		
		this.saldo -= valor;
		
		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
		
		
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
	
	// Metodo da classe statico = devolve o total das contas criadas
	public static int getTotal() {
		return Conta.total;
	}
	
}