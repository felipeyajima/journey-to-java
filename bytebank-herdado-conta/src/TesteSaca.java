
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 332);
		conta.deposita(200.0);
		
		try {
		conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			
			System.out.println("Exceptioin: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
		
		
		
	}

}

















// QUando a excecao é unchecked e extende a RuntimeException
/*public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 332);
		conta.deposita(200.0);
		
		try {
		conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			
			System.out.println("Exceptioin: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
		
		
		
	}

}
*/