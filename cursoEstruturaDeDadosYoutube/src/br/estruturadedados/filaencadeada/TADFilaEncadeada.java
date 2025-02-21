package br.estruturadedados.filaencadeada;
/*
 * TAD (Tipo abstrato de dados) 
 */

public interface TADFilaEncadeada <TIPO> {
	
	/*
	 * Operaçoes principais: 
	 * 1- inserir elemento no final
	 * 2- inserir elemento no meio
	 * 3- inserir elemento no começo 
	 * 4- excluir elemento no final
	 * 5- excluir elemento no meio
	 * 6- excluir elemento no começo 
	 * 
	 */
	
	public void inserirFinal(TIPO valor);
	//public void inserirMeio();
	//public void inserirComeco();
	
	//public void excluirFinal();
	//public void excluirMeio();
	public TIPO excluirComeco();
	
	/*
	 * Operaçoes secundarias 
	 * 1- Fila esta cheia
	 * 2- Fila esta vazia 
	 * 3- Imprimir fila
	 */
	
	//public boolean filaCheia(); //Nao precisa, porque, enquanto tiver espaço na memoria, pode
	//continuar inserindo
	public boolean filaVazia();
	
	public void imprimirFila();

}
