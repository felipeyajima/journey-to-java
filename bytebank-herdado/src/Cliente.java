// quando vc usa uma interface, vc nao usa extends e sim implements
public class Cliente implements Autenticavel {

	
	private AutenticacaoUtil autenticador;
	
	
	public Cliente() {
		// Composicao - quando cria o objeto gerente, automaticamente cria o objeto autinticacaoutil, onde vc colocou toda
		// a logica de autenticacao
		this.autenticador = new AutenticacaoUtil();
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
