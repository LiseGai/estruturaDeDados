package br.estruturadedados.lista;

import java.util.Iterator;

public class Lista<TIPO> implements TADLista<TIPO> {
	
	private TIPO[] lista;
	private int posicao;
	
	public Lista(int tamanho) {
		// TODO Auto-generated constructor stub
		lista = (TIPO[]) new Object[tamanho];
		posicao=-1;
		
	}

	@Override
	public void insereValor(TIPO valor, int indice) {
		// TODO Auto-generated method stub
		
		//VALIDACOES: 
		if (listaCheia()) {
			System.out.println("Impossivel adicionar o valor, lista esta cheia");
			return;
		}
		//Verifica se o indice é valido: 
		if (indice < 0 || indice > (posicao+1)) { //A posiçao aponta o ultimo numero adicionado
			//se pegar maior que posiçao +1, significa que vai ter um null entre eles
			System.out.println("Posiçao invalida");
			return;
		} 
		
		//Desloca todos elementos iguais ou posteriores ao indice uma posicao pra direita:
		for (int i = posicao; i>=indice; i--) {
			lista[i+1]=lista[i];
		}
		lista[indice]=valor;
		posicao++;
		
	}

	@Override
	public TIPO excluiValor(int indice) {
		// TODO Auto-generated method stub
		
		//VALIDACOES: 
		if (listaVazia()) {
			System.out.println("Lista vazia, impossivel excluir valor");
			return null;
		}
		if (indice<0 || indice>posicao) {
			System.out.println("Posicao do elemento invalida, impossivel excluir valor");
			return null;
		}
		//Desloca todos elementos iguais ou maiores ao indice uma casa pra esquerda:
		TIPO valorRemovido=lista[indice]; //Backup
		
		for (int i=indice; i<=posicao;i++) {
			lista[i]=lista[i+1];
		}
		lista[posicao]=null;
		posicao--;
		
		
		
		return valorRemovido;
	}

	@Override
	public boolean listaCheia() {
		// TODO Auto-generated method stub
		
		//VALIDACAO:
		if (posicao==lista.length-1) {
			System.out.println("Lista Cheia");
			return true;
		}
		
		return false;
	}

	@Override
	public boolean listaVazia() {
		// TODO Auto-generated method stub
		
		//Validacao: 
		if(posicao==-1) {
			System.out.println("Lista vazia");
			return true;
		}
		return false;
	}

	@Override
	public void imprimirLista() {
		// TODO Auto-generated method stub
		
		//Validacao: 
		if (listaVazia()) {
			System.out.println("Nenhum elemento a ser exibido");
			return;
		}
		for(int i=0; i<=posicao;i++) {
			System.out.println(lista[i]+"\t\t");
		}
		
	}

}
