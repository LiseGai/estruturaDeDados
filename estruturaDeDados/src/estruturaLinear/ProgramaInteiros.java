package estruturaLinear;

public class ProgramaInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaEncadeada <Integer> numeros = new listaEncadeada<Integer>();
		numeros.Adicionar(3);
		numeros.Adicionar(4);
		numeros.Adicionar(10);
		numeros.Adicionar(20);
		for (int i=0; i<numeros.getTamanho(); i++) {
			System.out.println("Numero: "+numeros.get(i).getValor());
		}
		
		System.out.println("Removendo o 3");
		numeros.Remover(3);
		for (int i=0; i<numeros.getTamanho(); i++) {
			System.out.println("Numero: "+numeros.get(i).getValor());
		}
		
		System.out.println("Adicionando o 15");
		numeros.Adicionar(15);
		for (int i=0; i<numeros.getTamanho(); i++) {
			System.out.println("Numero: "+numeros.get(i).getValor());
		}
		System.out.println("Tamanho:"+numeros.getTamanho());

	}

}
