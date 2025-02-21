package br.estruturadedados.lista;

public interface TADLista<TIPO> {
	/*
	 * Operaçoes principais: 
	 * - Adicionar elementos (inicio, final, posiçao)
	 * - Remover elementos (inicio, final, posiçao)
	 * 
	 * Operaçoes secundarias: 
	 * - Lista ta cheia
	 * - Lista ta vazia
	 * - Imprimir a lista
	 */
	
	//ADICIONANDO ELEMENTOS:
	//public void insereElemento(Integer valor);
	//public void insereElementoPosicao(Integer valor, int posicao);
	//public void insereElementoFinal(Integer valor);
	//Ou...
	public void insereValor(TIPO valor, int posicao);
	
	//REMOVENDO ELEMENTOS: 
	public TIPO excluiValor(int indice); //Indice do valor que quero remover
	
	//LISTA CHEIA:
	public boolean listaCheia();
	
	//LISTA VAZIA:
	public boolean listaVazia();
	
	//IMPRIMIR LISTA:
	public void imprimirLista();

}
