package br.estruturadedados.fila;

public interface TADfila {
	/*
	 * Operaçoes principais: 
	 * - adicionar elementos ao final da fila
	 * - remover elementos no começo da fila 
	 * 
	 * Operaçoes secundarias: 
	 * - Verificar se a fila ta cheia (nao pode mais adicionar)
	 * - Verificar se a fila ta vazia (nao pode mais excluir) 
	 * - Imprimir a fila
	 */
	
	public void insereFinal(Integer valor);
		//Interger porque pode ser null o elemento adicionado
	
	public Integer removeComeco();
	
	public boolean filaCheia();
	
	public boolean filaVazia();
	
	public void imprimirFila();
	
	//Agora, criamos uma nova classe pedindo pra implementar a TADFila


}
