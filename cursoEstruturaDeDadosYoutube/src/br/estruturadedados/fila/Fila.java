package br.estruturadedados.fila;

public class Fila implements TADfila {
	
	
	/*
	 * Na primeira fila, vamos usar alocaçao estatica de memoria definindo um vetor fila que, 
	 * como aceita o null, vai ser Integer: 
	 * 
	 */
	
	private Integer[] fila; 
	private int posicao; //Variavel de referencia pra fila
	
	private static final int TAMANHO =10; //Fixa 10 como tamanho inalteravel
	
	public Fila(int tamanho) {
		// TODO Auto-generated constructor stub
		//Criamos o vetor fila: 
		fila = new Integer[tamanho];
		posicao=-1;
	}
	
	
	

	@Override
	public void insereFinal(Integer valor) {
		// TODO Auto-generated method stub
		
		//Realizando validaçoes:
		if (filaCheia()) { //Se fila tiver cheia (return true)
			System.out.println("Fila cheia, nao é possivel inserir");
			return; //Encerra execuçao, uma alternativa ao else
		}
		fila[++posicao] = valor; //Caso nao esteja cheia, incrementa a posicao e recebe o valor

	}

	@Override
	public Integer removeComeco() {
		// TODO Auto-generated method stub
		
		//Validaçoes:
		if (filaVazia()) {
			System.out.println("Fila vazia, nao foi removido");
			return null; //precisa do null por ser integer
		} 
		//Backup do elemento removido:
		int elementoRemovido=fila[0];
		
		for (int i=0; i<posicao; i++) {
			 if (fila[i+1]==null) { //Se o elemento seguinte é null, passa para o proximo
				 fila[i+1]=fila[i+2];
				 return null; 
			 }
			
			fila[i]=fila[i+1];
		}
		fila[posicao]=null;
		--posicao; //Diminui uma posicao no tamanho da fila 
		return elementoRemovido;
	}

	@Override
	public boolean filaCheia() {
		if (posicao == fila.length-1) { //Se em um vetor com 5 posicoes (0 a 4) tiver apontando
			//pra posicao 4 (ultima), significa que ta cheia
			return true;
		}
		return false;
	}

	@Override
	public boolean filaVazia() {
		// TODO Auto-generated method stub
		if (posicao==-1) {
			return true;
		}
		
		//Alternativa de escrita: 
		//return posicao == -1 ? true : false 
		//Significa se a posicao ta no -1 retorna true, senao retorna false
		return false;
	}

	@Override
	public void imprimirFila() {
		// TODO Auto-generated method stub
		
		//Validaçoes: 
		if (filaVazia()) {
			System.out.println("A fila nao tem elementos.");
			return;
		}
		System.out.println("Elementos da fila: ");
		for (int i=0; i<=posicao; i++) { //Vai imprimir somente enquanto tiver elementos validos,
			//por isso, posicao e nao lenght
			System.out.print(fila[i]+"\t");
			
		}
		System.out.println();

	}

}
