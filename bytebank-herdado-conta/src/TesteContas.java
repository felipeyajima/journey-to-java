
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 1111);
		cc.deposita(100.0);
		//cc.saca(1.0);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 2222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
	}
	
	
}
