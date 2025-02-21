package fila;

public class fila_codigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila fila = new Fila();//nao passa tamanho, é objeto e nao vetor
		fila.adicionar("Joao");
		fila.adicionar("Zé");
		fila.adicionar("Juca");
		fila.adicionar("Maria");
		fila.adicionar("Ana");
		System.out.println(fila.get()); //Vai imprimir o primeiro
		fila.remover();
		System.out.println(fila.get());
		

	}

}
