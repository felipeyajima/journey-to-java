//Interface - classe abstrata com todos os metodos abstratos, nada concreto (necessario manter somente as assinaturas)
public abstract interface Autenticavel {


	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
