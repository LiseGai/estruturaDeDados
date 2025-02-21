package fila;

import estruturaLinear.listaEncadeada;

public class Fila {

		/*
		 * Alguém que entra na fila, sempre vai entrar no final dela e sempre sai do começo. Por
		 * isso que nao é um estrutura de dados e sim um tipo abstrato de dados. Por isso, se pode
		 * fazer uma fila com lista ligada/encadeada. Pode ser feita com vetor, mais vai precisar
		 * manipular ele inteiro a cada vez que retirar um elemento inicial e isso é trabalho
		 * demais
		 * 
		 * Primeiro, precisa fazer a listaEncadeada
		 */
	
	private listaEncadeada lista;
	
	public Fila() {
		this.lista= new listaEncadeada();
	}
	
	
	//Operaçoes que lista Encadeada precisam:
	
	public void adicionar(String novoValor) {
		this.lista.Adicionar(novoValor); //O método adicionar adiciona no final 
	}
	
	public void remover() { //Nao precisa passar parametro, porque vai ser sempre o primeiro 
		this.lista.Remover(this.get()); //Como o get sempre pega o primeiro da lista, remove o 
		//elemento do get
	}
	
	public String get() { //Sempre o mesmo tipo da lista encadeada (nesse caso, string)
		//Sempre pega primeiro da fila
		return (String) this.lista.getPrimeiro().getValor();
	}


}
