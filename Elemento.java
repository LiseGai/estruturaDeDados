package arvoreBinaria;

public class Elemento<TIPO> {
	/*
	 * Sao os tipos de dados que vai ter ali dentro que vao ser do tipo genérico TIPO
	 */
	
	private TIPO valor;
	public Elemento(TIPO novoValor) {
		this.valor=novoValor;
		this.direita=null;
		this.esquerda=null;
	}

	public TIPO getValor() {
		return valor;
	}

	public void setValor(TIPO valor) {
		this.valor = valor;
	} 
	
	private Elemento<TIPO> esquerda; 
	private Elemento<TIPO> direita;
	
	public Elemento<TIPO> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<TIPO> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento<TIPO> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<TIPO> direita) {
		this.direita = direita;
	}
	
	

}
