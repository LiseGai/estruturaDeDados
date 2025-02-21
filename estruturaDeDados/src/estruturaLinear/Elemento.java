package estruturaLinear;

public class Elemento<TIPO> {
	private TIPO valor;
	private Elemento<TIPO> proximo;
	
	//Recebendo o valor gerado em cadastro:
	public Elemento(TIPO novoValor) {
		this.valor=novoValor;
	}
	
	//Colocar getter setter
	public TIPO getValor() {
		return valor;
	}
	public void setValor(TIPO valor) {
		this.valor = valor;
	}
	public Elemento<TIPO> getProximo() {
		return proximo;
	}
	public void setProximo(Elemento<TIPO> proximo) {
		this.proximo = proximo;
	}
	
}
