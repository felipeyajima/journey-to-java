package br.com.ybank.banco.modelo;
// checked ou uncheckd é algo apenas relacionado a compilacao, no final é tratado tudo da mesma forma

// Unchecked - quando extendem a RuntimeException  (nao sao verificado pelo compilador)
// Checked - quando extendem direto a Exception, porém exige que deixe explicito no metodo que for usar a excecao (verificado pelo compilador)...ele te lembra quem usa o metodo, que é um metodo que tem uma excecao e perigoso,

// se acha q ele nao necessita fazer uma verificacao ou se ele pode fazer um tratamento se quiser, (Unchecked)
// se vc gostaria de informar seu desenvolvedor, faz um tratamento aqui, pode ser perigoso (Checked)



// EXCECAO CHECKED !!!!
public class CpfInvalidoException extends Exception {
	
	public CpfInvalidoException(String msg) {
		super(msg);
	}
	
}
