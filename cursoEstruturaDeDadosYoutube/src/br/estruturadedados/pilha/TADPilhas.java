package br.estruturadedados.pilha;

public interface TADPilhas {
	/**
	 * Operaçoes principais: 
	 * - Adicionar item ao topo da pilha
	 * - Retirar item do topo da pilha 
	 * 
	 * Operaçoes secundarias: 
	 * - Pilha ta cheia 
	 * - Pilha ta vazia
	 * - imprimir pilha
	 */
	
	//Adicionando ao topo: 
	public void adicionarTopo(Integer valor);
	
	//Remover do topo: 
	public Integer removerTopo();
	
	//Pilha ta cheia? 
	public boolean pilhaCheia();
	
	//Pilha ta vazia? 
	public boolean pilhaVazia();
	
	//imprimir pilha: 
	public void imprimirPilha();

}
