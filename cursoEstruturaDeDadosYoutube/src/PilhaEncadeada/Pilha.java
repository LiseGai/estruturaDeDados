package PilhaEncadeada;

public class Pilha<TIPO> implements TADPilhaEncadeada<TIPO> {
	
	private No<TIPO> cabeca; 
	private int tamanho; 
	
	public Pilha() {
		// TODO Auto-generated constructor stub
		cabeca=null; 
		tamanho=0; 
	}

	@Override
	public void adicionarTopo(TIPO valor) {
		// TODO Auto-generated method stub
		No<TIPO> novoNo= new No<TIPO>(valor,null);
		novoNo.setValor(valor);
		if (pilhaVazia()) {
			cabeca=novoNo; 
			
		} else {
			novoNo.setProximo(cabeca);
			cabeca=novoNo;
		}
		tamanho++;
		
	}

	@Override
	public TIPO excluirTopo() {
		if (pilhaVazia()) {
			System.out.println("Impossivel excluir, pilha vazia");
			return null; 
		}
		No<TIPO> noRemovido=cabeca; 
		cabeca=cabeca.getProximo();
		noRemovido.setProximo(null);
		tamanho--;
		return noRemovido.getValor(); 
	}

	@Override
	public boolean pilhaVazia() {
		// TODO Auto-generated method stub
		return tamanho==0 ? true : false; 
	}

	@Override
	public void imprimirPilha() {
		// TODO Auto-generated method stub
		if (pilhaVazia()) {
			System.out.println("Impossivel imprimir, pilha vazia");
			return;
		}
		No<TIPO> aux = cabeca;
		while (aux!=null) {
			System.out.println(aux.getValor());
			aux=aux.getProximo();
		}
		
	}

}
