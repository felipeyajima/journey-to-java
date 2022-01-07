
public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 1270.50;
		
		// Casting para forçar a transformação do double para int
		int valor = (int) salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		
		long numeroGrande = 2664646464646464L;
		
		// 16bits
		short valorPequeno = 2131;
		
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
