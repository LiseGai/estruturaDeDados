package PilhaEncadeada;

public class TestePilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TADPilhaEncadeada pilha = new Pilha();
		
		pilha.imprimirPilha();
		
		pilha.adicionarTopo(10);
		pilha.adicionarTopo(3);
		pilha.adicionarTopo(20);
		pilha.adicionarTopo('a');
		pilha.imprimirPilha();
		
		System.out.println("Excluindo o topo");
		pilha.excluirTopo();
		pilha.imprimirPilha();

	}

}
