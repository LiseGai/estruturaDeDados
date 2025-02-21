package br.estruturadedados.pilha;

public class Pilha implements TADPilhas {
	
	//Considera-se o topo o indice 0 do vetor e a posicao acompanha o elemento mais na direita
	
	private Integer[] pilha;
	private int posicao; 
	
	public Pilha(int tamanho) {
		pilha = new Integer[tamanho];
		posicao=-1;
		
	}

	@Override
	public void adicionarTopo(Integer valor) {
		// TODO Auto-generated method stub
		
		if (pilhaCheia()) {
			System.out.println("A pilha esta cheia, impossivel adicionar o valor");
			return;
		}
		for (int i=posicao; i>=0; i--) {
			pilha[i+1]=pilha[i];
			
		}
		pilha[0]=valor;
		posicao++;

	}

	@Override
	public Integer removerTopo() {
		// TODO Auto-generated method stub
		
		if (pilhaVazia()) {
			System.out.println("A pilha esta vazia, impossivel de adicionar o valor");
			return null;
		}
		
		int valortopo=pilha[0];
		for (int i=0; i<posicao; i++) {
			pilha[i]=pilha[i+1];
		}
		pilha[posicao]=null;
		posicao--;
		return valortopo;
	}

	@Override
	public boolean pilhaCheia() {
		// TODO Auto-generated method stub
		
		if (posicao == pilha.length-1) {
			System.out.println("A pilha ta cheia e o valor nao foi adicionado");
			return true;
		}
		
		return false;
	}

	@Override
	public boolean pilhaVazia() {
		// TODO Auto-generated method stub
		
		if (posicao==-1) {
			System.out.println("A pilha ta vazia, impossivel remover");
			return true;
		}
		
		return false;
	}

	@Override
	public void imprimirPilha() {
		// TODO Auto-generated method stub
		
		if(pilhaVazia()) {
			System.out.println("A pilha nao tem elementos");
		}
		for (int i=0; i<=posicao; i++) {
			System.out.println(pilha[i]);
		}
		System.out.println();

	}

}
