
public class TesteConexao {

	public static void main(String[] args) {
		
		// a partir do java 1.7 - exige q a classe implemente a classe autocloseabe
		try (Conexao conexao = new Conexao() ){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("deu erro na conexao");
		}
		
		
		
		
		
		
		
		
		
	// codigo de baix foi substituido pelo de cima	
		
		/*
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("deu erro na conexao");
		} finally {
			con.fecha();
		}*/
		
	} 

}
