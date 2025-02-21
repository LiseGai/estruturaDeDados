package br.estruturadedados.pilha;

public class testePilha {
	public static void main(String[] args) {
		TADPilhas pilhas = new Pilha(5);
		
		pilhas.adicionarTopo(10);
		pilhas.adicionarTopo(5);
		pilhas.adicionarTopo(1);
		pilhas.adicionarTopo(7);
		pilhas.adicionarTopo(20);
		
		pilhas.imprimirPilha();
		
		System.out.println("Removendo o topo 20");
		pilhas.removerTopo();
		pilhas.imprimirPilha();
	}

}
