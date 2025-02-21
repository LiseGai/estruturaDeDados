package estruturaLinear;

public class cadastroEstados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criando a lista de estados:
		listaEncadeada<String> lista = new listaEncadeada<String>();
		//Como ta vazia, ir em listaEncadeada criar o metodo construtor
		//System.out.println(lista.getTamanho());
		
		//Adicionando os estados à lista encadeada: 
		lista.Adicionar("RS");
		lista.Adicionar("SC");
		lista.Adicionar("PR");
		//O tamanho da lista vai continuar 0, porque o método adicionar
		//Ainda n foi feito 
		
		//Agora vamos mostrar o elemento da lista:
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		//O getPrimeiro é a bola onde o valor ta, precisa do getValor
		System.out.println("Ultimo: "+lista.getUltimo().getValor());
		System.out.println(lista.getTamanho());
		
		//Para os do meio se usa o método get no listaEncadeada:
		System.out.println("Posiçao 0: "+ lista.get(0).getValor());
		System.out.println("Posiçao 1: "+ lista.get(1).getValor());
		System.out.println("Posiçao 2: "+ lista.get(2).getValor());
		//get.(0) pega a bola e getValor() pega o valor dentro dela
		
		//Para remover, precisa guardar o anterior, porque o proximo do
		//anterior vai ser o proximo do atual: 
		System.out.println("Removendo o SC");
		lista.Remover("SC");
		//lista.Adicionar("SP");
		//lista.Remover("RS");
		//lista.Remover("PR");
		for (int i=0; i<lista.getTamanho(); i++) {
			System.out.println("Posiçao "+i+": "+lista.get(i).getValor());
		}
		
		//Agora vamos testar o genérico com um programa de inteiros:
		
	}

}
