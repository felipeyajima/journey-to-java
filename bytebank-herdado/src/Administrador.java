
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Administrador() {
		// Composicao - quando cria o objeto gerente, automaticamente cria o objeto autinticacaoutil, onde vc colocou toda
		// a logica de autenticacao
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
}
