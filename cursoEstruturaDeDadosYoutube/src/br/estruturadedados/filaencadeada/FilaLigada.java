package br.estruturadedados.filaencadeada;

public class FilaLigada<TIPO> implements TADFilaEncadeada<TIPO>{
	
	private No<TIPO> cabeça; 
	private int tamanho; 


	@Override
	public void inserirFinal(TIPO valor) {
		// TODO Auto-generated method stub
		//Cria um novo objeto pra inserir um novo elemento (Lembra da alocaçao de memoria? 
		//é isso) 
		No<TIPO> novoNo = new No<TIPO>(valor,null);//Passa como parametro o valor e o proximo dele
		if (filaVazia()) {
			cabeça = novoNo;
		} else {
			No<TIPO> aux = cabeça; 
			while(aux.getProximoNo()!=null) {
				aux = aux.getProximoNo();
			}
			aux.setProximoNo(novoNo);
		}
		tamanho++;
		
	}

	@Override
	public TIPO excluirComeco() {
		// TODO Auto-generated method stub
		//VALIDACOES: 
		if (filaVazia()) {
			System.out.println("Impossivel excluir o elemento");
			return null;
		}
		No<TIPO> noRemovido = cabeça; 
		cabeça=cabeça.getProximoNo();
		noRemovido.setProximoNo(null);
		
		tamanho--;
		
		return noRemovido.getValor();
	}

	@Override
	public boolean filaVazia() {
		// TODO Auto-generated method stub
		return tamanho==0 ? true : false; 
	}

	@Override
	public void imprimirFila() {
		// TODO Auto-generated method stub
		//VALIDACOES: 
		if (filaVazia()) {
			System.out.println("Impossivel imprimir. Fila sem elementos");
			return; 
		}
		No<TIPO> auxiliar;
		auxiliar=cabeça;
		while(auxiliar!=null) {
			System.out.println("Elemento: "+auxiliar.getValor());
			auxiliar=auxiliar.getProximoNo();
		}
		
	}

}
