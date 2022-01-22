
public class Testando {

	public static void main(String[] args) {
		
		Advogado advogado = new Advogado();
		advogado.setNome("Felipe Yajima Batista");
		advogado.setCpf("39990055807");
		advogado.setDataNascimento("20/11/1990");
		advogado.setNomeMae("Marta Toshico Yajima Batista");
		advogado.setNomePai("Joao da Rocha Batista");
		advogado.setSalario(2000.0);
		advogado.setMatricula(123);
		
		System.out.println(advogado.getSalario());
		System.out.println(advogado.getNome());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Juliano Ferraz");
		
		try {
			cliente.setCpf("33322233222");
		} catch(CpfInvalidoException ex) {
			System.out.println("EXCEPTION !!: " + ex.getMessage());
		}
		
		cliente.setDataNascimento("31/01/2000");
		cliente.setNomeMae("Maria dos Santos");
		cliente.setNomePai("Jose da Silva");
		cliente.setNumeroCliente(1234);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getNumeroCliente());	
		
		
		Agencia agencia = new Agencia();
		agencia.setPais("Brasil");
		agencia.setEstado("São Paulo");
		agencia.setCidade("São Bernardo do Campo");
		agencia.setLogradouro("Rua Marechal Deodoro");
		agencia.setNumeroLogradouro("123");
		agencia.setNumeroAgencia(22333);
		
		
		GerenteDeAgencia gerenteDeAgencia = new GerenteDeAgencia();
		gerenteDeAgencia.setNome("Patrick Yajima Batista");
		gerenteDeAgencia.setCpf("39990056889");
		gerenteDeAgencia.setDataNascimento("20/11/1991");
		gerenteDeAgencia.setNomeMae("Marta Toshico Yajima Batista");
		gerenteDeAgencia.setNomePai("Joao da Rocha Batista");
		gerenteDeAgencia.setSalario(3000.0);
		gerenteDeAgencia.setMatricula(1233);
		
		gerenteDeAgencia.setAgenciaAtuante(agencia);
		
		System.out.println(gerenteDeAgencia.getAgenciaAtuante().getLogradouro());
		

	}



}
