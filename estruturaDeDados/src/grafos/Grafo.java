package grafos;

import java.util.ArrayList;

public class Grafo<TIPO> {
	//Vai ser genérico e é composto por vértices e arestas
	private ArrayList<Vertice<TIPO>> vertices; 
	private ArrayList<Aresta<TIPO>> arestas;
	
	//Método construtor:
	public Grafo() {
		//Vamos inicializar os ArrayLists: 
		this.vertices=new ArrayList<Vertice <TIPO>>();
		this.arestas=new ArrayList<Aresta <TIPO>>();
	}
	
	//Precisa permitir que adicione Vertices, adicione arestas direcionadas e get: 
	
	public void adicionarVertice(TIPO dado) {
		Vertice <TIPO> novoVertice = new Vertice<TIPO>(dado); //Olhar qual valor que passa no
		//construtor da classe Vertice
		
		//Pra que ela entre no grafo:
		this.vertices.add(novoVertice);
	}
	
	public void adicionarAresta(Double peso, TIPO finalVertice, TIPO inicioVertice) {
		//Toda vez que for adicionar uma aresta a um vértice, vamos procurar se ele existe ou nao
		//Pra procurar o vértice, verificamos se o vértice de inicio e fim existem:
		//Procurando o vertice do inicio da aresta:
	    Vertice<TIPO> inicio = this.getVertice(inicioVertice);
	    Vertice<TIPO> fim = this.getVertice(finalVertice);
	    
	    //Garantia de que o vértice existe:
	    
	    if (inicio != null && fim != null) { // Certificar-se de que os vértices existem
	    	//Procurando o vertice do final da aresta:
			//Primeiro criamos uma aresta com os dados da classe Aresta pra ordem
	        Aresta<TIPO> aresta = new Aresta<>(peso, inicio, fim);
	        inicio.adicionarArestasSaida(aresta);
	        fim.adicionarArestasEntrada(aresta);
	        this.arestas.add(aresta);
	    } else {
	        System.out.println("Erro: Um ou ambos os vértices não foram encontrados.");
	    }
	}
	
	public Vertice<TIPO> getVertice(TIPO dado){
		//Pra encontrar o vértice no grafo e essa busca vai ser feita pelo dado
		
		Vertice<TIPO> vertice = null; 
		for(int i=0; i<this.vertices.size(); i++) {
			//Se o vertice na posiçao I tiver o valor igual ao dado, entao...
			if (this.vertices.get(i).getDado().equals(dado)) {
				//achou o dado pro valor que ta procurando: 
				vertice=this.vertices.get(i);
				break;
			}
		}
		return vertice;
	}
	
	//Busca em largura imprimindo os elementos do grafo
	public void buscaEmLargura() {
		//Vai marcar quais elementos ja visitados:
	    ArrayList<Vertice<TIPO>> marcados = new ArrayList<>();
	    ArrayList<Vertice<TIPO>> fila = new ArrayList<>();
		
		//Vamos pegar um vertice chamado atual e começar sempre pelo primeiro vértice do grafo
		Vertice<TIPO> atual = this.vertices.get(0);
		//Se ta começando pelo vertice do primeiro elemento, ja add na lista de marcados:
		marcados.add(atual);
		//E vamos imprimir o elemento atual:
		System.out.println(atual.getDado());
		//Vamos add na fila dos elementos que vao ser visitados:
		fila.add(atual);
		
		//Enquanto tem vertices na fila, ele vai visitando:
		while(fila.size()>0) {
			Vertice<TIPO> visitado = fila.get(0);
			
			//Visitar um vértice é percorrer as arestas de saida dele. Pra isso, em vértice, vamos
			//fazer o get set das arestas de entrada e saida
			for (int i=0; i<visitado.getArestasSaida().size();i++) {
				//Começamos a andar no grafo, pegando o vertice que ta no fim da aresta
				Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getVerticeFinal();
				//Vamos verificar se o vertice final nao foi ja visitado: 
				if (!marcados.contains(proximo)) { //Se a lista de marcados nao contém o proximo:
					marcados.add(proximo); //O proximo a ser visitado é ele
					System.out.println(proximo.getDado());
					//Vamos adicionar ele nos elementos que serao visitados:
					fila.add(proximo);
				}
			}
			
			//Finalizou o for, significa que passamos por todas arestas daquele vértice e podemos
			//remover ele:
			fila.remove(0);
		}
	}

}
