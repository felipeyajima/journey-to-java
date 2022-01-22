
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
	

	public void setCpf(String cpf) {
		if (cpf.length() != 11) {
			throw new CpfInvalidoException("cpf invalido");
		} else {
			this.cpf = cpf;
		}
	}
	
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
