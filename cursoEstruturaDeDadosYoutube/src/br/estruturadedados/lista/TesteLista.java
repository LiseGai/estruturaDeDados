package br.estruturadedados.lista;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TADLista<Integer> lista = new Lista<Integer>(5);
		
		System.out.println("Imprimindo lista com inserçao sempre na primeira posicao");
		//Devera ficar: 3, 2, 1
		lista.insereValor(1, 0);
		lista.insereValor(2, 0);
		lista.insereValor(3, 0);
		lista.imprimirLista();
		
		System.out.println("Imprimindo lista com novo elemento em local diferente");
		//Devera ficar 3, 2, 1, 4
		lista.insereValor(4, 3);
		lista.imprimirLista();
		
		System.out.println("Removendo primeiro elemento");
		lista.excluiValor(0);
		lista.imprimirLista();
		//Devera ficar 2, 1, 4

	}

}
