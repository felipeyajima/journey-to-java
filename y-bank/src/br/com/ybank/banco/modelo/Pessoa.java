package br.com.ybank.banco.modelo;

/**
 * Classe que representa uma pessoa no sistema.
 * @author Felipe Yajima Batista
 * @version 0.0.1
 */

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String nomePai;
	private String nomeMae;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	// Usando excecao Checked - obrigatorio usar o try catch ou o trows no metodo, do arquivo onde está o Main
	
	/**
	 * Método de definir o DocumentNumber do cliente (CPF), cuja validação seguem as recomendações...
	 * @param cpf
	 * @throws CpfInvalidoException
	 */
	public void setCpf(String cpf) throws CpfInvalidoException{
		if (cpf.length() != 11) {
			throw new CpfInvalidoException("cpf invalido");
		} else {
			this.cpf = cpf;
		}
	}
	
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	
	// Usando excecao Unchecked
	/**
	 * Método de definir a data de nascimento
	 * @param dataNascimento
	 */
	public void setDataNascimento(String dataNascimento) {
		if(dataNascimento.length() != 10) {
			throw new DataNascimentoException("Data nascimento invalida");
		} else {
			this.dataNascimento = dataNascimento;
		}
	}
	
	public String getNomePai() {
		return this.nomePai;
	}
	
	/**
	 * Metodo de definir o nome do Pai. Não obrigatório
	 * @param nomePai
	 */
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomeMae() {
		return this.nomeMae;
	}
	
	/**
	 * Método para definir o nome da Mãe, não obrigatório
	 * @param nomeMae
	 */
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	
}
