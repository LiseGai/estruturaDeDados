package PilhaEncadeada;

public class No<TIPO> {
	private TIPO valor; 
	private No proximo; 

	public No(TIPO valor, No proximo) {
		// TODO Auto-generated constructor stub
		this.valor=valor; 
		this.proximo=proximo;
	}

	public TIPO getValor() {
		return valor;
	}

	public void setValor(TIPO valor) {
		this.valor = valor;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	

}
