
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1335, 24246);

		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		
	}
}
