package br.estruturadedados.filaencadeada;

public class TesteFilaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TADFilaEncadeada<Integer> fila = new FilaLigada<Integer>();
		fila.imprimirFila();
		
		System.out.println("Imprimindo com valores: ");
		
		fila.inserirFinal(10);
		fila.imprimirFila();

	}

}
