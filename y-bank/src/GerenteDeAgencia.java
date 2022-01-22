
public class GerenteDeAgencia extends Funcionario implements AgenciaDeAtuacao {
	
	
	private Agencia agenciaAtuante;
	
	@Override
	public void setAgenciaAtuante(Agencia agenciaAtuante) {
		this.agenciaAtuante = agenciaAtuante;
	}
	
	public Agencia getAgenciaAtuante() {
		return this.agenciaAtuante;
	}

	
	
	
}
