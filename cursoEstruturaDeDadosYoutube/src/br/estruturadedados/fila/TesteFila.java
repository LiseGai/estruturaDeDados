package br.estruturadedados.fila;

public class TesteFila {
	public static void main(String[] args) {
		TADfila fila = new Fila(5);
		
		//Vamos tentar remover do inicio sem adicionar nada pra testar:
		fila.removeComeco();
		
		//Vamos adicionar 3 elementos: 
		fila.insereFinal(10);
		
		fila.insereFinal(4);
		
		fila.insereFinal(30);
		fila.imprimirFila();
		
		fila.removeComeco();
		fila.imprimirFila();
	}

}
