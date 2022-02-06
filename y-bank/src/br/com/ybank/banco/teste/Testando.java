package br.com.ybank.banco.teste;
import br.com.ybank.banco.modelo.Advogado;
import br.com.ybank.banco.modelo.Agencia;
import br.com.ybank.banco.modelo.Cliente;
import br.com.ybank.banco.modelo.CpfInvalidoException;
import br.com.ybank.banco.modelo.GerenteDeAgencia;

public class Testando {

	public static void main(String[] args) {
		
		Advogado advogado = new Advogado();
		advogado.setNome("Felipe Silva");
		// Validando com o try catch a exception unchecked
		try {
		advogado.setCpf("00011133344");
		} catch(CpfInvalidoException ex)  {
			System.out.println("EXCEPTION !!: " + ex.getMessage());
			ex.printStackTrace();	
		}
		
		advogado.setDataNascimento("20/11/1990");
		advogado.setNomeMae("Julia Silva");
		advogado.setNomePai("Jonas Souza");
		advogado.setSalario(2000.0);
		advogado.setMatricula(123);
		
		System.out.println(advogado.getSalario());
		System.out.println(advogado.getNome());
		
		
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Juliano Ferraz");
		// Validando com o try catch a exception unchecked

		try {
			cliente.setCpf("33332222222");
		} catch(CpfInvalidoException ex) {
			System.out.println("EXCEPTION !!: " + ex.getMessage());
			ex.printStackTrace();	
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
		gerenteDeAgencia.setNome("Rodrigo Gomes");
		
		try {
		gerenteDeAgencia.setCpf("11122233355");
		} catch(CpfInvalidoException ex) {
			System.out.println("EXCEPTION !!: " + ex.getMessage());
			ex.printStackTrace();	
		}
		
		gerenteDeAgencia.setDataNascimento("20/11/1901");
		gerenteDeAgencia.setNomeMae("Rosana Oliveira");
		gerenteDeAgencia.setNomePai("Juca da Silva");
		gerenteDeAgencia.setSalario(3000.0);
		gerenteDeAgencia.setMatricula(1233);
		
		gerenteDeAgencia.setAgenciaAtuante(agencia);
		
		System.out.println(gerenteDeAgencia.getAgenciaAtuante().getLogradouro());
		

	}



}
