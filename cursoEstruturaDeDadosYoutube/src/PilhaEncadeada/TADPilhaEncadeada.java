package PilhaEncadeada;

public interface TADPilhaEncadeada<TIPO> {
	//Operaçoes principais: 
	//1-adicionar
	//2- excluir
	
	public void adicionarTopo(TIPO valor);
	public TIPO excluirTopo();
	
	//Operaçoes secundarias:
	/*
	 * 1- Pilha vazia 
	 * 2- Imprimir pilha
	 */
	
	public boolean pilhaVazia();
	public void imprimirPilha();

}
