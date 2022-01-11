
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2424);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 2424);
		Conta conta3 = new Conta(13337, 24234);
		
		//consultando o atributo da classe
		System.out.println(Conta.getTotal());
		
		
	}
}
