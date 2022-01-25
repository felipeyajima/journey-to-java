package br.com.ybank.banco.modelo;

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
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomeMae() {
		return this.nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	
}
